
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
 * Unit test for the <code>ArInvdetailController</code> controller.
 *
 * @see org.o7planning.sbjsp.choishop.web.ArInvdetailController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/gen-security-context.xml",
		"file:./src/main/resources/gen-service-context.xml",
		"file:./src/main/resources/gen-dao-context.xml",
		"file:./src/main/resources/gen-web-context.xml" })
public class ArInvdetailControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>indexArInvdetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexArInvdetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexArInvdetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ArInvdetailController controller = (ArInvdetailController) context.getBean("ArInvdetailController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectArInvdetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectArInvdetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectArInvdetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ArInvdetailController controller = (ArInvdetailController) context.getBean("ArInvdetailController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editArInvdetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditArInvdetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editArInvdetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ArInvdetailController controller = (ArInvdetailController) context.getBean("ArInvdetailController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveArInvdetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveArInvdetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveArInvdetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ArInvdetailController controller = (ArInvdetailController) context.getBean("ArInvdetailController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newArInvdetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewArInvdetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newArInvdetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ArInvdetailController controller = (ArInvdetailController) context.getBean("ArInvdetailController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteArInvdetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteArInvdetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteArInvdetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ArInvdetailController controller = (ArInvdetailController) context.getBean("ArInvdetailController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteArInvdetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteArInvdetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteArInvdetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ArInvdetailController controller = (ArInvdetailController) context.getBean("ArInvdetailController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>arinvdetailControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetarinvdetailControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/arinvdetailController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ArInvdetailController controller = (ArInvdetailController) context.getBean("ArInvdetailController");

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