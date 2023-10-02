package com.spd.fullstackjava.entity;

import java.util.Date;

import javax.persistence.*;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;


/**
 * Entity class for User Bank Details.
 * Mapped to user_bank_details table.
 *
 * @@author  Shiva Prasad Das
 * @version 1.0
 * @since   2023-10-02
 */
@Entity
@EntityScan
@ComponentScan

public class AccountTransactionDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer transactionId;
	private String accountNumber;
	private String transactionDescription;
	private Double amount;
	private Double closingBalance;
	private String debitCreditInd;
	private Date updatedDateTime;

	public AccountTransactionDetails() {
		super();
	}

	public AccountTransactionDetails(String accountNumber, String transactionDescription,
			Double amount, Double closingBalance, String debitCreditInd, Date updatedDateTime) {
		super();
		this.accountNumber = accountNumber;
		this.transactionDescription = transactionDescription;
		this.amount = amount;
		this.closingBalance = closingBalance;
		this.debitCreditInd = debitCreditInd;
		this.updatedDateTime = updatedDateTime;
	}

	public Integer getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getTransactionDescription() {
		return transactionDescription;
	}

	public void setTransactionDescription(String transactionDescription) {
		this.transactionDescription = transactionDescription;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getClosingBalance() {
		return closingBalance;
	}

	public void setClosingBalance(Double closingBalance) {
		this.closingBalance = closingBalance;
	}

	public String getDebitCreditInd() {
		return debitCreditInd;
	}

	public void setDebitCreditInd(String debitCreditInd) {
		this.debitCreditInd = debitCreditInd;
	}

	public Date getUpdatedDateTime() {
		return updatedDateTime;
	}

	public void setUpdatedDateTime(Date updatedDateTime) {
		this.updatedDateTime = updatedDateTime;
	}

	@Override
	public String toString() {
		return "AccountTransactionDetails [transactionId=" + transactionId + ", accountNumber=" + accountNumber
				+ ", transactionDescription=" + transactionDescription + ", amount=" + amount + ", closingBalance="
				+ closingBalance + ", debitCreditInd=" + debitCreditInd + ", updatedDateTime=" + updatedDateTime + "]";
	}

}
