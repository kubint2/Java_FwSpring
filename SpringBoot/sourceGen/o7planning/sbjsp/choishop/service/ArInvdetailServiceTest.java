
package org.o7planning.sbjsp.choishop.service;

import java.util.List;
import java.util.Set;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.o7planning.sbjsp.choishop.domain.ArInvdetail;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.mock.web.MockHttpServletRequest;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;

import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.SessionScope;

/**
 * Class to run the service as a JUnit test. Each operation in the service is a separate test.
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners({
		DependencyInjectionTestExecutionListener.class,
		DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class })
@ContextConfiguration(locations = {
		"file:./src/main/resources/gen-security-context.xml",
		"file:./src/main/resources/gen-service-context.xml",
		"file:./src/main/resources/gen-dao-context.xml",
		"file:./src/main/resources/gen-web-context.xml" })
@Transactional
public class ArInvdetailServiceTest {

	/**
	 * The Spring application context.
	 *
	 */
	@SuppressWarnings("unused")
	private ApplicationContext context;

	/**
	 * The service being tested, injected by Spring.
	 *
	 */
	@Autowired
	protected ArInvdetailService service;

	/**
	 * Instantiates a new ArInvdetailServiceTest.
	 *
	 */
	public ArInvdetailServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Return a count of all ArInvdetail entity
	* 
	 */
	@Test
	public void countArInvdetails() {
		Integer response = null;
		response = service.countArInvdetails();
		// TODO: JUnit - Add assertions to test outputs of operation: countArInvdetails
	}

	/**
	 * Operation Unit Test
	* Return all ArInvdetail entity
	* 
	 */
	@Test
	public void findAllArInvdetails() {
		// TODO: JUnit - Populate test inputs for operation: findAllArInvdetails 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<ArInvdetail> response = null;
		response = service.findAllArInvdetails(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllArInvdetails
	}

	/**
	 * Operation Unit Test
	* Save an existing ArInvdetail entity
	* 
	 */
	@Test
	public void saveArInvdetail() {
		// TODO: JUnit - Populate test inputs for operation: saveArInvdetail 
		ArInvdetail arinvdetail = new org.o7planning.sbjsp.choishop.domain.ArInvdetail();
		service.saveArInvdetail(arinvdetail);
	}

	/**
	 * Operation Unit Test
	* Load an existing ArInvdetail entity
	* 
	 */
	@Test
	public void loadArInvdetails() {
		Set<ArInvdetail> response = null;
		response = service.loadArInvdetails();
		// TODO: JUnit - Add assertions to test outputs of operation: loadArInvdetails
	}

	/**
	 * Operation Unit Test
	* Delete an existing ArInvdetail entity
	* 
	 */
	@Test
	public void deleteArInvdetail() {
		// TODO: JUnit - Populate test inputs for operation: deleteArInvdetail 
		ArInvdetail arinvdetail_1 = new org.o7planning.sbjsp.choishop.domain.ArInvdetail();
		service.deleteArInvdetail(arinvdetail_1);
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findArInvdetailByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findArInvdetailByPrimaryKey 
		String code = null;
		ArInvdetail response = null;
		response = service.findArInvdetailByPrimaryKey(code);
		// TODO: JUnit - Add assertions to test outputs of operation: findArInvdetailByPrimaryKey
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
	 * Sets Up the Request context
	 *
	 */
	private void setupRequestContext() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
	}
}
