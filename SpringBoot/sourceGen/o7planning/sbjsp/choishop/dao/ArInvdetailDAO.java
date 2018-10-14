
package org.o7planning.sbjsp.choishop.dao;

import java.util.Set;

import org.o7planning.sbjsp.choishop.domain.ArInvdetail;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage ArInvdetail entities.
 * 
 */
public interface ArInvdetailDAO extends JpaDao<ArInvdetail> {

	/**
	 * JPQL Query - findArInvdetailByCodeContaining
	 *
	 */
	public Set<ArInvdetail> findArInvdetailByCodeContaining(String code) throws DataAccessException;

	/**
	 * JPQL Query - findArInvdetailByCodeContaining
	 *
	 */
	public Set<ArInvdetail> findArInvdetailByCodeContaining(String code, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findArInvdetailByCodeProductContaining
	 *
	 */
	public Set<ArInvdetail> findArInvdetailByCodeProductContaining(String codeProduct) throws DataAccessException;

	/**
	 * JPQL Query - findArInvdetailByCodeProductContaining
	 *
	 */
	public Set<ArInvdetail> findArInvdetailByCodeProductContaining(String codeProduct, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findArInvdetailBySumPriceExp
	 *
	 */
	public Set<ArInvdetail> findArInvdetailBySumPriceExp(Integer sumPriceExp) throws DataAccessException;

	/**
	 * JPQL Query - findArInvdetailBySumPriceExp
	 *
	 */
	public Set<ArInvdetail> findArInvdetailBySumPriceExp(Integer sumPriceExp, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findArInvdetailByCodeCustomer
	 *
	 */
	public Set<ArInvdetail> findArInvdetailByCodeCustomer(String codeCustomer) throws DataAccessException;

	/**
	 * JPQL Query - findArInvdetailByCodeCustomer
	 *
	 */
	public Set<ArInvdetail> findArInvdetailByCodeCustomer(String codeCustomer, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findArInvdetailByPrimaryKey
	 *
	 */
	public ArInvdetail findArInvdetailByPrimaryKey(String code_1) throws DataAccessException;

	/**
	 * JPQL Query - findArInvdetailByPrimaryKey
	 *
	 */
	public ArInvdetail findArInvdetailByPrimaryKey(String code_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findArInvdetailByNoteContaining
	 *
	 */
	public Set<ArInvdetail> findArInvdetailByNoteContaining(String note) throws DataAccessException;

	/**
	 * JPQL Query - findArInvdetailByNoteContaining
	 *
	 */
	public Set<ArInvdetail> findArInvdetailByNoteContaining(String note, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findArInvdetailByNote
	 *
	 */
	public Set<ArInvdetail> findArInvdetailByNote(String note_1) throws DataAccessException;

	/**
	 * JPQL Query - findArInvdetailByNote
	 *
	 */
	public Set<ArInvdetail> findArInvdetailByNote(String note_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findArInvdetailByCodeCustomerContaining
	 *
	 */
	public Set<ArInvdetail> findArInvdetailByCodeCustomerContaining(String codeCustomer_1) throws DataAccessException;

	/**
	 * JPQL Query - findArInvdetailByCodeCustomerContaining
	 *
	 */
	public Set<ArInvdetail> findArInvdetailByCodeCustomerContaining(String codeCustomer_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findArInvdetailByPriceUnitTransport
	 *
	 */
	public Set<ArInvdetail> findArInvdetailByPriceUnitTransport(Integer priceUnitTransport) throws DataAccessException;

	/**
	 * JPQL Query - findArInvdetailByPriceUnitTransport
	 *
	 */
	public Set<ArInvdetail> findArInvdetailByPriceUnitTransport(Integer priceUnitTransport, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllArInvdetails
	 *
	 */
	public Set<ArInvdetail> findAllArInvdetails() throws DataAccessException;

	/**
	 * JPQL Query - findAllArInvdetails
	 *
	 */
	public Set<ArInvdetail> findAllArInvdetails(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findArInvdetailByCountProductExp
	 *
	 */
	public Set<ArInvdetail> findArInvdetailByCountProductExp(Integer countProductExp) throws DataAccessException;

	/**
	 * JPQL Query - findArInvdetailByCountProductExp
	 *
	 */
	public Set<ArInvdetail> findArInvdetailByCountProductExp(Integer countProductExp, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findArInvdetailByPriceUnitOther
	 *
	 */
	public Set<ArInvdetail> findArInvdetailByPriceUnitOther(Integer priceUnitOther) throws DataAccessException;

	/**
	 * JPQL Query - findArInvdetailByPriceUnitOther
	 *
	 */
	public Set<ArInvdetail> findArInvdetailByPriceUnitOther(Integer priceUnitOther, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findArInvdetailByPriceUnitExp
	 *
	 */
	public Set<ArInvdetail> findArInvdetailByPriceUnitExp(Integer priceUnitExp) throws DataAccessException;

	/**
	 * JPQL Query - findArInvdetailByPriceUnitExp
	 *
	 */
	public Set<ArInvdetail> findArInvdetailByPriceUnitExp(Integer priceUnitExp, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findArInvdetailByCode
	 *
	 */
	public ArInvdetail findArInvdetailByCode(String code_2) throws DataAccessException;

	/**
	 * JPQL Query - findArInvdetailByCode
	 *
	 */
	public ArInvdetail findArInvdetailByCode(String code_2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findArInvdetailByCodeProduct
	 *
	 */
	public Set<ArInvdetail> findArInvdetailByCodeProduct(String codeProduct_1) throws DataAccessException;

	/**
	 * JPQL Query - findArInvdetailByCodeProduct
	 *
	 */
	public Set<ArInvdetail> findArInvdetailByCodeProduct(String codeProduct_1, int startResult, int maxRows) throws DataAccessException;

}