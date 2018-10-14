
package org.o7planning.sbjsp.choishop.dao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.o7planning.sbjsp.choishop.domain.ProductMaster;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage ProductMaster entities.
 * 
 */
@Repository("ProductMasterDAO")

@Transactional
public class ProductMasterDAOImpl extends AbstractJpaDao<ProductMaster> implements ProductMasterDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			ProductMaster.class }));

	/**
	 * EntityManager injected by Spring for persistence unit org_postgresql_Driver
	 *
	 */
	@PersistenceContext(unitName = "org_postgresql_Driver")
	private EntityManager entityManager;

	/**
	 * Instantiates a new ProductMasterDAOImpl
	 *
	 */
	public ProductMasterDAOImpl() {
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
	 * JPQL Query - findProductMasterByCodeContaining
	 *
	 */
	@Transactional
	public Set<ProductMaster> findProductMasterByCodeContaining(String code) throws DataAccessException {

		return findProductMasterByCodeContaining(code, -1, -1);
	}

	/**
	 * JPQL Query - findProductMasterByCodeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductMaster> findProductMasterByCodeContaining(String code, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductMasterByCodeContaining", startResult, maxRows, code);
		return new LinkedHashSet<ProductMaster>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductMasterByPrimaryKey
	 *
	 */
	@Transactional
	public ProductMaster findProductMasterByPrimaryKey(String code) throws DataAccessException {

		return findProductMasterByPrimaryKey(code, -1, -1);
	}

	/**
	 * JPQL Query - findProductMasterByPrimaryKey
	 *
	 */

	@Transactional
	public ProductMaster findProductMasterByPrimaryKey(String code, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findProductMasterByPrimaryKey", startResult, maxRows, code);
			return (org.o7planning.sbjsp.choishop.domain.ProductMaster) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findProductMasterByDescribeProduct
	 *
	 */
	@Transactional
	public Set<ProductMaster> findProductMasterByDescribeProduct(String describeProduct) throws DataAccessException {

		return findProductMasterByDescribeProduct(describeProduct, -1, -1);
	}

	/**
	 * JPQL Query - findProductMasterByDescribeProduct
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductMaster> findProductMasterByDescribeProduct(String describeProduct, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductMasterByDescribeProduct", startResult, maxRows, describeProduct);
		return new LinkedHashSet<ProductMaster>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllProductMasters
	 *
	 */
	@Transactional
	public Set<ProductMaster> findAllProductMasters() throws DataAccessException {

		return findAllProductMasters(-1, -1);
	}

	/**
	 * JPQL Query - findAllProductMasters
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductMaster> findAllProductMasters(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllProductMasters", startResult, maxRows);
		return new LinkedHashSet<ProductMaster>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductMasterByNoteContaining
	 *
	 */
	@Transactional
	public Set<ProductMaster> findProductMasterByNoteContaining(String note) throws DataAccessException {

		return findProductMasterByNoteContaining(note, -1, -1);
	}

	/**
	 * JPQL Query - findProductMasterByNoteContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductMaster> findProductMasterByNoteContaining(String note, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductMasterByNoteContaining", startResult, maxRows, note);
		return new LinkedHashSet<ProductMaster>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductMasterByNote
	 *
	 */
	@Transactional
	public Set<ProductMaster> findProductMasterByNote(String note) throws DataAccessException {

		return findProductMasterByNote(note, -1, -1);
	}

	/**
	 * JPQL Query - findProductMasterByNote
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductMaster> findProductMasterByNote(String note, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductMasterByNote", startResult, maxRows, note);
		return new LinkedHashSet<ProductMaster>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductMasterByCode
	 *
	 */
	@Transactional
	public ProductMaster findProductMasterByCode(String code) throws DataAccessException {

		return findProductMasterByCode(code, -1, -1);
	}

	/**
	 * JPQL Query - findProductMasterByCode
	 *
	 */

	@Transactional
	public ProductMaster findProductMasterByCode(String code, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findProductMasterByCode", startResult, maxRows, code);
			return (org.o7planning.sbjsp.choishop.domain.ProductMaster) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findProductMasterByNameContaining
	 *
	 */
	@Transactional
	public Set<ProductMaster> findProductMasterByNameContaining(String name) throws DataAccessException {

		return findProductMasterByNameContaining(name, -1, -1);
	}

	/**
	 * JPQL Query - findProductMasterByNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductMaster> findProductMasterByNameContaining(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductMasterByNameContaining", startResult, maxRows, name);
		return new LinkedHashSet<ProductMaster>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductMasterByDescribeProductContaining
	 *
	 */
	@Transactional
	public Set<ProductMaster> findProductMasterByDescribeProductContaining(String describeProduct) throws DataAccessException {

		return findProductMasterByDescribeProductContaining(describeProduct, -1, -1);
	}

	/**
	 * JPQL Query - findProductMasterByDescribeProductContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductMaster> findProductMasterByDescribeProductContaining(String describeProduct, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductMasterByDescribeProductContaining", startResult, maxRows, describeProduct);
		return new LinkedHashSet<ProductMaster>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductMasterByLink
	 *
	 */
	@Transactional
	public Set<ProductMaster> findProductMasterByLink(String link) throws DataAccessException {

		return findProductMasterByLink(link, -1, -1);
	}

	/**
	 * JPQL Query - findProductMasterByLink
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductMaster> findProductMasterByLink(String link, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductMasterByLink", startResult, maxRows, link);
		return new LinkedHashSet<ProductMaster>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductMasterByLinkContaining
	 *
	 */
	@Transactional
	public Set<ProductMaster> findProductMasterByLinkContaining(String link) throws DataAccessException {

		return findProductMasterByLinkContaining(link, -1, -1);
	}

	/**
	 * JPQL Query - findProductMasterByLinkContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductMaster> findProductMasterByLinkContaining(String link, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductMasterByLinkContaining", startResult, maxRows, link);
		return new LinkedHashSet<ProductMaster>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductMasterByName
	 *
	 */
	@Transactional
	public Set<ProductMaster> findProductMasterByName(String name) throws DataAccessException {

		return findProductMasterByName(name, -1, -1);
	}

	/**
	 * JPQL Query - findProductMasterByName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductMaster> findProductMasterByName(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductMasterByName", startResult, maxRows, name);
		return new LinkedHashSet<ProductMaster>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(ProductMaster entity) {
		return true;
	}
}
