
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
 * Unit test for the <code>ApInvdetailController</code> controller.
 *
 * @see org.o7planning.sbjsp.choishop.web.ApInvdetailController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/gen-security-context.xml",
		"file:./src/main/resources/gen-service-context.xml",
		"file:./src/main/resources/gen-dao-context.xml",
		"file:./src/main/resources/gen-web-context.xml" })
public class ApInvdetailControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>indexApInvdetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexApInvdetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexApInvdetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ApInvdetailController controller = (ApInvdetailController) context.getBean("ApInvdetailController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectApInvdetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectApInvdetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectApInvdetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ApInvdetailController controller = (ApInvdetailController) context.getBean("ApInvdetailController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editApInvdetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditApInvdetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editApInvdetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ApInvdetailController controller = (ApInvdetailController) context.getBean("ApInvdetailController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveApInvdetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveApInvdetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveApInvdetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ApInvdetailController controller = (ApInvdetailController) context.getBean("ApInvdetailController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newApInvdetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewApInvdetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newApInvdetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ApInvdetailController controller = (ApInvdetailController) context.getBean("ApInvdetailController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteApInvdetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteApInvdetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteApInvdetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ApInvdetailController controller = (ApInvdetailController) context.getBean("ApInvdetailController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteApInvdetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteApInvdetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteApInvdetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ApInvdetailController controller = (ApInvdetailController) context.getBean("ApInvdetailController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>apinvdetailControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetapinvdetailControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/apinvdetailController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ApInvdetailController controller = (ApInvdetailController) context.getBean("ApInvdetailController");

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