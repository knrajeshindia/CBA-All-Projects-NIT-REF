package com.cbabackend.dao;

import com.cbabackend.beans.Bank;

/**
 * 
 * This interface is used to get the BankDetais of Common
 * Wealth Bank from Data-Base
 * 
 * @author Venkat
 * 
 *
 */
public interface BankDAO {

	
	
	public abstract Integer saveTheBankInf(Bank bank);
}
