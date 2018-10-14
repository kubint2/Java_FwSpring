package org.o7planning.sbjsp.choishop.service;

import java.util.List;
import java.util.Set;

import org.o7planning.sbjsp.choishop.dao.ProductMasterDAO;

import org.o7planning.sbjsp.choishop.domain.ProductMaster;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for ProductMaster entities
 * 
 */

@Service("ProductMasterService")

@Transactional
public class ProductMasterServiceImpl implements ProductMasterService {

	/**
	 * DAO injected by Spring that manages ProductMaster entities
	 * 
	 */
	@Autowired
	private ProductMasterDAO productMasterDAO;

	/**
	 * Instantiates a new ProductMasterServiceImpl.
	 *
	 */
	public ProductMasterServiceImpl() {
	}

	/**
	 * Return all ProductMaster entity
	 * 
	 */
	@Transactional
	public List<ProductMaster> findAllProductMasters(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<ProductMaster>(productMasterDAO.findAllProductMasters(startResult, maxRows));
	}

	/**
	 * Delete an existing ProductMaster entity
	 * 
	 */
	@Transactional
	public void deleteProductMaster(ProductMaster productmaster) {
		productMasterDAO.remove(productmaster);
		productMasterDAO.flush();
	}

	/**
	 * Load an existing ProductMaster entity
	 * 
	 */
	@Transactional
	public Set<ProductMaster> loadProductMasters() {
		return productMasterDAO.findAllProductMasters();
	}

	/**
	 */
	@Transactional
	public ProductMaster findProductMasterByPrimaryKey(String code) {
		return productMasterDAO.findProductMasterByPrimaryKey(code);
	}

	/**
	 * Return a count of all ProductMaster entity
	 * 
	 */
	@Transactional
	public Integer countProductMasters() {
		return ((Long) productMasterDAO.createQuerySingleResult("select count(o) from ProductMaster o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing ProductMaster entity
	 * 
	 */
	@Transactional
	public void saveProductMaster(ProductMaster productmaster) {
		ProductMaster existingProductMaster = productMasterDAO.findProductMasterByPrimaryKey(productmaster.getCode());

		if (existingProductMaster != null) {
			if (existingProductMaster != productmaster) {
				existingProductMaster.setCode(productmaster.getCode());
				existingProductMaster.setName(productmaster.getName());
				existingProductMaster.setDescribeProduct(productmaster.getDescribeProduct());
				existingProductMaster.setLink(productmaster.getLink());
				existingProductMaster.setNote(productmaster.getNote());
			}
			productmaster = productMasterDAO.store(existingProductMaster);
		} else {
			productmaster = productMasterDAO.store(productmaster);
		}
		productMasterDAO.flush();
	}
}
