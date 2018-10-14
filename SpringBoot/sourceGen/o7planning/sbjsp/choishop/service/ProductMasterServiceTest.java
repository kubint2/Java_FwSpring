
package org.o7planning.sbjsp.choishop.service;

import java.util.List;
import java.util.Set;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.o7planning.sbjsp.choishop.domain.ProductMaster;

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
public class ProductMasterServiceTest {

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
	protected ProductMasterService service;

	/**
	 * Instantiates a new ProductMasterServiceTest.
	 *
	 */
	public ProductMasterServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Return all ProductMaster entity
	* 
	 */
	@Test
	public void findAllProductMasters() {
		// TODO: JUnit - Populate test inputs for operation: findAllProductMasters 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<ProductMaster> response = null;
		response = service.findAllProductMasters(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllProductMasters
	}

	/**
	 * Operation Unit Test
	* Delete an existing ProductMaster entity
	* 
	 */
	@Test
	public void deleteProductMaster() {
		// TODO: JUnit - Populate test inputs for operation: deleteProductMaster 
		ProductMaster productmaster = new org.o7planning.sbjsp.choishop.domain.ProductMaster();
		service.deleteProductMaster(productmaster);
	}

	/**
	 * Operation Unit Test
	* Load an existing ProductMaster entity
	* 
	 */
	@Test
	public void loadProductMasters() {
		Set<ProductMaster> response = null;
		response = service.loadProductMasters();
		// TODO: JUnit - Add assertions to test outputs of operation: loadProductMasters
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findProductMasterByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findProductMasterByPrimaryKey 
		String code = null;
		ProductMaster response = null;
		response = service.findProductMasterByPrimaryKey(code);
		// TODO: JUnit - Add assertions to test outputs of operation: findProductMasterByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Return a count of all ProductMaster entity
	* 
	 */
	@Test
	public void countProductMasters() {
		Integer response = null;
		response = service.countProductMasters();
		// TODO: JUnit - Add assertions to test outputs of operation: countProductMasters
	}

	/**
	 * Operation Unit Test
	* Save an existing ProductMaster entity
	* 
	 */
	@Test
	public void saveProductMaster() {
		// TODO: JUnit - Populate test inputs for operation: saveProductMaster 
		ProductMaster productmaster_1 = new org.o7planning.sbjsp.choishop.domain.ProductMaster();
		service.saveProductMaster(productmaster_1);
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
