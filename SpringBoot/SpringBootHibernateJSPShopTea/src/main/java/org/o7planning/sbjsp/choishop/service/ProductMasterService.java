
package org.o7planning.sbjsp.choishop.service;

import java.util.List;
import java.util.Set;

import org.o7planning.sbjsp.choishop.domain.ProductMaster;

/**
 * Spring service that handles CRUD requests for ProductMaster entities
 * 
 */
public interface ProductMasterService {

	/**
	* Return all ProductMaster entity
	* 
	 */
	public List<ProductMaster> findAllProductMasters(Integer startResult, Integer maxRows);

	/**
	* Delete an existing ProductMaster entity
	* 
	 */
	public void deleteProductMaster(ProductMaster productmaster);

	/**
	* Load an existing ProductMaster entity
	* 
	 */
	public Set<ProductMaster> loadProductMasters();

	/**
	 */
	public ProductMaster findProductMasterByPrimaryKey(String code);

	/**
	* Return a count of all ProductMaster entity
	* 
	 */
	public Integer countProductMasters();

	/**
	* Save an existing ProductMaster entity
	* 
	 */
	public void saveProductMaster(ProductMaster productmaster_1);
}