package com.cbabackend.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.cbabackend.beans.Bank;
import com.cbabackend.util.SQLConstants;

public class BankDAOImp   implements  BankDAO{

	@Autowired
	
	private  JdbcTemplate  jdbcTemplate;
	
	
	@Override
	public  Integer saveTheBankInf(Bank bank){
		return jdbcTemplate.update(SQLConstants.SQL_SAVE_BANK_DETAILS, bank.getBankId(),bank.getBankName(),bank.getBankDesc());
	}
}
