package org.o7planning.sbjsp.choishop.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.o7planning.sbjsp.choishop.dao.ArInvdetailDAO;

import org.o7planning.sbjsp.choishop.domain.ArInvdetail;

import org.o7planning.sbjsp.choishop.service.ArInvdetailService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for ArInvdetail entities
 * 
 */

@Controller("ArInvdetailController")

public class ArInvdetailController {

	/**
	 * DAO injected by Spring that manages ArInvdetail entities
	 * 
	 */
	@Autowired
	private ArInvdetailDAO arInvdetailDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for ArInvdetail entities
	 * 
	 */
	@Autowired
	private ArInvdetailService arInvdetailService;

	/**
	 * Register custom, context-specific property editors
	 * 
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder, HttpServletRequest request) { // Register static property editors.
		binder.registerCustomEditor(java.util.Calendar.class, new org.skyway.spring.util.databinding.CustomCalendarEditor());
		binder.registerCustomEditor(byte[].class, new org.springframework.web.multipart.support.ByteArrayMultipartFileEditor());
		binder.registerCustomEditor(boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(false));
		binder.registerCustomEditor(Boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(true));
		binder.registerCustomEditor(java.math.BigDecimal.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(java.math.BigDecimal.class, true));
		binder.registerCustomEditor(Integer.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Integer.class, true));
		binder.registerCustomEditor(java.util.Date.class, new org.skyway.spring.util.databinding.CustomDateEditor());
		binder.registerCustomEditor(String.class, new org.skyway.spring.util.databinding.StringEditor());
		binder.registerCustomEditor(Long.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Long.class, true));
		binder.registerCustomEditor(Double.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Double.class, true));
	}

	/**
	* Delete an existing ArInvdetail entity
	* 
	*/
	@RequestMapping("/deleteArInvdetail")
	public String deleteArInvdetail(@RequestParam String codeKey) {
		ArInvdetail arinvdetail = arInvdetailDAO.findArInvdetailByPrimaryKey(codeKey);
		arInvdetailService.deleteArInvdetail(arinvdetail);
		return "forward:/indexArInvdetail";
	}

	/**
	* Save an existing ArInvdetail entity
	* 
	*/
	@RequestMapping("/saveArInvdetail")
	public String saveArInvdetail(@ModelAttribute ArInvdetail arinvdetail) {
		arInvdetailService.saveArInvdetail(arinvdetail);
		return "forward:/indexArInvdetail";
	}

	/**
	* Select the ArInvdetail entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteArInvdetail")
	public ModelAndView confirmDeleteArInvdetail(@RequestParam String codeKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("arinvdetail", arInvdetailDAO.findArInvdetailByPrimaryKey(codeKey));
		mav.setViewName("arinvdetail/deleteArInvdetail.jsp");

		return mav;
	}

	/**
	* Select an existing ArInvdetail entity
	* 
	*/
	@RequestMapping("/selectArInvdetail")
	public ModelAndView selectArInvdetail(@RequestParam String codeKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("arinvdetail", arInvdetailDAO.findArInvdetailByPrimaryKey(codeKey));
		mav.setViewName("arinvdetail/viewArInvdetail.jsp");

		return mav;
	}

	/**
	* Create a new ArInvdetail entity
	* 
	*/
	@RequestMapping("/newArInvdetail")
	public ModelAndView newArInvdetail() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("arinvdetail", new ArInvdetail());
		mav.addObject("newFlag", true);
		mav.setViewName("arinvdetail/editArInvdetail.jsp");

		return mav;
	}

	/**
	* Show all ArInvdetail entities
	* 
	*/
	@RequestMapping("/indexArInvdetail")
	public ModelAndView listArInvdetails() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("arinvdetails", arInvdetailService.loadArInvdetails());

		mav.setViewName("arinvdetail/listArInvdetails.jsp");

		return mav;
	}

	/**
	*/
	@RequestMapping("/arinvdetailController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	* Entry point to show all ArInvdetail entities
	* 
	*/
	public String indexArInvdetail() {
		return "redirect:/indexArInvdetail";
	}

	/**
	* Edit an existing ArInvdetail entity
	* 
	*/
	@RequestMapping("/editArInvdetail")
	public ModelAndView editArInvdetail(@RequestParam String codeKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("arinvdetail", arInvdetailDAO.findArInvdetailByPrimaryKey(codeKey));
		mav.setViewName("arinvdetail/editArInvdetail.jsp");

		return mav;
	}
}