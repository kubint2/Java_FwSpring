
package org.o7planning.sbjsp.choishop.service;

import java.util.List;
import java.util.Set;

import org.o7planning.sbjsp.choishop.domain.ApInvdetail;

/**
 * Spring service that handles CRUD requests for ApInvdetail entities
 * 
 */
public interface ApInvdetailService {

	/**
	* Save an existing ApInvdetail entity
	* 
	 */
	public void saveApInvdetail(ApInvdetail apinvdetail);

	/**
	* Return all ApInvdetail entity
	* 
	 */
	public List<ApInvdetail> findAllApInvdetails(Integer startResult, Integer maxRows);

	/**
	 */
	public ApInvdetail findApInvdetailByPrimaryKey(String code);

	/**
	* Return a count of all ApInvdetail entity
	* 
	 */
	public Integer countApInvdetails();

	/**
	* Load an existing ApInvdetail entity
	* 
	 */
	public Set<ApInvdetail> loadApInvdetails();

	/**
	* Delete an existing ApInvdetail entity
	* 
	 */
	public void deleteApInvdetail(ApInvdetail apinvdetail_1);
}