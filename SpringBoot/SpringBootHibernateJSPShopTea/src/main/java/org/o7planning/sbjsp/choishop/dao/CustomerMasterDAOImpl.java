
package org.o7planning.sbjsp.choishop.dao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.o7planning.sbjsp.choishop.domain.CustomerMaster;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage CustomerMaster entities.
 * 
 */
@Repository("CustomerMasterDAO")

@Transactional
public class CustomerMasterDAOImpl extends AbstractJpaDao<CustomerMaster> implements CustomerMasterDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			CustomerMaster.class }));

	/**
	 * EntityManager injected by Spring for persistence unit org_postgresql_Driver
	 *
	 */
	@PersistenceContext(unitName = "org_postgresql_Driver")
	private EntityManager entityManager;

	/**
	 * Instantiates a new CustomerMasterDAOImpl
	 *
	 */
	public CustomerMasterDAOImpl() {
		super();
	}

	/**
	 * Get the entity manager that manages persistence unit 
	 *
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}

	/**
	 * Returns the set of entity classes managed by this DAO.
	 *
	 */
	public Set<Class<?>> getTypes() {
		return dataTypes;
	}

	/**
	 * JPQL Query - findCustomerMasterByNameContaining
	 *
	 */
	@Transactional
	public Set<CustomerMaster> findCustomerMasterByNameContaining(String name) throws DataAccessException {

		return findCustomerMasterByNameContaining(name, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerMasterByNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerMaster> findCustomerMasterByNameContaining(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerMasterByNameContaining", startResult, maxRows, name);
		return new LinkedHashSet<CustomerMaster>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerMasterByLink
	 *
	 */
	@Transactional
	public Set<CustomerMaster> findCustomerMasterByLink(String link) throws DataAccessException {

		return findCustomerMasterByLink(link, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerMasterByLink
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerMaster> findCustomerMasterByLink(String link, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerMasterByLink", startResult, maxRows, link);
		return new LinkedHashSet<CustomerMaster>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerMasterByNote
	 *
	 */
	@Transactional
	public Set<CustomerMaster> findCustomerMasterByNote(String note) throws DataAccessException {

		return findCustomerMasterByNote(note, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerMasterByNote
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerMaster> findCustomerMasterByNote(String note, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerMasterByNote", startResult, maxRows, note);
		return new LinkedHashSet<CustomerMaster>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerMasterByName
	 *
	 */
	@Transactional
	public Set<CustomerMaster> findCustomerMasterByName(String name) throws DataAccessException {

		return findCustomerMasterByName(name, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerMasterByName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerMaster> findCustomerMasterByName(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerMasterByName", startResult, maxRows, name);
		return new LinkedHashSet<CustomerMaster>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerMasterByCode
	 *
	 */
	@Transactional
	public CustomerMaster findCustomerMasterByCode(String code) throws DataAccessException {

		return findCustomerMasterByCode(code, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerMasterByCode
	 *
	 */

	@Transactional
	public CustomerMaster findCustomerMasterByCode(String code, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findCustomerMasterByCode", startResult, maxRows, code);
			return (org.o7planning.sbjsp.choishop.domain.CustomerMaster) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findCustomerMasterByDescribeCustommerContaining
	 *
	 */
	@Transactional
	public Set<CustomerMaster> findCustomerMasterByDescribeCustommerContaining(String describeCustommer) throws DataAccessException {

		return findCustomerMasterByDescribeCustommerContaining(describeCustommer, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerMasterByDescribeCustommerContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerMaster> findCustomerMasterByDescribeCustommerContaining(String describeCustommer, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerMasterByDescribeCustommerContaining", startResult, maxRows, describeCustommer);
		return new LinkedHashSet<CustomerMaster>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerMasterByDescribeCustommer
	 *
	 */
	@Transactional
	public Set<CustomerMaster> findCustomerMasterByDescribeCustommer(String describeCustommer) throws DataAccessException {

		return findCustomerMasterByDescribeCustommer(describeCustommer, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerMasterByDescribeCustommer
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerMaster> findCustomerMasterByDescribeCustommer(String describeCustommer, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerMasterByDescribeCustommer", startResult, maxRows, describeCustommer);
		return new LinkedHashSet<CustomerMaster>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerMasterByNoteContaining
	 *
	 */
	@Transactional
	public Set<CustomerMaster> findCustomerMasterByNoteContaining(String note) throws DataAccessException {

		return findCustomerMasterByNoteContaining(note, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerMasterByNoteContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerMaster> findCustomerMasterByNoteContaining(String note, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerMasterByNoteContaining", startResult, maxRows, note);
		return new LinkedHashSet<CustomerMaster>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerMasterByLinkContaining
	 *
	 */
	@Transactional
	public Set<CustomerMaster> findCustomerMasterByLinkContaining(String link) throws DataAccessException {

		return findCustomerMasterByLinkContaining(link, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerMasterByLinkContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerMaster> findCustomerMasterByLinkContaining(String link, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerMasterByLinkContaining", startResult, maxRows, link);
		return new LinkedHashSet<CustomerMaster>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllCustomerMasters
	 *
	 */
	@Transactional
	public Set<CustomerMaster> findAllCustomerMasters() throws DataAccessException {

		return findAllCustomerMasters(-1, -1);
	}

	/**
	 * JPQL Query - findAllCustomerMasters
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerMaster> findAllCustomerMasters(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllCustomerMasters", startResult, maxRows);
		return new LinkedHashSet<CustomerMaster>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerMasterByCodeContaining
	 *
	 */
	@Transactional
	public Set<CustomerMaster> findCustomerMasterByCodeContaining(String code) throws DataAccessException {

		return findCustomerMasterByCodeContaining(code, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerMasterByCodeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerMaster> findCustomerMasterByCodeContaining(String code, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerMasterByCodeContaining", startResult, maxRows, code);
		return new LinkedHashSet<CustomerMaster>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerMasterByPrimaryKey
	 *
	 */
	@Transactional
	public CustomerMaster findCustomerMasterByPrimaryKey(String code) throws DataAccessException {

		return findCustomerMasterByPrimaryKey(code, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerMasterByPrimaryKey
	 *
	 */

	@Transactional
	public CustomerMaster findCustomerMasterByPrimaryKey(String code, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findCustomerMasterByPrimaryKey", startResult, maxRows, code);
			return (org.o7planning.sbjsp.choishop.domain.CustomerMaster) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(CustomerMaster entity) {
		return true;
	}
}
