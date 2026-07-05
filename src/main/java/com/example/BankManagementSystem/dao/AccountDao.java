package com.example.BankManagementSystem.dao;

import java.util.List;

import com.example.BankManagementSystem.dto.Account;

public interface AccountDao {

	public Account saveAccount(Account account);

	public Account getAccountById(int Id);
	
	public List<Account> getAllAccount();
	
	public String deleteAccount(int id);

	public Account updateAccount(int Id,Account account);
}
