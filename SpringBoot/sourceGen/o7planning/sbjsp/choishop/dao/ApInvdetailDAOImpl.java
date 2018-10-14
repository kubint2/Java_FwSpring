
package org.o7planning.sbjsp.choishop.dao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.o7planning.sbjsp.choishop.domain.ApInvdetail;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage ApInvdetail entities.
 * 
 */
@Repository("ApInvdetailDAO")

@Transactional
public class ApInvdetailDAOImpl extends AbstractJpaDao<ApInvdetail> implements ApInvdetailDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			ApInvdetail.class }));

	/**
	 * EntityManager injected by Spring for persistence unit org_postgresql_Driver
	 *
	 */
	@PersistenceContext(unitName = "org_postgresql_Driver")
	private EntityManager entityManager;

	/**
	 * Instantiates a new ApInvdetailDAOImpl
	 *
	 */
	public ApInvdetailDAOImpl() {
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
	 * JPQL Query - findApInvdetailByCodeContaining
	 *
	 */
	@Transactional
	public Set<ApInvdetail> findApInvdetailByCodeContaining(String code) throws DataAccessException {

		return findApInvdetailByCodeContaining(code, -1, -1);
	}

	/**
	 * JPQL Query - findApInvdetailByCodeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ApInvdetail> findApInvdetailByCodeContaining(String code, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findApInvdetailByCodeContaining", startResult, maxRows, code);
		return new LinkedHashSet<ApInvdetail>(query.getResultList());
	}

	/**
	 * JPQL Query - findApInvdetailByNoteContaining
	 *
	 */
	@Transactional
	public Set<ApInvdetail> findApInvdetailByNoteContaining(String note) throws DataAccessException {

		return findApInvdetailByNoteContaining(note, -1, -1);
	}

	/**
	 * JPQL Query - findApInvdetailByNoteContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ApInvdetail> findApInvdetailByNoteContaining(String note, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findApInvdetailByNoteContaining", startResult, maxRows, note);
		return new LinkedHashSet<ApInvdetail>(query.getResultList());
	}

	/**
	 * JPQL Query - findApInvdetailByPrimaryKey
	 *
	 */
	@Transactional
	public ApInvdetail findApInvdetailByPrimaryKey(String code) throws DataAccessException {

		return findApInvdetailByPrimaryKey(code, -1, -1);
	}

	/**
	 * JPQL Query - findApInvdetailByPrimaryKey
	 *
	 */

	@Transactional
	public ApInvdetail findApInvdetailByPrimaryKey(String code, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findApInvdetailByPrimaryKey", startResult, maxRows, code);
			return (org.o7planning.sbjsp.choishop.domain.ApInvdetail) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findApInvdetailByNote
	 *
	 */
	@Transactional
	public Set<ApInvdetail> findApInvdetailByNote(String note) throws DataAccessException {

		return findApInvdetailByNote(note, -1, -1);
	}

	/**
	 * JPQL Query - findApInvdetailByNote
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ApInvdetail> findApInvdetailByNote(String note, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findApInvdetailByNote", startResult, maxRows, note);
		return new LinkedHashSet<ApInvdetail>(query.getResultList());
	}

	/**
	 * JPQL Query - findApInvdetailByPriceUnit
	 *
	 */
	@Transactional
	public Set<ApInvdetail> findApInvdetailByPriceUnit(Integer priceUnit) throws DataAccessException {

		return findApInvdetailByPriceUnit(priceUnit, -1, -1);
	}

	/**
	 * JPQL Query - findApInvdetailByPriceUnit
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ApInvdetail> findApInvdetailByPriceUnit(Integer priceUnit, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findApInvdetailByPriceUnit", startResult, maxRows, priceUnit);
		return new LinkedHashSet<ApInvdetail>(query.getResultList());
	}

	/**
	 * JPQL Query - findApInvdetailBySumPriceImp
	 *
	 */
	@Transactional
	public Set<ApInvdetail> findApInvdetailBySumPriceImp(Integer sumPriceImp) throws DataAccessException {

		return findApInvdetailBySumPriceImp(sumPriceImp, -1, -1);
	}

	/**
	 * JPQL Query - findApInvdetailBySumPriceImp
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ApInvdetail> findApInvdetailBySumPriceImp(Integer sumPriceImp, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findApInvdetailBySumPriceImp", startResult, maxRows, sumPriceImp);
		return new LinkedHashSet<ApInvdetail>(query.getResultList());
	}

	/**
	 * JPQL Query - findApInvdetailByCode
	 *
	 */
	@Transactional
	public ApInvdetail findApInvdetailByCode(String code) throws DataAccessException {

		return findApInvdetailByCode(code, -1, -1);
	}

	/**
	 * JPQL Query - findApInvdetailByCode
	 *
	 */

	@Transactional
	public ApInvdetail findApInvdetailByCode(String code, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findApInvdetailByCode", startResult, maxRows, code);
			return (org.o7planning.sbjsp.choishop.domain.ApInvdetail) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findApInvdetailByCountProductImp
	 *
	 */
	@Transactional
	public Set<ApInvdetail> findApInvdetailByCountProductImp(Integer countProductImp) throws DataAccessException {

		return findApInvdetailByCountProductImp(countProductImp, -1, -1);
	}

	/**
	 * JPQL Query - findApInvdetailByCountProductImp
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ApInvdetail> findApInvdetailByCountProductImp(Integer countProductImp, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findApInvdetailByCountProductImp", startResult, maxRows, countProductImp);
		return new LinkedHashSet<ApInvdetail>(query.getResultList());
	}

	/**
	 * JPQL Query - findApInvdetailByCodeProduct
	 *
	 */
	@Transactional
	public Set<ApInvdetail> findApInvdetailByCodeProduct(String codeProduct) throws DataAccessException {

		return findApInvdetailByCodeProduct(codeProduct, -1, -1);
	}

	/**
	 * JPQL Query - findApInvdetailByCodeProduct
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ApInvdetail> findApInvdetailByCodeProduct(String codeProduct, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findApInvdetailByCodeProduct", startResult, maxRows, codeProduct);
		return new LinkedHashSet<ApInvdetail>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllApInvdetails
	 *
	 */
	@Transactional
	public Set<ApInvdetail> findAllApInvdetails() throws DataAccessException {

		return findAllApInvdetails(-1, -1);
	}

	/**
	 * JPQL Query - findAllApInvdetails
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ApInvdetail> findAllApInvdetails(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllApInvdetails", startResult, maxRows);
		return new LinkedHashSet<ApInvdetail>(query.getResultList());
	}

	/**
	 * JPQL Query - findApInvdetailByPriceUnitTransport
	 *
	 */
	@Transactional
	public Set<ApInvdetail> findApInvdetailByPriceUnitTransport(Integer priceUnitTransport) throws DataAccessException {

		return findApInvdetailByPriceUnitTransport(priceUnitTransport, -1, -1);
	}

	/**
	 * JPQL Query - findApInvdetailByPriceUnitTransport
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ApInvdetail> findApInvdetailByPriceUnitTransport(Integer priceUnitTransport, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findApInvdetailByPriceUnitTransport", startResult, maxRows, priceUnitTransport);
		return new LinkedHashSet<ApInvdetail>(query.getResultList());
	}

	/**
	 * JPQL Query - findApInvdetailByPriceUnitOther
	 *
	 */
	@Transactional
	public Set<ApInvdetail> findApInvdetailByPriceUnitOther(Integer priceUnitOther) throws DataAccessException {

		return findApInvdetailByPriceUnitOther(priceUnitOther, -1, -1);
	}

	/**
	 * JPQL Query - findApInvdetailByPriceUnitOther
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ApInvdetail> findApInvdetailByPriceUnitOther(Integer priceUnitOther, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findApInvdetailByPriceUnitOther", startResult, maxRows, priceUnitOther);
		return new LinkedHashSet<ApInvdetail>(query.getResultList());
	}

	/**
	 * JPQL Query - findApInvdetailByCodeProductContaining
	 *
	 */
	@Transactional
	public Set<ApInvdetail> findApInvdetailByCodeProductContaining(String codeProduct) throws DataAccessException {

		return findApInvdetailByCodeProductContaining(codeProduct, -1, -1);
	}

	/**
	 * JPQL Query - findApInvdetailByCodeProductContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ApInvdetail> findApInvdetailByCodeProductContaining(String codeProduct, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findApInvdetailByCodeProductContaining", startResult, maxRows, codeProduct);
		return new LinkedHashSet<ApInvdetail>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(ApInvdetail entity) {
		return true;
	}
}
