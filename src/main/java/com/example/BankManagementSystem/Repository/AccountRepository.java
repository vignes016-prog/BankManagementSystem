package com.example.BankManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BankManagementSystem.dto.Account;

public interface AccountRepository extends JpaRepository<Account, Integer>{

	

}
