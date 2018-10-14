
package org.o7planning.sbjsp.choishop.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

/**
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllCustomerMasters", query = "select myCustomerMaster from CustomerMaster myCustomerMaster"),
		@NamedQuery(name = "findCustomerMasterByCode", query = "select myCustomerMaster from CustomerMaster myCustomerMaster where myCustomerMaster.code = ?1"),
		@NamedQuery(name = "findCustomerMasterByCodeContaining", query = "select myCustomerMaster from CustomerMaster myCustomerMaster where myCustomerMaster.code like ?1"),
		@NamedQuery(name = "findCustomerMasterByDescribeCustommer", query = "select myCustomerMaster from CustomerMaster myCustomerMaster where myCustomerMaster.describeCustommer = ?1"),
		@NamedQuery(name = "findCustomerMasterByDescribeCustommerContaining", query = "select myCustomerMaster from CustomerMaster myCustomerMaster where myCustomerMaster.describeCustommer like ?1"),
		@NamedQuery(name = "findCustomerMasterByLink", query = "select myCustomerMaster from CustomerMaster myCustomerMaster where myCustomerMaster.link = ?1"),
		@NamedQuery(name = "findCustomerMasterByLinkContaining", query = "select myCustomerMaster from CustomerMaster myCustomerMaster where myCustomerMaster.link like ?1"),
		@NamedQuery(name = "findCustomerMasterByName", query = "select myCustomerMaster from CustomerMaster myCustomerMaster where myCustomerMaster.name = ?1"),
		@NamedQuery(name = "findCustomerMasterByNameContaining", query = "select myCustomerMaster from CustomerMaster myCustomerMaster where myCustomerMaster.name like ?1"),
		@NamedQuery(name = "findCustomerMasterByNote", query = "select myCustomerMaster from CustomerMaster myCustomerMaster where myCustomerMaster.note = ?1"),
		@NamedQuery(name = "findCustomerMasterByNoteContaining", query = "select myCustomerMaster from CustomerMaster myCustomerMaster where myCustomerMaster.note like ?1"),
		@NamedQuery(name = "findCustomerMasterByPrimaryKey", query = "select myCustomerMaster from CustomerMaster myCustomerMaster where myCustomerMaster.code = ?1") })

@Table(schema = "public", name = "customer_master")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "org/o7planning/sbjsp/choishop/domain", name = "CustomerMaster")

public class CustomerMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "code", length = 20, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	String code;
	/**
	 */

	@Column(name = "name", length = 100)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String name;
	/**
	 */

	@Column(name = "describe_custommer")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String describeCustommer;
	/**
	 */

	@Column(name = "link", length = 200)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String link;
	/**
	 */

	@Column(name = "note")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String note;

	/**
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 */
	public String getCode() {
		return this.code;
	}

	/**
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 */
	public String getName() {
		return this.name;
	}

	/**
	 */
	public void setDescribeCustommer(String describeCustommer) {
		this.describeCustommer = describeCustommer;
	}

	/**
	 */
	public String getDescribeCustommer() {
		return this.describeCustommer;
	}

	/**
	 */
	public void setLink(String link) {
		this.link = link;
	}

	/**
	 */
	public String getLink() {
		return this.link;
	}

	/**
	 */
	public void setNote(String note) {
		this.note = note;
	}

	/**
	 */
	public String getNote() {
		return this.note;
	}

	/**
	 */
	public CustomerMaster() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(CustomerMaster that) {
		setCode(that.getCode());
		setName(that.getName());
		setDescribeCustommer(that.getDescribeCustommer());
		setLink(that.getLink());
		setNote(that.getNote());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("code=[").append(code).append("] ");
		buffer.append("name=[").append(name).append("] ");
		buffer.append("describeCustommer=[").append(describeCustommer).append("] ");
		buffer.append("link=[").append(link).append("] ");
		buffer.append("note=[").append(note).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((code == null) ? 0 : code.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof CustomerMaster))
			return false;
		CustomerMaster equalCheck = (CustomerMaster) obj;
		if ((code == null && equalCheck.code != null) || (code != null && equalCheck.code == null))
			return false;
		if (code != null && !code.equals(equalCheck.code))
			return false;
		return true;
	}
}
