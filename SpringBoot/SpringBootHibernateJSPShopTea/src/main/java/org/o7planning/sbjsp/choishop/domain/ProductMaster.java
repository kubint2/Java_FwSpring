
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
		@NamedQuery(name = "findAllProductMasters", query = "select myProductMaster from ProductMaster myProductMaster"),
		@NamedQuery(name = "findProductMasterByCode", query = "select myProductMaster from ProductMaster myProductMaster where myProductMaster.code = ?1"),
		@NamedQuery(name = "findProductMasterByCodeContaining", query = "select myProductMaster from ProductMaster myProductMaster where myProductMaster.code like ?1"),
		@NamedQuery(name = "findProductMasterByDescribeProduct", query = "select myProductMaster from ProductMaster myProductMaster where myProductMaster.describeProduct = ?1"),
		@NamedQuery(name = "findProductMasterByDescribeProductContaining", query = "select myProductMaster from ProductMaster myProductMaster where myProductMaster.describeProduct like ?1"),
		@NamedQuery(name = "findProductMasterByLink", query = "select myProductMaster from ProductMaster myProductMaster where myProductMaster.link = ?1"),
		@NamedQuery(name = "findProductMasterByLinkContaining", query = "select myProductMaster from ProductMaster myProductMaster where myProductMaster.link like ?1"),
		@NamedQuery(name = "findProductMasterByName", query = "select myProductMaster from ProductMaster myProductMaster where myProductMaster.name = ?1"),
		@NamedQuery(name = "findProductMasterByNameContaining", query = "select myProductMaster from ProductMaster myProductMaster where myProductMaster.name like ?1"),
		@NamedQuery(name = "findProductMasterByNote", query = "select myProductMaster from ProductMaster myProductMaster where myProductMaster.note = ?1"),
		@NamedQuery(name = "findProductMasterByNoteContaining", query = "select myProductMaster from ProductMaster myProductMaster where myProductMaster.note like ?1"),
		@NamedQuery(name = "findProductMasterByPrimaryKey", query = "select myProductMaster from ProductMaster myProductMaster where myProductMaster.code = ?1") })

@Table(schema = "public", name = "product_master")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "o7planning/sbjsp/choishop/domain", name = "ProductMaster")

public class ProductMaster implements Serializable {
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

	@Column(name = "describe_product")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String describeProduct;
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
	public void setDescribeProduct(String describeProduct) {
		this.describeProduct = describeProduct;
	}

	/**
	 */
	public String getDescribeProduct() {
		return this.describeProduct;
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
	public ProductMaster() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(ProductMaster that) {
		setCode(that.getCode());
		setName(that.getName());
		setDescribeProduct(that.getDescribeProduct());
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
		buffer.append("describeProduct=[").append(describeProduct).append("] ");
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
		if (!(obj instanceof ProductMaster))
			return false;
		ProductMaster equalCheck = (ProductMaster) obj;
		if ((code == null && equalCheck.code != null) || (code != null && equalCheck.code == null))
			return false;
		if (code != null && !code.equals(equalCheck.code))
			return false;
		return true;
	}
}
