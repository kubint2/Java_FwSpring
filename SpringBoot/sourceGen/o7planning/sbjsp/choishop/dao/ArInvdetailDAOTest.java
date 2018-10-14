
package org.o7planning.sbjsp.choishop.dao;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.o7planning.sbjsp.choishop.domain.ArInvdetail;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.annotation.Rollback;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;

import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import org.springframework.transaction.annotation.Transactional;

/**
 * Class used to test the basic Data Store Functionality
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners({
		DependencyInjectionTestExecutionListener.class,
		DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class })
@Transactional
@ContextConfiguration(locations = {
		"file:./src/main/resources/gen-security-context.xml",
		"file:./src/main/resources/gen-service-context.xml",
		"file:./src/main/resources/gen-dao-context.xml",
		"file:./src/main/resources/gen-web-context.xml" })
public class ArInvdetailDAOTest {
	/**
	 * The DAO being tested, injected by Spring
	 *
	 */
	private ArInvdetailDAO dataStore;

	/**
	 * Instantiates a new ArInvdetailDAOTest.
	 *
	 */
	public ArInvdetailDAOTest() {
	}

	/**
	* Method to test ArInvdetail domain object.
	*
	*/
	@Rollback(false)
	@Test
	public void ArInvdetail() {
		ArInvdetail instance = new ArInvdetail();

		// Test create				
		// TODO: Populate instance for create.  The store will fail if the primary key fields are blank.				

		// store the object
		dataStore.store(instance);

		// Test update
		// TODO: Modify non-key domain object values for update

		// update the object
		dataStore.store(instance);

		// Test delete
		dataStore.remove(instance);

	}

	/**
	 * Method to allow Spring to inject the DAO that will be tested
	 *
	*/
	@Autowired
	public void setDataStore(ArInvdetailDAO dataStore) {
		this.dataStore = dataStore;
	}
}
