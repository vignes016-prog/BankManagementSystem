package com.example.BankManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.BankManagementSystem.dao.AccountDao;
import com.example.BankManagementSystem.dto.Account;
@RestController
public class AccountController {
@Autowired
AccountDao accountDao;

@PostMapping("/save")
public Account createAccount(@RequestBody Account account)
{
	accountDao.saveAccount(account);
	return account;
}
@GetMapping("/get/{Id}")
public Account getAccountById(@PathVariable int Id)
{
	return accountDao.getAccountById(Id);
}
@GetMapping("/get")
public List<Account> getListOfAccounts(){
	return accountDao.getAllAccount();
}
@DeleteMapping("/delete/{Id}")
public String removeAccount(@PathVariable int Id)
{
	return accountDao.deleteAccount(Id);
}
@PostMapping("update/{Id}")
public Account updateAccount(@PathVariable int Id,@RequestBody Account account)
{
	accountDao.saveAccount(account);
	return account;
}
}
