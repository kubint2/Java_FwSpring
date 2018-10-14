
package org.o7planning.sbjsp.choishop.service;

import java.util.List;
import java.util.Set;

import org.o7planning.sbjsp.choishop.domain.CustomerMaster;

/**
 * Spring service that handles CRUD requests for CustomerMaster entities
 * 
 */
public interface CustomerMasterService {

	/**
	* Load an existing CustomerMaster entity
	* 
	 */
	public Set<CustomerMaster> loadCustomerMasters();

	/**
	 */
	public CustomerMaster findCustomerMasterByPrimaryKey(String code);

	/**
	* Save an existing CustomerMaster entity
	* 
	 */
	public void saveCustomerMaster(CustomerMaster customermaster);

	/**
	* Return all CustomerMaster entity
	* 
	 */
	public List<CustomerMaster> findAllCustomerMasters(Integer startResult, Integer maxRows);

	/**
	* Return a count of all CustomerMaster entity
	* 
	 */
	public Integer countCustomerMasters();

	/**
	* Delete an existing CustomerMaster entity
	* 
	 */
	public void deleteCustomerMaster(CustomerMaster customermaster_1);
}