
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
		@NamedQuery(name = "findAllArInvdetails", query = "select myArInvdetail from ArInvdetail myArInvdetail"),
		@NamedQuery(name = "findArInvdetailByCode", query = "select myArInvdetail from ArInvdetail myArInvdetail where myArInvdetail.code = ?1"),
		@NamedQuery(name = "findArInvdetailByCodeContaining", query = "select myArInvdetail from ArInvdetail myArInvdetail where myArInvdetail.code like ?1"),
		@NamedQuery(name = "findArInvdetailByCodeCustomer", query = "select myArInvdetail from ArInvdetail myArInvdetail where myArInvdetail.codeCustomer = ?1"),
		@NamedQuery(name = "findArInvdetailByCodeCustomerContaining", query = "select myArInvdetail from ArInvdetail myArInvdetail where myArInvdetail.codeCustomer like ?1"),
		@NamedQuery(name = "findArInvdetailByCodeProduct", query = "select myArInvdetail from ArInvdetail myArInvdetail where myArInvdetail.codeProduct = ?1"),
		@NamedQuery(name = "findArInvdetailByCodeProductContaining", query = "select myArInvdetail from ArInvdetail myArInvdetail where myArInvdetail.codeProduct like ?1"),
		@NamedQuery(name = "findArInvdetailByCountProductExp", query = "select myArInvdetail from ArInvdetail myArInvdetail where myArInvdetail.countProductExp = ?1"),
		@NamedQuery(name = "findArInvdetailByNote", query = "select myArInvdetail from ArInvdetail myArInvdetail where myArInvdetail.note = ?1"),
		@NamedQuery(name = "findArInvdetailByNoteContaining", query = "select myArInvdetail from ArInvdetail myArInvdetail where myArInvdetail.note like ?1"),
		@NamedQuery(name = "findArInvdetailByPriceUnitExp", query = "select myArInvdetail from ArInvdetail myArInvdetail where myArInvdetail.priceUnitExp = ?1"),
		@NamedQuery(name = "findArInvdetailByPriceUnitOther", query = "select myArInvdetail from ArInvdetail myArInvdetail where myArInvdetail.priceUnitOther = ?1"),
		@NamedQuery(name = "findArInvdetailByPriceUnitTransport", query = "select myArInvdetail from ArInvdetail myArInvdetail where myArInvdetail.priceUnitTransport = ?1"),
		@NamedQuery(name = "findArInvdetailByPrimaryKey", query = "select myArInvdetail from ArInvdetail myArInvdetail where myArInvdetail.code = ?1"),
		@NamedQuery(name = "findArInvdetailBySumPriceExp", query = "select myArInvdetail from ArInvdetail myArInvdetail where myArInvdetail.sumPriceExp = ?1") })

@Table(schema = "public", name = "ar_invdetail")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "org/o7planning/sbjsp/choishop/domain", name = "ArInvdetail")

public class ArInvdetail implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "code", length = 8, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	String code;
	/**
	 */

	@Column(name = "code_product", length = 20, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String codeProduct;
	/**
	 */

	@Column(name = "code_customer", length = 20, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String codeCustomer;
	/**
	 */

	@Column(name = "price_unit_exp")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer priceUnitExp;
	/**
	 */

	@Column(name = "price_unit_transport")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer priceUnitTransport;
	/**
	 */

	@Column(name = "price_unit_other")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer priceUnitOther;
	/**
	 */

	@Column(name = "count_product_exp")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer countProductExp;
	/**
	 */

	@Column(name = "sum_price_exp")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer sumPriceExp;
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
	public void setCodeProduct(String codeProduct) {
		this.codeProduct = codeProduct;
	}

	/**
	 */
	public String getCodeProduct() {
		return this.codeProduct;
	}

	/**
	 */
	public void setCodeCustomer(String codeCustomer) {
		this.codeCustomer = codeCustomer;
	}

	/**
	 */
	public String getCodeCustomer() {
		return this.codeCustomer;
	}

	/**
	 */
	public void setPriceUnitExp(Integer priceUnitExp) {
		this.priceUnitExp = priceUnitExp;
	}

	/**
	 */
	public Integer getPriceUnitExp() {
		return this.priceUnitExp;
	}

	/**
	 */
	public void setPriceUnitTransport(Integer priceUnitTransport) {
		this.priceUnitTransport = priceUnitTransport;
	}

	/**
	 */
	public Integer getPriceUnitTransport() {
		return this.priceUnitTransport;
	}

	/**
	 */
	public void setPriceUnitOther(Integer priceUnitOther) {
		this.priceUnitOther = priceUnitOther;
	}

	/**
	 */
	public Integer getPriceUnitOther() {
		return this.priceUnitOther;
	}

	/**
	 */
	public void setCountProductExp(Integer countProductExp) {
		this.countProductExp = countProductExp;
	}

	/**
	 */
	public Integer getCountProductExp() {
		return this.countProductExp;
	}

	/**
	 */
	public void setSumPriceExp(Integer sumPriceExp) {
		this.sumPriceExp = sumPriceExp;
	}

	/**
	 */
	public Integer getSumPriceExp() {
		return this.sumPriceExp;
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
	public ArInvdetail() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(ArInvdetail that) {
		setCode(that.getCode());
		setCodeProduct(that.getCodeProduct());
		setCodeCustomer(that.getCodeCustomer());
		setPriceUnitExp(that.getPriceUnitExp());
		setPriceUnitTransport(that.getPriceUnitTransport());
		setPriceUnitOther(that.getPriceUnitOther());
		setCountProductExp(that.getCountProductExp());
		setSumPriceExp(that.getSumPriceExp());
		setNote(that.getNote());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("code=[").append(code).append("] ");
		buffer.append("codeProduct=[").append(codeProduct).append("] ");
		buffer.append("codeCustomer=[").append(codeCustomer).append("] ");
		buffer.append("priceUnitExp=[").append(priceUnitExp).append("] ");
		buffer.append("priceUnitTransport=[").append(priceUnitTransport).append("] ");
		buffer.append("priceUnitOther=[").append(priceUnitOther).append("] ");
		buffer.append("countProductExp=[").append(countProductExp).append("] ");
		buffer.append("sumPriceExp=[").append(sumPriceExp).append("] ");
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
		if (!(obj instanceof ArInvdetail))
			return false;
		ArInvdetail equalCheck = (ArInvdetail) obj;
		if ((code == null && equalCheck.code != null) || (code != null && equalCheck.code == null))
			return false;
		if (code != null && !code.equals(equalCheck.code))
			return false;
		return true;
	}
}
