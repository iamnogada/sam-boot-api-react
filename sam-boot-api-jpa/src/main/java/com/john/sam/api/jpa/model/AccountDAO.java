package com.john.sam.api.jpa.model;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

@Transactional
public interface AccountDAO extends CrudRepository<Account, String> {
	List<Account> findByEmail(String email);
}
