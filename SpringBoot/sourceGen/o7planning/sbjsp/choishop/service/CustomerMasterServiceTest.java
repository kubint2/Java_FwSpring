
package org.o7planning.sbjsp.choishop.service;

import java.util.List;
import java.util.Set;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.o7planning.sbjsp.choishop.domain.CustomerMaster;

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
public class CustomerMasterServiceTest {

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
	protected CustomerMasterService service;

	/**
	 * Instantiates a new CustomerMasterServiceTest.
	 *
	 */
	public CustomerMasterServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Load an existing CustomerMaster entity
	* 
	 */
	@Test
	public void loadCustomerMasters() {
		Set<CustomerMaster> response = null;
		response = service.loadCustomerMasters();
		// TODO: JUnit - Add assertions to test outputs of operation: loadCustomerMasters
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findCustomerMasterByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findCustomerMasterByPrimaryKey 
		String code = null;
		CustomerMaster response = null;
		response = service.findCustomerMasterByPrimaryKey(code);
		// TODO: JUnit - Add assertions to test outputs of operation: findCustomerMasterByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Save an existing CustomerMaster entity
	* 
	 */
	@Test
	public void saveCustomerMaster() {
		// TODO: JUnit - Populate test inputs for operation: saveCustomerMaster 
		CustomerMaster customermaster = new org.o7planning.sbjsp.choishop.domain.CustomerMaster();
		service.saveCustomerMaster(customermaster);
	}

	/**
	 * Operation Unit Test
	* Return all CustomerMaster entity
	* 
	 */
	@Test
	public void findAllCustomerMasters() {
		// TODO: JUnit - Populate test inputs for operation: findAllCustomerMasters 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<CustomerMaster> response = null;
		response = service.findAllCustomerMasters(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllCustomerMasters
	}

	/**
	 * Operation Unit Test
	* Return a count of all CustomerMaster entity
	* 
	 */
	@Test
	public void countCustomerMasters() {
		Integer response = null;
		response = service.countCustomerMasters();
		// TODO: JUnit - Add assertions to test outputs of operation: countCustomerMasters
	}

	/**
	 * Operation Unit Test
	* Delete an existing CustomerMaster entity
	* 
	 */
	@Test
	public void deleteCustomerMaster() {
		// TODO: JUnit - Populate test inputs for operation: deleteCustomerMaster 
		CustomerMaster customermaster_1 = new org.o7planning.sbjsp.choishop.domain.CustomerMaster();
		service.deleteCustomerMaster(customermaster_1);
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
