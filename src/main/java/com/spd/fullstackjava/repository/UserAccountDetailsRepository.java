package com.spd.fullstackjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spd.fullstackjava.entity.UserAccountDetails;

/**
 * User Account Details Repository to perform the database operations
 * on user_account_details table
 *
 * @author  Shiva Prasad Das
 * @version 1.0
 * @since   2023-10-02
 * 
 */
@Repository
public interface UserAccountDetailsRepository extends JpaRepository<UserAccountDetails, String> {

}
