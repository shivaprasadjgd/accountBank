package com.spd.fullstackjava.entity;

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
public class UserBankDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String bankId;
	private String userId;
	private String bankName;
	private String accountType;

	@OneToOne(targetEntity = UserAccountDetails.class, cascade=CascadeType.ALL)
	@JoinColumn(name = "accountNumber", referencedColumnName = "accountNumber")
	private UserAccountDetails userAccountDetails;

	public UserBankDetails() {
		super();
	}

	public UserBankDetails(String bankId, String userId, String bankName,
			String accountType, UserAccountDetails userAccountDetails) {
		super();
		this.bankId = bankId;
		this.userId = userId;
		this.bankName = bankName;
		this.accountType = accountType;
		this.userAccountDetails = userAccountDetails;
	}

	public String getBankId() {
		return bankId;
	}

	public void setBankId(String bankId) {
		this.bankId = bankId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public UserAccountDetails getUserAccountDetails() {
		return userAccountDetails;
	}

	public void setUserAccountDetails(UserAccountDetails userAccountDetails) {
		this.userAccountDetails = userAccountDetails;
	}

	@Override
	public String toString() {
		return "UserBankDetails [bankId=" + bankId + ", userId=" + userId + ", bankName=" + bankName + ", accountType="
				+ accountType + ", userAccountDetails=" + userAccountDetails + "]";
	}

}
