package org.o7planning.sbjsp.choishop.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.o7planning.sbjsp.choishop.dao.CustomerMasterDAO;

import org.o7planning.sbjsp.choishop.domain.CustomerMaster;

import org.o7planning.sbjsp.choishop.service.CustomerMasterService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for CustomerMaster entities
 * 
 */

@Controller("CustomerMasterController")

public class CustomerMasterController {

	/**
	 * DAO injected by Spring that manages CustomerMaster entities
	 * 
	 */
	@Autowired
	private CustomerMasterDAO customerMasterDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for CustomerMaster entities
	 * 
	 */
	@Autowired
	private CustomerMasterService customerMasterService;

	/**
	 */
	@RequestMapping("/customermasterController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
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
	* Entry point to show all CustomerMaster entities
	* 
	*/
	public String indexCustomerMaster() {
		return "redirect:/indexCustomerMaster";
	}

	/**
	* Select an existing CustomerMaster entity
	* 
	*/
	@RequestMapping("/selectCustomerMaster")
	public ModelAndView selectCustomerMaster(@RequestParam String codeKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("customermaster", customerMasterDAO.findCustomerMasterByPrimaryKey(codeKey));
		mav.setViewName("customermaster/viewCustomerMaster");

		return mav;
	}

	/**
	* Create a new CustomerMaster entity
	* 
	*/
	@RequestMapping("/newCustomerMaster")
	public ModelAndView newCustomerMaster() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("customermaster", new CustomerMaster());
		mav.addObject("newFlag", true);
		mav.setViewName("customermaster/editCustomerMaster");

		return mav;
	}

	/**
	* Edit an existing CustomerMaster entity
	* 
	*/
	@RequestMapping("/editCustomerMaster")
	public ModelAndView editCustomerMaster(@RequestParam String codeKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("customermaster", customerMasterDAO.findCustomerMasterByPrimaryKey(codeKey));
		mav.setViewName("customermaster/editCustomerMaster");

		return mav;
	}

	/**
	* Show all CustomerMaster entities
	* 
	*/
	@RequestMapping("/indexCustomerMaster")
	public ModelAndView listCustomerMasters() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("customermasters", customerMasterService.loadCustomerMasters());

		mav.setViewName("customermaster/listCustomerMasters");

		return mav;
	}

	/**
	* Select the CustomerMaster entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteCustomerMaster")
	public ModelAndView confirmDeleteCustomerMaster(@RequestParam String codeKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("customermaster", customerMasterDAO.findCustomerMasterByPrimaryKey(codeKey));
		mav.setViewName("customermaster/deleteCustomerMaster");

		return mav;
	}

	/**
	* Delete an existing CustomerMaster entity
	* 
	*/
	@RequestMapping("/deleteCustomerMaster")
	public String deleteCustomerMaster(@RequestParam String codeKey) {
		CustomerMaster customermaster = customerMasterDAO.findCustomerMasterByPrimaryKey(codeKey);
		customerMasterService.deleteCustomerMaster(customermaster);
		return "forward:/indexCustomerMaster";
	}

	/**
	* Save an existing CustomerMaster entity
	* 
	*/
	@RequestMapping("/saveCustomerMaster")
	public String saveCustomerMaster(@ModelAttribute CustomerMaster customermaster) {
		customerMasterService.saveCustomerMaster(customermaster);
		return "forward:/indexCustomerMaster";
	}
}