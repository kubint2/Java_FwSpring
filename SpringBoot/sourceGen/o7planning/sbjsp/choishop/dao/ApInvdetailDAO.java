
package org.o7planning.sbjsp.choishop.dao;

import java.util.Set;

import org.o7planning.sbjsp.choishop.domain.ApInvdetail;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage ApInvdetail entities.
 * 
 */
public interface ApInvdetailDAO extends JpaDao<ApInvdetail> {

	/**
	 * JPQL Query - findApInvdetailByCodeContaining
	 *
	 */
	public Set<ApInvdetail> findApInvdetailByCodeContaining(String code) throws DataAccessException;

	/**
	 * JPQL Query - findApInvdetailByCodeContaining
	 *
	 */
	public Set<ApInvdetail> findApInvdetailByCodeContaining(String code, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findApInvdetailByNoteContaining
	 *
	 */
	public Set<ApInvdetail> findApInvdetailByNoteContaining(String note) throws DataAccessException;

	/**
	 * JPQL Query - findApInvdetailByNoteContaining
	 *
	 */
	public Set<ApInvdetail> findApInvdetailByNoteContaining(String note, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findApInvdetailByPrimaryKey
	 *
	 */
	public ApInvdetail findApInvdetailByPrimaryKey(String code_1) throws DataAccessException;

	/**
	 * JPQL Query - findApInvdetailByPrimaryKey
	 *
	 */
	public ApInvdetail findApInvdetailByPrimaryKey(String code_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findApInvdetailByNote
	 *
	 */
	public Set<ApInvdetail> findApInvdetailByNote(String note_1) throws DataAccessException;

	/**
	 * JPQL Query - findApInvdetailByNote
	 *
	 */
	public Set<ApInvdetail> findApInvdetailByNote(String note_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findApInvdetailByPriceUnit
	 *
	 */
	public Set<ApInvdetail> findApInvdetailByPriceUnit(Integer priceUnit) throws DataAccessException;

	/**
	 * JPQL Query - findApInvdetailByPriceUnit
	 *
	 */
	public Set<ApInvdetail> findApInvdetailByPriceUnit(Integer priceUnit, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findApInvdetailBySumPriceImp
	 *
	 */
	public Set<ApInvdetail> findApInvdetailBySumPriceImp(Integer sumPriceImp) throws DataAccessException;

	/**
	 * JPQL Query - findApInvdetailBySumPriceImp
	 *
	 */
	public Set<ApInvdetail> findApInvdetailBySumPriceImp(Integer sumPriceImp, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findApInvdetailByCode
	 *
	 */
	public ApInvdetail findApInvdetailByCode(String code_2) throws DataAccessException;

	/**
	 * JPQL Query - findApInvdetailByCode
	 *
	 */
	public ApInvdetail findApInvdetailByCode(String code_2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findApInvdetailByCountProductImp
	 *
	 */
	public Set<ApInvdetail> findApInvdetailByCountProductImp(Integer countProductImp) throws DataAccessException;

	/**
	 * JPQL Query - findApInvdetailByCountProductImp
	 *
	 */
	public Set<ApInvdetail> findApInvdetailByCountProductImp(Integer countProductImp, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findApInvdetailByCodeProduct
	 *
	 */
	public Set<ApInvdetail> findApInvdetailByCodeProduct(String codeProduct) throws DataAccessException;

	/**
	 * JPQL Query - findApInvdetailByCodeProduct
	 *
	 */
	public Set<ApInvdetail> findApInvdetailByCodeProduct(String codeProduct, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllApInvdetails
	 *
	 */
	public Set<ApInvdetail> findAllApInvdetails() throws DataAccessException;

	/**
	 * JPQL Query - findAllApInvdetails
	 *
	 */
	public Set<ApInvdetail> findAllApInvdetails(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findApInvdetailByPriceUnitTransport
	 *
	 */
	public Set<ApInvdetail> findApInvdetailByPriceUnitTransport(Integer priceUnitTransport) throws DataAccessException;

	/**
	 * JPQL Query - findApInvdetailByPriceUnitTransport
	 *
	 */
	public Set<ApInvdetail> findApInvdetailByPriceUnitTransport(Integer priceUnitTransport, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findApInvdetailByPriceUnitOther
	 *
	 */
	public Set<ApInvdetail> findApInvdetailByPriceUnitOther(Integer priceUnitOther) throws DataAccessException;

	/**
	 * JPQL Query - findApInvdetailByPriceUnitOther
	 *
	 */
	public Set<ApInvdetail> findApInvdetailByPriceUnitOther(Integer priceUnitOther, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findApInvdetailByCodeProductContaining
	 *
	 */
	public Set<ApInvdetail> findApInvdetailByCodeProductContaining(String codeProduct_1) throws DataAccessException;

	/**
	 * JPQL Query - findApInvdetailByCodeProductContaining
	 *
	 */
	public Set<ApInvdetail> findApInvdetailByCodeProductContaining(String codeProduct_1, int startResult, int maxRows) throws DataAccessException;

}