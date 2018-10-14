
package org.o7planning.sbjsp.choishop.service;

import java.util.List;
import java.util.Set;

import org.o7planning.sbjsp.choishop.domain.ArInvdetail;

/**
 * Spring service that handles CRUD requests for ArInvdetail entities
 * 
 */
public interface ArInvdetailService {

	/**
	* Return a count of all ArInvdetail entity
	* 
	 */
	public Integer countArInvdetails();

	/**
	* Return all ArInvdetail entity
	* 
	 */
	public List<ArInvdetail> findAllArInvdetails(Integer startResult, Integer maxRows);

	/**
	* Save an existing ArInvdetail entity
	* 
	 */
	public void saveArInvdetail(ArInvdetail arinvdetail);

	/**
	* Load an existing ArInvdetail entity
	* 
	 */
	public Set<ArInvdetail> loadArInvdetails();

	/**
	* Delete an existing ArInvdetail entity
	* 
	 */
	public void deleteArInvdetail(ArInvdetail arinvdetail_1);

	/**
	 */
	public ArInvdetail findArInvdetailByPrimaryKey(String code);
}