package com.cbabackend.dao;

import com.cbabackend.beans.Branch;

/**
 * * This interface is used to save the Branch Details of Common
 * Wealth Bank from Data-Base
 * @author venkat
 *
 */
public interface BranchDAO {

	public abstract Integer saveBankBranchDetails(Branch branch);
	
}
