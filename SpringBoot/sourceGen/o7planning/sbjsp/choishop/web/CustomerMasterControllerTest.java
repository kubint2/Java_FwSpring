
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
 * Unit test for the <code>CustomerMasterController</code> controller.
 *
 * @see org.o7planning.sbjsp.choishop.web.CustomerMasterController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/gen-security-context.xml",
		"file:./src/main/resources/gen-service-context.xml",
		"file:./src/main/resources/gen-dao-context.xml",
		"file:./src/main/resources/gen-web-context.xml" })
public class CustomerMasterControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>indexCustomerMaster()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexCustomerMaster() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexCustomerMaster");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerMasterController controller = (CustomerMasterController) context.getBean("CustomerMasterController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectCustomerMaster()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectCustomerMaster() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectCustomerMaster");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerMasterController controller = (CustomerMasterController) context.getBean("CustomerMasterController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editCustomerMaster()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditCustomerMaster() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editCustomerMaster");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerMasterController controller = (CustomerMasterController) context.getBean("CustomerMasterController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveCustomerMaster()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveCustomerMaster() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveCustomerMaster");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerMasterController controller = (CustomerMasterController) context.getBean("CustomerMasterController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newCustomerMaster()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewCustomerMaster() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newCustomerMaster");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerMasterController controller = (CustomerMasterController) context.getBean("CustomerMasterController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteCustomerMaster()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteCustomerMaster() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteCustomerMaster");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerMasterController controller = (CustomerMasterController) context.getBean("CustomerMasterController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteCustomerMaster()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteCustomerMaster() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteCustomerMaster");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerMasterController controller = (CustomerMasterController) context.getBean("CustomerMasterController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>customermasterControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetcustomermasterControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/customermasterController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerMasterController controller = (CustomerMasterController) context.getBean("CustomerMasterController");

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