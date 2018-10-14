
package org.o7planning.sbjsp.choishop.web;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import org.springframework.test.context.ContextConfiguration;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.SessionScope;

/**
 * Unit test for the <code>ProductMasterController</code> controller.
 *
 * @see org.o7planning.sbjsp.choishop.web.ProductMasterController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/gen-security-context.xml",
		"file:./src/main/resources/gen-service-context.xml",
		"file:./src/main/resources/gen-dao-context.xml",
		"file:./src/main/resources/gen-web-context.xml" })
public class ProductMasterControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>indexProductMaster()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexProductMaster() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexProductMaster");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductMasterController controller = (ProductMasterController) context.getBean("ProductMasterController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProductMaster()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProductMaster() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProductMaster");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductMasterController controller = (ProductMasterController) context.getBean("ProductMasterController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editProductMaster()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProductMaster() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProductMaster");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductMasterController controller = (ProductMasterController) context.getBean("ProductMasterController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProductMaster()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProductMaster() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProductMaster");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductMasterController controller = (ProductMasterController) context.getBean("ProductMasterController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProductMaster()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProductMaster() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProductMaster");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductMasterController controller = (ProductMasterController) context.getBean("ProductMasterController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProductMaster()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProductMaster() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProductMaster");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductMasterController controller = (ProductMasterController) context.getBean("ProductMasterController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProductMaster()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProductMaster() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProductMaster");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductMasterController controller = (ProductMasterController) context.getBean("ProductMasterController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>productmasterControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetproductmasterControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/productmasterController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductMasterController controller = (ProductMasterController) context.getBean("ProductMasterController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Autowired to set the Spring application context.
	 *
	 */
	@Autowired
	public void setContext(ApplicationContext context) {
		this.context = context;
		((DefaultListableBeanFactory) context.getAutowireCapableBeanFactory()).registerScope("session", new SessionScope());
		((DefaultListableBeanFactory) context.getAutowireCapableBeanFactory()).registerScope("request", new RequestScope());
	}

	/**
	 * Returns a mock HttpServletRequest object.
	 *
	 */
	private MockHttpServletRequest getMockHttpServletRequest() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
		return request;
	}

	/**
	 * Returns a mock HttpServletResponse object.
	 *
	 */
	private MockHttpServletResponse getMockHttpServletResponse() {
		return new MockHttpServletResponse();
	}
}