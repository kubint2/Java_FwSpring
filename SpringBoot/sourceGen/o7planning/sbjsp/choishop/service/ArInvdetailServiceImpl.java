package org.o7planning.sbjsp.choishop.service;

import java.util.List;
import java.util.Set;

import org.o7planning.sbjsp.choishop.dao.ArInvdetailDAO;

import org.o7planning.sbjsp.choishop.domain.ArInvdetail;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for ArInvdetail entities
 * 
 */

@Service("ArInvdetailService")

@Transactional
public class ArInvdetailServiceImpl implements ArInvdetailService {

	/**
	 * DAO injected by Spring that manages ArInvdetail entities
	 * 
	 */
	@Autowired
	private ArInvdetailDAO arInvdetailDAO;

	/**
	 * Instantiates a new ArInvdetailServiceImpl.
	 *
	 */
	public ArInvdetailServiceImpl() {
	}

	/**
	 * Return a count of all ArInvdetail entity
	 * 
	 */
	@Transactional
	public Integer countArInvdetails() {
		return ((Long) arInvdetailDAO.createQuerySingleResult("select count(o) from ArInvdetail o").getSingleResult()).intValue();
	}

	/**
	 * Return all ArInvdetail entity
	 * 
	 */
	@Transactional
	public List<ArInvdetail> findAllArInvdetails(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<ArInvdetail>(arInvdetailDAO.findAllArInvdetails(startResult, maxRows));
	}

	/**
	 * Save an existing ArInvdetail entity
	 * 
	 */
	@Transactional
	public void saveArInvdetail(ArInvdetail arinvdetail) {
		ArInvdetail existingArInvdetail = arInvdetailDAO.findArInvdetailByPrimaryKey(arinvdetail.getCode());

		if (existingArInvdetail != null) {
			if (existingArInvdetail != arinvdetail) {
				existingArInvdetail.setCode(arinvdetail.getCode());
				existingArInvdetail.setCodeProduct(arinvdetail.getCodeProduct());
				existingArInvdetail.setCodeCustomer(arinvdetail.getCodeCustomer());
				existingArInvdetail.setPriceUnitExp(arinvdetail.getPriceUnitExp());
				existingArInvdetail.setPriceUnitTransport(arinvdetail.getPriceUnitTransport());
				existingArInvdetail.setPriceUnitOther(arinvdetail.getPriceUnitOther());
				existingArInvdetail.setCountProductExp(arinvdetail.getCountProductExp());
				existingArInvdetail.setSumPriceExp(arinvdetail.getSumPriceExp());
				existingArInvdetail.setNote(arinvdetail.getNote());
			}
			arinvdetail = arInvdetailDAO.store(existingArInvdetail);
		} else {
			arinvdetail = arInvdetailDAO.store(arinvdetail);
		}
		arInvdetailDAO.flush();
	}

	/**
	 * Load an existing ArInvdetail entity
	 * 
	 */
	@Transactional
	public Set<ArInvdetail> loadArInvdetails() {
		return arInvdetailDAO.findAllArInvdetails();
	}

	/**
	 * Delete an existing ArInvdetail entity
	 * 
	 */
	@Transactional
	public void deleteArInvdetail(ArInvdetail arinvdetail) {
		arInvdetailDAO.remove(arinvdetail);
		arInvdetailDAO.flush();
	}

	/**
	 */
	@Transactional
	public ArInvdetail findArInvdetailByPrimaryKey(String code) {
		return arInvdetailDAO.findArInvdetailByPrimaryKey(code);
	}
}
