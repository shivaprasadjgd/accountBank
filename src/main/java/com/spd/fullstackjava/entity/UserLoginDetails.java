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

public class UserLoginDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String userId;
	private String password;

	public UserLoginDetails() {
		super();
	}

	public UserLoginDetails(String userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + "]";
	}

}
