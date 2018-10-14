package org.o7planning.sbjsp.choishop.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.o7planning.sbjsp.choishop.dao.ApInvdetailDAO;

import org.o7planning.sbjsp.choishop.domain.ApInvdetail;

import org.o7planning.sbjsp.choishop.service.ApInvdetailService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for ApInvdetail entities
 * 
 */

@Controller("ApInvdetailController")

public class ApInvdetailController {

	/**
	 * DAO injected by Spring that manages ApInvdetail entities
	 * 
	 */
	@Autowired
	private ApInvdetailDAO apInvdetailDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for ApInvdetail entities
	 * 
	 */
	@Autowired
	private ApInvdetailService apInvdetailService;

	/**
	 * Entry point to show all ApInvdetail entities
	 * 
	 */
	public String indexApInvdetail() {
		return "redirect:/indexApInvdetail";
	}

	/**
	* Show all ApInvdetail entities
	* 
	*/
	@RequestMapping("/indexApInvdetail")
	public ModelAndView listApInvdetails() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("apinvdetails", apInvdetailService.loadApInvdetails());

		mav.setViewName("apinvdetail/listApInvdetails.jsp");

		return mav;
	}

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
	* Create a new ApInvdetail entity
	* 
	*/
	@RequestMapping("/newApInvdetail")
	public ModelAndView newApInvdetail() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("apinvdetail", new ApInvdetail());
		mav.addObject("newFlag", true);
		mav.setViewName("apinvdetail/editApInvdetail.jsp");

		return mav;
	}

	/**
	* Select an existing ApInvdetail entity
	* 
	*/
	@RequestMapping("/selectApInvdetail")
	public ModelAndView selectApInvdetail(@RequestParam String codeKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("apinvdetail", apInvdetailDAO.findApInvdetailByPrimaryKey(codeKey));
		mav.setViewName("apinvdetail/viewApInvdetail.jsp");

		return mav;
	}

	/**
	*/
	@RequestMapping("/apinvdetailController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	* Delete an existing ApInvdetail entity
	* 
	*/
	@RequestMapping("/deleteApInvdetail")
	public String deleteApInvdetail(@RequestParam String codeKey) {
		ApInvdetail apinvdetail = apInvdetailDAO.findApInvdetailByPrimaryKey(codeKey);
		apInvdetailService.deleteApInvdetail(apinvdetail);
		return "forward:/indexApInvdetail";
	}

	/**
	* Edit an existing ApInvdetail entity
	* 
	*/
	@RequestMapping("/editApInvdetail")
	public ModelAndView editApInvdetail(@RequestParam String codeKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("apinvdetail", apInvdetailDAO.findApInvdetailByPrimaryKey(codeKey));
		mav.setViewName("apinvdetail/editApInvdetail.jsp");

		return mav;
	}

	/**
	* Save an existing ApInvdetail entity
	* 
	*/
	@RequestMapping("/saveApInvdetail")
	public String saveApInvdetail(@ModelAttribute ApInvdetail apinvdetail) {
		apInvdetailService.saveApInvdetail(apinvdetail);
		return "forward:/indexApInvdetail";
	}

	/**
	* Select the ApInvdetail entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteApInvdetail")
	public ModelAndView confirmDeleteApInvdetail(@RequestParam String codeKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("apinvdetail", apInvdetailDAO.findApInvdetailByPrimaryKey(codeKey));
		mav.setViewName("apinvdetail/deleteApInvdetail.jsp");

		return mav;
	}
}