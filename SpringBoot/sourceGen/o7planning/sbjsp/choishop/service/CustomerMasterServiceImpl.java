package org.o7planning.sbjsp.choishop.service;

import java.util.List;
import java.util.Set;

import org.o7planning.sbjsp.choishop.dao.CustomerMasterDAO;

import org.o7planning.sbjsp.choishop.domain.CustomerMaster;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for CustomerMaster entities
 * 
 */

@Service("CustomerMasterService")

@Transactional
public class CustomerMasterServiceImpl implements CustomerMasterService {

	/**
	 * DAO injected by Spring that manages CustomerMaster entities
	 * 
	 */
	@Autowired
	private CustomerMasterDAO customerMasterDAO;

	/**
	 * Instantiates a new CustomerMasterServiceImpl.
	 *
	 */
	public CustomerMasterServiceImpl() {
	}

	/**
	 * Load an existing CustomerMaster entity
	 * 
	 */
	@Transactional
	public Set<CustomerMaster> loadCustomerMasters() {
		return customerMasterDAO.findAllCustomerMasters();
	}

	/**
	 */
	@Transactional
	public CustomerMaster findCustomerMasterByPrimaryKey(String code) {
		return customerMasterDAO.findCustomerMasterByPrimaryKey(code);
	}

	/**
	 * Save an existing CustomerMaster entity
	 * 
	 */
	@Transactional
	public void saveCustomerMaster(CustomerMaster customermaster) {
		CustomerMaster existingCustomerMaster = customerMasterDAO.findCustomerMasterByPrimaryKey(customermaster.getCode());

		if (existingCustomerMaster != null) {
			if (existingCustomerMaster != customermaster) {
				existingCustomerMaster.setCode(customermaster.getCode());
				existingCustomerMaster.setName(customermaster.getName());
				existingCustomerMaster.setDescribeCustommer(customermaster.getDescribeCustommer());
				existingCustomerMaster.setLink(customermaster.getLink());
				existingCustomerMaster.setNote(customermaster.getNote());
			}
			customermaster = customerMasterDAO.store(existingCustomerMaster);
		} else {
			customermaster = customerMasterDAO.store(customermaster);
		}
		customerMasterDAO.flush();
	}

	/**
	 * Return all CustomerMaster entity
	 * 
	 */
	@Transactional
	public List<CustomerMaster> findAllCustomerMasters(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<CustomerMaster>(customerMasterDAO.findAllCustomerMasters(startResult, maxRows));
	}

	/**
	 * Return a count of all CustomerMaster entity
	 * 
	 */
	@Transactional
	public Integer countCustomerMasters() {
		return ((Long) customerMasterDAO.createQuerySingleResult("select count(o) from CustomerMaster o").getSingleResult()).intValue();
	}

	/**
	 * Delete an existing CustomerMaster entity
	 * 
	 */
	@Transactional
	public void deleteCustomerMaster(CustomerMaster customermaster) {
		customerMasterDAO.remove(customermaster);
		customerMasterDAO.flush();
	}
}
