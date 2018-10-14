package org.o7planning.sbjsp.choishop.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.o7planning.sbjsp.choishop.dao.ProductMasterDAO;

import org.o7planning.sbjsp.choishop.domain.ProductMaster;

import org.o7planning.sbjsp.choishop.service.ProductMasterService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for ProductMaster entities
 * 
 */

@Controller("ProductMasterController")

public class ProductMasterController {

	/**
	 * DAO injected by Spring that manages ProductMaster entities
	 * 
	 */
	@Autowired
	private ProductMasterDAO productMasterDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for ProductMaster entities
	 * 
	 */
	@Autowired
	private ProductMasterService productMasterService;

	/**
	 * Show all ProductMaster entities
	 * 
	 */
	@RequestMapping("/indexProductMaster")
	public ModelAndView listProductMasters() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productmasters", productMasterService.loadProductMasters());

		mav.setViewName("productmaster/listProductMasters");

		return mav;
	}

	/**
	*/
	@RequestMapping("/productmasterController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	* Create a new ProductMaster entity
	* 
	*/
	@RequestMapping("/newProductMaster")
	public ModelAndView newProductMaster() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productmaster", new ProductMaster());
		mav.addObject("newFlag", true);
		mav.setViewName("productmaster/editProductMaster");

		return mav;
	}

	/**
	* Select an existing ProductMaster entity
	* 
	*/
	@RequestMapping("/selectProductMaster")
	public ModelAndView selectProductMaster(@RequestParam String codeKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productmaster", productMasterDAO.findProductMasterByPrimaryKey(codeKey));
		mav.setViewName("productmaster/viewProductMaster");

		return mav;
	}

	/**
	* Edit an existing ProductMaster entity
	* 
	*/
	@RequestMapping("/editProductMaster")
	public ModelAndView editProductMaster(@RequestParam String codeKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productmaster", productMasterDAO.findProductMasterByPrimaryKey(codeKey));
		mav.setViewName("productmaster/editProductMaster");

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
	* Save an existing ProductMaster entity
	* 
	*/
	@RequestMapping("/saveProductMaster")
	public String saveProductMaster(@ModelAttribute ProductMaster productmaster) {
		productMasterService.saveProductMaster(productmaster);
		return "forward:/indexProductMaster";
	}

	/**
	* Select the ProductMaster entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteProductMaster")
	public ModelAndView confirmDeleteProductMaster(@RequestParam String codeKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productmaster", productMasterDAO.findProductMasterByPrimaryKey(codeKey));
		mav.setViewName("productmaster/deleteProductMaster");

		return mav;
	}

	/**
	* Entry point to show all ProductMaster entities
	* 
	*/
	public String indexProductMaster() {
		return "redirect:/indexProductMaster";
	}

	/**
	* Delete an existing ProductMaster entity
	* 
	*/
	@RequestMapping("/deleteProductMaster")
	public String deleteProductMaster(@RequestParam String codeKey) {
		ProductMaster productmaster = productMasterDAO.findProductMasterByPrimaryKey(codeKey);
		productMasterService.deleteProductMaster(productmaster);
		return "forward:/indexProductMaster";
	}
}