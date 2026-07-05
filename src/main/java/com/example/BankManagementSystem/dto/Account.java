package com.example.BankManagementSystem.dto;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Component
public class Account {
@Id
@GeneratedValue(strategy =GenerationType.AUTO )
	private int accountId;
	private long accoundNumber;
	private String accountType;
	private String accountHolderName;
	private double availableBalance;
	private String branch;
}
