
package org.o7planning.sbjsp.choishop.service;

import java.util.List;
import java.util.Set;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.o7planning.sbjsp.choishop.domain.ApInvdetail;

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
public class ApInvdetailServiceTest {

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
	protected ApInvdetailService service;

	/**
	 * Instantiates a new ApInvdetailServiceTest.
	 *
	 */
	public ApInvdetailServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Save an existing ApInvdetail entity
	* 
	 */
	@Test
	public void saveApInvdetail() {
		// TODO: JUnit - Populate test inputs for operation: saveApInvdetail 
		ApInvdetail apinvdetail = new org.o7planning.sbjsp.choishop.domain.ApInvdetail();
		service.saveApInvdetail(apinvdetail);
	}

	/**
	 * Operation Unit Test
	* Return all ApInvdetail entity
	* 
	 */
	@Test
	public void findAllApInvdetails() {
		// TODO: JUnit - Populate test inputs for operation: findAllApInvdetails 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<ApInvdetail> response = null;
		response = service.findAllApInvdetails(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllApInvdetails
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findApInvdetailByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findApInvdetailByPrimaryKey 
		String code = null;
		ApInvdetail response = null;
		response = service.findApInvdetailByPrimaryKey(code);
		// TODO: JUnit - Add assertions to test outputs of operation: findApInvdetailByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Return a count of all ApInvdetail entity
	* 
	 */
	@Test
	public void countApInvdetails() {
		Integer response = null;
		response = service.countApInvdetails();
		// TODO: JUnit - Add assertions to test outputs of operation: countApInvdetails
	}

	/**
	 * Operation Unit Test
	* Load an existing ApInvdetail entity
	* 
	 */
	@Test
	public void loadApInvdetails() {
		Set<ApInvdetail> response = null;
		response = service.loadApInvdetails();
		// TODO: JUnit - Add assertions to test outputs of operation: loadApInvdetails
	}

	/**
	 * Operation Unit Test
	* Delete an existing ApInvdetail entity
	* 
	 */
	@Test
	public void deleteApInvdetail() {
		// TODO: JUnit - Populate test inputs for operation: deleteApInvdetail 
		ApInvdetail apinvdetail_1 = new org.o7planning.sbjsp.choishop.domain.ApInvdetail();
		service.deleteApInvdetail(apinvdetail_1);
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
