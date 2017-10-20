package com.john.sam.api.jpa.model;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

@Transactional
public interface AccountDAO extends CrudRepository<Account, String> {
	@Query("select count(a.email) from Account a where a.email = ?1 and a.password=?2")
	int findByInfo(@Param("email") String email, @Param("password") String password);
}
