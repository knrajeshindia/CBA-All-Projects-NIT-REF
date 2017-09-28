/*
 * Copyright (c) 2017, 2018, CBA and/or its affiliates. All rights reserved.

 * CBA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.cbabackend.beans;
import java.io.Serializable;
import java.util.Date;
/**
 * This class is used to hold the LoanDetails of Common Wealth Bank
 * 
 * @author Sushanta
 * @since CBABE 1.0
 */
public class Loan implements  Serializable{
	private Integer  loanId;
	private String loanType;
	private Date loanDuration;
	private Double loanInterestRateId;
	private Date loanIssuedDate;
	private Integer accountNumber;
	private Double issuedAmount;
	private Integer issuedBy;
	private String guarantorPersion;
	/**
	 * @return the loanId
	 */
	public Integer getLoanId() {
		return loanId;
	}
	/**
	 * @param loanId the loanId to set
	 */
	public void setLoanId(Integer loanId) {
		this.loanId = loanId;
	}
	/**
	 * @return the loanType
	 */
	public String getLoanType() {
		return loanType;
	}
	/**
	 * @param loanType the loanType to set
	 */
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	/**
	 * @return the loanDuration
	 */
	public Date getLoanDuration() {
		return loanDuration;
	}
	/**
	 * @param loanDuration the loanDuration to set
	 */
	public void setLoanDuration(Date loanDuration) {
		this.loanDuration = loanDuration;
	}
	/**
	 * @return the loanInterestRateId
	 */
	public Double getLoanInterestRateId() {
		return loanInterestRateId;
	}
	/**
	 * @param loanInterestRateId the loanInterestRateId to set
	 */
	public void setLoanInterestRateId(Double loanInterestRateId) {
		this.loanInterestRateId = loanInterestRateId;
	}
	/**
	 * @return the loanIssuedDate
	 */
	public Date getLoanIssuedDate() {
		return loanIssuedDate;
	}
	/**
	 * @param loanIssuedDate the loanIssuedDate to set
	 */
	public void setLoanIssuedDate(Date loanIssuedDate) {
		this.loanIssuedDate = loanIssuedDate;
	}
	/**
	 * @return the accountNumber
	 */
	public Integer getAccountNumber() {
		return accountNumber;
	}
	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}
	/**
	 * @return the issuedAmount
	 */
	public Double getIssuedAmount() {
		return issuedAmount;
	}
	/**
	 * @param issuedAmount the issuedAmount to set
	 */
	public void setIssuedAmount(Double issuedAmount) {
		this.issuedAmount = issuedAmount;
	}
	/**
	 * @return the issuedBy
	 */
	public Integer getIssuedBy() {
		return issuedBy;
	}
	/**
	 * @param issuedBy the issuedBy to set
	 */
	public void setIssuedBy(Integer issuedBy) {
		this.issuedBy = issuedBy;
	}
	/**
	 * @return the guarantorPersion
	 */
	public String getGuarantorPersion() {
		return guarantorPersion;
	}
	/**
	 * @param guarantorPersion the guarantorPersion to set
	 */
	public void setGuarantorPersion(String guarantorPersion) {
		this.guarantorPersion = guarantorPersion;
	}
    
}
