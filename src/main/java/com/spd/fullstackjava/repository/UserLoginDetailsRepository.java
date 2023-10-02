package com.spd.fullstackjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.spd.fullstackjava.entity.UserLoginDetails;

/**
 * User Login Details Repository to perform the database operations
 * on user_login_details table
 *
 * @author  Shiva Prasad Das
 * @version 1.0
 * @since   2023-10-02
 */
@Repository
public interface UserLoginDetailsRepository extends JpaRepository<UserLoginDetails, String> {

	@Query(value = "select a.* from user_login_details a, user_bank_details b "
			+ "where a.user_id = b.user_id and a.user_id = :userId and a.password= :password "
			+ "and b.bank_name = :bankName", nativeQuery = true)
	UserLoginDetails findByUserIdAndPasswordAndBank(@Param("userId") String userId, 
			@Param("password") String password, @Param("bankName") String bankName);

}
