package org.o7planning.sbjsp.choishop.service;

import java.util.List;
import java.util.Set;

import org.o7planning.sbjsp.choishop.dao.ApInvdetailDAO;

import org.o7planning.sbjsp.choishop.domain.ApInvdetail;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for ApInvdetail entities
 * 
 */

@Service("ApInvdetailService")

@Transactional
public class ApInvdetailServiceImpl implements ApInvdetailService {

	/**
	 * DAO injected by Spring that manages ApInvdetail entities
	 * 
	 */
	@Autowired
	private ApInvdetailDAO apInvdetailDAO;

	/**
	 * Instantiates a new ApInvdetailServiceImpl.
	 *
	 */
	public ApInvdetailServiceImpl() {
	}

	/**
	 * Save an existing ApInvdetail entity
	 * 
	 */
	@Transactional
	public void saveApInvdetail(ApInvdetail apinvdetail) {
		ApInvdetail existingApInvdetail = apInvdetailDAO.findApInvdetailByPrimaryKey(apinvdetail.getCode());

		if (existingApInvdetail != null) {
			if (existingApInvdetail != apinvdetail) {
				existingApInvdetail.setCode(apinvdetail.getCode());
				existingApInvdetail.setCodeProduct(apinvdetail.getCodeProduct());
				existingApInvdetail.setPriceUnit(apinvdetail.getPriceUnit());
				existingApInvdetail.setPriceUnitTransport(apinvdetail.getPriceUnitTransport());
				existingApInvdetail.setPriceUnitOther(apinvdetail.getPriceUnitOther());
				existingApInvdetail.setCountProductImp(apinvdetail.getCountProductImp());
				existingApInvdetail.setSumPriceImp(apinvdetail.getSumPriceImp());
				existingApInvdetail.setNote(apinvdetail.getNote());
			}
			apinvdetail = apInvdetailDAO.store(existingApInvdetail);
		} else {
			apinvdetail = apInvdetailDAO.store(apinvdetail);
		}
		apInvdetailDAO.flush();
	}

	/**
	 * Return all ApInvdetail entity
	 * 
	 */
	@Transactional
	public List<ApInvdetail> findAllApInvdetails(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<ApInvdetail>(apInvdetailDAO.findAllApInvdetails(startResult, maxRows));
	}

	/**
	 */
	@Transactional
	public ApInvdetail findApInvdetailByPrimaryKey(String code) {
		return apInvdetailDAO.findApInvdetailByPrimaryKey(code);
	}

	/**
	 * Return a count of all ApInvdetail entity
	 * 
	 */
	@Transactional
	public Integer countApInvdetails() {
		return ((Long) apInvdetailDAO.createQuerySingleResult("select count(o) from ApInvdetail o").getSingleResult()).intValue();
	}

	/**
	 * Load an existing ApInvdetail entity
	 * 
	 */
	@Transactional
	public Set<ApInvdetail> loadApInvdetails() {
		return apInvdetailDAO.findAllApInvdetails();
	}

	/**
	 * Delete an existing ApInvdetail entity
	 * 
	 */
	@Transactional
	public void deleteApInvdetail(ApInvdetail apinvdetail) {
		apInvdetailDAO.remove(apinvdetail);
		apInvdetailDAO.flush();
	}
}
