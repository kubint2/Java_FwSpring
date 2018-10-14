
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
		@NamedQuery(name = "findAllApInvdetails", query = "select myApInvdetail from ApInvdetail myApInvdetail"),
		@NamedQuery(name = "findApInvdetailByCode", query = "select myApInvdetail from ApInvdetail myApInvdetail where myApInvdetail.code = ?1"),
		@NamedQuery(name = "findApInvdetailByCodeContaining", query = "select myApInvdetail from ApInvdetail myApInvdetail where myApInvdetail.code like ?1"),
		@NamedQuery(name = "findApInvdetailByCodeProduct", query = "select myApInvdetail from ApInvdetail myApInvdetail where myApInvdetail.codeProduct = ?1"),
		@NamedQuery(name = "findApInvdetailByCodeProductContaining", query = "select myApInvdetail from ApInvdetail myApInvdetail where myApInvdetail.codeProduct like ?1"),
		@NamedQuery(name = "findApInvdetailByCountProductImp", query = "select myApInvdetail from ApInvdetail myApInvdetail where myApInvdetail.countProductImp = ?1"),
		@NamedQuery(name = "findApInvdetailByNote", query = "select myApInvdetail from ApInvdetail myApInvdetail where myApInvdetail.note = ?1"),
		@NamedQuery(name = "findApInvdetailByNoteContaining", query = "select myApInvdetail from ApInvdetail myApInvdetail where myApInvdetail.note like ?1"),
		@NamedQuery(name = "findApInvdetailByPriceUnit", query = "select myApInvdetail from ApInvdetail myApInvdetail where myApInvdetail.priceUnit = ?1"),
		@NamedQuery(name = "findApInvdetailByPriceUnitOther", query = "select myApInvdetail from ApInvdetail myApInvdetail where myApInvdetail.priceUnitOther = ?1"),
		@NamedQuery(name = "findApInvdetailByPriceUnitTransport", query = "select myApInvdetail from ApInvdetail myApInvdetail where myApInvdetail.priceUnitTransport = ?1"),
		@NamedQuery(name = "findApInvdetailByPrimaryKey", query = "select myApInvdetail from ApInvdetail myApInvdetail where myApInvdetail.code = ?1"),
		@NamedQuery(name = "findApInvdetailBySumPriceImp", query = "select myApInvdetail from ApInvdetail myApInvdetail where myApInvdetail.sumPriceImp = ?1") })

@Table(schema = "public", name = "ap_invdetail")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "gen/org/o7planning/sbjsp/choishop/domain", name = "ApInvdetail")

public class ApInvdetail implements Serializable {
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

	@Column(name = "price_unit_")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer priceUnit;
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

	@Column(name = "count_product_imp")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer countProductImp;
	/**
	 */

	@Column(name = "sum_price_imp")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer sumPriceImp;
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
	public void setPriceUnit(Integer priceUnit) {
		this.priceUnit = priceUnit;
	}

	/**
	 */
	public Integer getPriceUnit() {
		return this.priceUnit;
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
	public void setCountProductImp(Integer countProductImp) {
		this.countProductImp = countProductImp;
	}

	/**
	 */
	public Integer getCountProductImp() {
		return this.countProductImp;
	}

	/**
	 */
	public void setSumPriceImp(Integer sumPriceImp) {
		this.sumPriceImp = sumPriceImp;
	}

	/**
	 */
	public Integer getSumPriceImp() {
		return this.sumPriceImp;
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
	public ApInvdetail() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(ApInvdetail that) {
		setCode(that.getCode());
		setCodeProduct(that.getCodeProduct());
		setPriceUnit(that.getPriceUnit());
		setPriceUnitTransport(that.getPriceUnitTransport());
		setPriceUnitOther(that.getPriceUnitOther());
		setCountProductImp(that.getCountProductImp());
		setSumPriceImp(that.getSumPriceImp());
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
		buffer.append("priceUnit=[").append(priceUnit).append("] ");
		buffer.append("priceUnitTransport=[").append(priceUnitTransport).append("] ");
		buffer.append("priceUnitOther=[").append(priceUnitOther).append("] ");
		buffer.append("countProductImp=[").append(countProductImp).append("] ");
		buffer.append("sumPriceImp=[").append(sumPriceImp).append("] ");
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
		if (!(obj instanceof ApInvdetail))
			return false;
		ApInvdetail equalCheck = (ApInvdetail) obj;
		if ((code == null && equalCheck.code != null) || (code != null && equalCheck.code == null))
			return false;
		if (code != null && !code.equals(equalCheck.code))
			return false;
		return true;
	}
}
