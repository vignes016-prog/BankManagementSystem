package com.example.BankManagementSystem.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.BankManagementSystem.dto.Account;
import com.example.BankManagementSystem.Repository.AccountRepository;
@Component
public class AccountDaoImplement implements AccountDao{
@Autowired
AccountRepository accountRepository;

@Override
public Account saveAccount(Account account) {
	
	return accountRepository.save(account);
}

@Override
public Account getAccountById(int Id) {
  Optional<Account>optional=accountRepository.findById(Id);
	return optional.get();
	}

@Override
public List<Account> getAllAccount(){
	return accountRepository.findAll();
}

@Override
public String  deleteAccount(int Id)
{
	Account account=getAccountById(Id);
accountRepository.delete(account);
return "Delete";
}
@Override
public Account updateAccount(int Id,Account account)
{
	return accountRepository.save(account);
}

	


}
