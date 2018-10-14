
package org.o7planning.sbjsp.choishop.dao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.o7planning.sbjsp.choishop.domain.ArInvdetail;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage ArInvdetail entities.
 * 
 */
@Repository("ArInvdetailDAO")

@Transactional
public class ArInvdetailDAOImpl extends AbstractJpaDao<ArInvdetail> implements ArInvdetailDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			ArInvdetail.class }));

	/**
	 * EntityManager injected by Spring for persistence unit org_postgresql_Driver
	 *
	 */
	@PersistenceContext(unitName = "org_postgresql_Driver")
	private EntityManager entityManager;

	/**
	 * Instantiates a new ArInvdetailDAOImpl
	 *
	 */
	public ArInvdetailDAOImpl() {
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
	 * JPQL Query - findArInvdetailByCodeContaining
	 *
	 */
	@Transactional
	public Set<ArInvdetail> findArInvdetailByCodeContaining(String code) throws DataAccessException {

		return findArInvdetailByCodeContaining(code, -1, -1);
	}

	/**
	 * JPQL Query - findArInvdetailByCodeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ArInvdetail> findArInvdetailByCodeContaining(String code, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findArInvdetailByCodeContaining", startResult, maxRows, code);
		return new LinkedHashSet<ArInvdetail>(query.getResultList());
	}

	/**
	 * JPQL Query - findArInvdetailByCodeProductContaining
	 *
	 */
	@Transactional
	public Set<ArInvdetail> findArInvdetailByCodeProductContaining(String codeProduct) throws DataAccessException {

		return findArInvdetailByCodeProductContaining(codeProduct, -1, -1);
	}

	/**
	 * JPQL Query - findArInvdetailByCodeProductContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ArInvdetail> findArInvdetailByCodeProductContaining(String codeProduct, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findArInvdetailByCodeProductContaining", startResult, maxRows, codeProduct);
		return new LinkedHashSet<ArInvdetail>(query.getResultList());
	}

	/**
	 * JPQL Query - findArInvdetailBySumPriceExp
	 *
	 */
	@Transactional
	public Set<ArInvdetail> findArInvdetailBySumPriceExp(Integer sumPriceExp) throws DataAccessException {

		return findArInvdetailBySumPriceExp(sumPriceExp, -1, -1);
	}

	/**
	 * JPQL Query - findArInvdetailBySumPriceExp
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ArInvdetail> findArInvdetailBySumPriceExp(Integer sumPriceExp, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findArInvdetailBySumPriceExp", startResult, maxRows, sumPriceExp);
		return new LinkedHashSet<ArInvdetail>(query.getResultList());
	}

	/**
	 * JPQL Query - findArInvdetailByCodeCustomer
	 *
	 */
	@Transactional
	public Set<ArInvdetail> findArInvdetailByCodeCustomer(String codeCustomer) throws DataAccessException {

		return findArInvdetailByCodeCustomer(codeCustomer, -1, -1);
	}

	/**
	 * JPQL Query - findArInvdetailByCodeCustomer
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ArInvdetail> findArInvdetailByCodeCustomer(String codeCustomer, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findArInvdetailByCodeCustomer", startResult, maxRows, codeCustomer);
		return new LinkedHashSet<ArInvdetail>(query.getResultList());
	}

	/**
	 * JPQL Query - findArInvdetailByPrimaryKey
	 *
	 */
	@Transactional
	public ArInvdetail findArInvdetailByPrimaryKey(String code) throws DataAccessException {

		return findArInvdetailByPrimaryKey(code, -1, -1);
	}

	/**
	 * JPQL Query - findArInvdetailByPrimaryKey
	 *
	 */

	@Transactional
	public ArInvdetail findArInvdetailByPrimaryKey(String code, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findArInvdetailByPrimaryKey", startResult, maxRows, code);
			return (org.o7planning.sbjsp.choishop.domain.ArInvdetail) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findArInvdetailByNoteContaining
	 *
	 */
	@Transactional
	public Set<ArInvdetail> findArInvdetailByNoteContaining(String note) throws DataAccessException {

		return findArInvdetailByNoteContaining(note, -1, -1);
	}

	/**
	 * JPQL Query - findArInvdetailByNoteContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ArInvdetail> findArInvdetailByNoteContaining(String note, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findArInvdetailByNoteContaining", startResult, maxRows, note);
		return new LinkedHashSet<ArInvdetail>(query.getResultList());
	}

	/**
	 * JPQL Query - findArInvdetailByNote
	 *
	 */
	@Transactional
	public Set<ArInvdetail> findArInvdetailByNote(String note) throws DataAccessException {

		return findArInvdetailByNote(note, -1, -1);
	}

	/**
	 * JPQL Query - findArInvdetailByNote
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ArInvdetail> findArInvdetailByNote(String note, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findArInvdetailByNote", startResult, maxRows, note);
		return new LinkedHashSet<ArInvdetail>(query.getResultList());
	}

	/**
	 * JPQL Query - findArInvdetailByCodeCustomerContaining
	 *
	 */
	@Transactional
	public Set<ArInvdetail> findArInvdetailByCodeCustomerContaining(String codeCustomer) throws DataAccessException {

		return findArInvdetailByCodeCustomerContaining(codeCustomer, -1, -1);
	}

	/**
	 * JPQL Query - findArInvdetailByCodeCustomerContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ArInvdetail> findArInvdetailByCodeCustomerContaining(String codeCustomer, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findArInvdetailByCodeCustomerContaining", startResult, maxRows, codeCustomer);
		return new LinkedHashSet<ArInvdetail>(query.getResultList());
	}

	/**
	 * JPQL Query - findArInvdetailByPriceUnitTransport
	 *
	 */
	@Transactional
	public Set<ArInvdetail> findArInvdetailByPriceUnitTransport(Integer priceUnitTransport) throws DataAccessException {

		return findArInvdetailByPriceUnitTransport(priceUnitTransport, -1, -1);
	}

	/**
	 * JPQL Query - findArInvdetailByPriceUnitTransport
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ArInvdetail> findArInvdetailByPriceUnitTransport(Integer priceUnitTransport, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findArInvdetailByPriceUnitTransport", startResult, maxRows, priceUnitTransport);
		return new LinkedHashSet<ArInvdetail>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllArInvdetails
	 *
	 */
	@Transactional
	public Set<ArInvdetail> findAllArInvdetails() throws DataAccessException {

		return findAllArInvdetails(-1, -1);
	}

	/**
	 * JPQL Query - findAllArInvdetails
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ArInvdetail> findAllArInvdetails(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllArInvdetails", startResult, maxRows);
		return new LinkedHashSet<ArInvdetail>(query.getResultList());
	}

	/**
	 * JPQL Query - findArInvdetailByCountProductExp
	 *
	 */
	@Transactional
	public Set<ArInvdetail> findArInvdetailByCountProductExp(Integer countProductExp) throws DataAccessException {

		return findArInvdetailByCountProductExp(countProductExp, -1, -1);
	}

	/**
	 * JPQL Query - findArInvdetailByCountProductExp
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ArInvdetail> findArInvdetailByCountProductExp(Integer countProductExp, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findArInvdetailByCountProductExp", startResult, maxRows, countProductExp);
		return new LinkedHashSet<ArInvdetail>(query.getResultList());
	}

	/**
	 * JPQL Query - findArInvdetailByPriceUnitOther
	 *
	 */
	@Transactional
	public Set<ArInvdetail> findArInvdetailByPriceUnitOther(Integer priceUnitOther) throws DataAccessException {

		return findArInvdetailByPriceUnitOther(priceUnitOther, -1, -1);
	}

	/**
	 * JPQL Query - findArInvdetailByPriceUnitOther
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ArInvdetail> findArInvdetailByPriceUnitOther(Integer priceUnitOther, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findArInvdetailByPriceUnitOther", startResult, maxRows, priceUnitOther);
		return new LinkedHashSet<ArInvdetail>(query.getResultList());
	}

	/**
	 * JPQL Query - findArInvdetailByPriceUnitExp
	 *
	 */
	@Transactional
	public Set<ArInvdetail> findArInvdetailByPriceUnitExp(Integer priceUnitExp) throws DataAccessException {

		return findArInvdetailByPriceUnitExp(priceUnitExp, -1, -1);
	}

	/**
	 * JPQL Query - findArInvdetailByPriceUnitExp
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ArInvdetail> findArInvdetailByPriceUnitExp(Integer priceUnitExp, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findArInvdetailByPriceUnitExp", startResult, maxRows, priceUnitExp);
		return new LinkedHashSet<ArInvdetail>(query.getResultList());
	}

	/**
	 * JPQL Query - findArInvdetailByCode
	 *
	 */
	@Transactional
	public ArInvdetail findArInvdetailByCode(String code) throws DataAccessException {

		return findArInvdetailByCode(code, -1, -1);
	}

	/**
	 * JPQL Query - findArInvdetailByCode
	 *
	 */

	@Transactional
	public ArInvdetail findArInvdetailByCode(String code, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findArInvdetailByCode", startResult, maxRows, code);
			return (org.o7planning.sbjsp.choishop.domain.ArInvdetail) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findArInvdetailByCodeProduct
	 *
	 */
	@Transactional
	public Set<ArInvdetail> findArInvdetailByCodeProduct(String codeProduct) throws DataAccessException {

		return findArInvdetailByCodeProduct(codeProduct, -1, -1);
	}

	/**
	 * JPQL Query - findArInvdetailByCodeProduct
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ArInvdetail> findArInvdetailByCodeProduct(String codeProduct, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findArInvdetailByCodeProduct", startResult, maxRows, codeProduct);
		return new LinkedHashSet<ArInvdetail>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(ArInvdetail entity) {
		return true;
	}
}
