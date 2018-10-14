
package org.o7planning.sbjsp.choishop.dao;

import java.util.Set;

import org.o7planning.sbjsp.choishop.domain.ProductMaster;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage ProductMaster entities.
 * 
 */
public interface ProductMasterDAO extends JpaDao<ProductMaster> {

	/**
	 * JPQL Query - findProductMasterByCodeContaining
	 *
	 */
	public Set<ProductMaster> findProductMasterByCodeContaining(String code) throws DataAccessException;

	/**
	 * JPQL Query - findProductMasterByCodeContaining
	 *
	 */
	public Set<ProductMaster> findProductMasterByCodeContaining(String code, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductMasterByPrimaryKey
	 *
	 */
	public ProductMaster findProductMasterByPrimaryKey(String code_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductMasterByPrimaryKey
	 *
	 */
	public ProductMaster findProductMasterByPrimaryKey(String code_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductMasterByDescribeProduct
	 *
	 */
	public Set<ProductMaster> findProductMasterByDescribeProduct(String describeProduct) throws DataAccessException;

	/**
	 * JPQL Query - findProductMasterByDescribeProduct
	 *
	 */
	public Set<ProductMaster> findProductMasterByDescribeProduct(String describeProduct, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllProductMasters
	 *
	 */
	public Set<ProductMaster> findAllProductMasters() throws DataAccessException;

	/**
	 * JPQL Query - findAllProductMasters
	 *
	 */
	public Set<ProductMaster> findAllProductMasters(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductMasterByNoteContaining
	 *
	 */
	public Set<ProductMaster> findProductMasterByNoteContaining(String note) throws DataAccessException;

	/**
	 * JPQL Query - findProductMasterByNoteContaining
	 *
	 */
	public Set<ProductMaster> findProductMasterByNoteContaining(String note, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductMasterByNote
	 *
	 */
	public Set<ProductMaster> findProductMasterByNote(String note_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductMasterByNote
	 *
	 */
	public Set<ProductMaster> findProductMasterByNote(String note_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductMasterByCode
	 *
	 */
	public ProductMaster findProductMasterByCode(String code_2) throws DataAccessException;

	/**
	 * JPQL Query - findProductMasterByCode
	 *
	 */
	public ProductMaster findProductMasterByCode(String code_2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductMasterByNameContaining
	 *
	 */
	public Set<ProductMaster> findProductMasterByNameContaining(String name) throws DataAccessException;

	/**
	 * JPQL Query - findProductMasterByNameContaining
	 *
	 */
	public Set<ProductMaster> findProductMasterByNameContaining(String name, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductMasterByDescribeProductContaining
	 *
	 */
	public Set<ProductMaster> findProductMasterByDescribeProductContaining(String describeProduct_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductMasterByDescribeProductContaining
	 *
	 */
	public Set<ProductMaster> findProductMasterByDescribeProductContaining(String describeProduct_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductMasterByLink
	 *
	 */
	public Set<ProductMaster> findProductMasterByLink(String link) throws DataAccessException;

	/**
	 * JPQL Query - findProductMasterByLink
	 *
	 */
	public Set<ProductMaster> findProductMasterByLink(String link, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductMasterByLinkContaining
	 *
	 */
	public Set<ProductMaster> findProductMasterByLinkContaining(String link_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductMasterByLinkContaining
	 *
	 */
	public Set<ProductMaster> findProductMasterByLinkContaining(String link_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductMasterByName
	 *
	 */
	public Set<ProductMaster> findProductMasterByName(String name_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductMasterByName
	 *
	 */
	public Set<ProductMaster> findProductMasterByName(String name_1, int startResult, int maxRows) throws DataAccessException;

}