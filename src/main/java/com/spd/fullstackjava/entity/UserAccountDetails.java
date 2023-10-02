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

public class UserAccountDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String accountNumber;
	private Double accountBalance;
	private Date updatedDateTime;

	public UserAccountDetails() {
		super();
	}

	public UserAccountDetails(String accountNumber, Double accountBalance, Date updatedDateTime) {
		super();
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.updatedDateTime = updatedDateTime;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(Double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public Date getUpdatedDateTime() {
		return updatedDateTime;
	}

	public void setUpdatedDateTime(Date updatedDateTime) {
		this.updatedDateTime = updatedDateTime;
	}

	@Override
	public String toString() {
		return "UserAccountDetails [accountNumber=" + accountNumber + ", accountBalance=" + accountBalance
				+ ", updatedDateTime=" + updatedDateTime + "]";
	}

}
