package com.gcit.training.library.hbm.entities;
// default package
// Generated Feb 12, 2015 3:39:38 PM by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TblPublisher generated by hbm2java
 */
@Entity
@Table(name = "tbl_publisher", catalog = "library")
public class TblPublisher implements java.io.Serializable {

	private Integer publisherId;
	private String publisherName;
	private String publisherAddress;
	private String publisherPhone;
	private Set<TblBook> tblBooks = new HashSet<TblBook>(0);

	public TblPublisher() {
	}

	public TblPublisher(String publisherName) {
		this.publisherName = publisherName;
	}

	public TblPublisher(String publisherName, String publisherAddress,
			String publisherPhone, Set<TblBook> tblBooks) {
		this.publisherName = publisherName;
		this.publisherAddress = publisherAddress;
		this.publisherPhone = publisherPhone;
		this.tblBooks = tblBooks;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "publisherId", unique = true, nullable = false)
	public Integer getPublisherId() {
		return this.publisherId;
	}

	public void setPublisherId(Integer publisherId) {
		this.publisherId = publisherId;
	}

	@Column(name = "publisherName", nullable = false, length = 45)
	public String getPublisherName() {
		return this.publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	@Column(name = "publisherAddress", length = 45)
	public String getPublisherAddress() {
		return this.publisherAddress;
	}

	public void setPublisherAddress(String publisherAddress) {
		this.publisherAddress = publisherAddress;
	}

	@Column(name = "publisherPhone", length = 45)
	public String getPublisherPhone() {
		return this.publisherPhone;
	}

	public void setPublisherPhone(String publisherPhone) {
		this.publisherPhone = publisherPhone;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblPublisher")
	public Set<TblBook> getTblBooks() {
		return this.tblBooks;
	}

	public void setTblBooks(Set<TblBook> tblBooks) {
		this.tblBooks = tblBooks;
	}

}