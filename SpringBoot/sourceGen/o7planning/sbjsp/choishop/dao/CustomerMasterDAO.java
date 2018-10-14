
package org.o7planning.sbjsp.choishop.dao;

import java.util.Set;

import org.o7planning.sbjsp.choishop.domain.CustomerMaster;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage CustomerMaster entities.
 * 
 */
public interface CustomerMasterDAO extends JpaDao<CustomerMaster> {

	/**
	 * JPQL Query - findCustomerMasterByNameContaining
	 *
	 */
	public Set<CustomerMaster> findCustomerMasterByNameContaining(String name) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerMasterByNameContaining
	 *
	 */
	public Set<CustomerMaster> findCustomerMasterByNameContaining(String name, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerMasterByLink
	 *
	 */
	public Set<CustomerMaster> findCustomerMasterByLink(String link) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerMasterByLink
	 *
	 */
	public Set<CustomerMaster> findCustomerMasterByLink(String link, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerMasterByNote
	 *
	 */
	public Set<CustomerMaster> findCustomerMasterByNote(String note) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerMasterByNote
	 *
	 */
	public Set<CustomerMaster> findCustomerMasterByNote(String note, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerMasterByName
	 *
	 */
	public Set<CustomerMaster> findCustomerMasterByName(String name_1) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerMasterByName
	 *
	 */
	public Set<CustomerMaster> findCustomerMasterByName(String name_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerMasterByCode
	 *
	 */
	public CustomerMaster findCustomerMasterByCode(String code) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerMasterByCode
	 *
	 */
	public CustomerMaster findCustomerMasterByCode(String code, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerMasterByDescribeCustommerContaining
	 *
	 */
	public Set<CustomerMaster> findCustomerMasterByDescribeCustommerContaining(String describeCustommer) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerMasterByDescribeCustommerContaining
	 *
	 */
	public Set<CustomerMaster> findCustomerMasterByDescribeCustommerContaining(String describeCustommer, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerMasterByDescribeCustommer
	 *
	 */
	public Set<CustomerMaster> findCustomerMasterByDescribeCustommer(String describeCustommer_1) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerMasterByDescribeCustommer
	 *
	 */
	public Set<CustomerMaster> findCustomerMasterByDescribeCustommer(String describeCustommer_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerMasterByNoteContaining
	 *
	 */
	public Set<CustomerMaster> findCustomerMasterByNoteContaining(String note_1) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerMasterByNoteContaining
	 *
	 */
	public Set<CustomerMaster> findCustomerMasterByNoteContaining(String note_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerMasterByLinkContaining
	 *
	 */
	public Set<CustomerMaster> findCustomerMasterByLinkContaining(String link_1) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerMasterByLinkContaining
	 *
	 */
	public Set<CustomerMaster> findCustomerMasterByLinkContaining(String link_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllCustomerMasters
	 *
	 */
	public Set<CustomerMaster> findAllCustomerMasters() throws DataAccessException;

	/**
	 * JPQL Query - findAllCustomerMasters
	 *
	 */
	public Set<CustomerMaster> findAllCustomerMasters(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerMasterByCodeContaining
	 *
	 */
	public Set<CustomerMaster> findCustomerMasterByCodeContaining(String code_1) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerMasterByCodeContaining
	 *
	 */
	public Set<CustomerMaster> findCustomerMasterByCodeContaining(String code_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerMasterByPrimaryKey
	 *
	 */
	public CustomerMaster findCustomerMasterByPrimaryKey(String code_2) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerMasterByPrimaryKey
	 *
	 */
	public CustomerMaster findCustomerMasterByPrimaryKey(String code_2, int startResult, int maxRows) throws DataAccessException;

}