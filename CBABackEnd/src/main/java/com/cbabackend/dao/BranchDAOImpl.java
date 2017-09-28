package com.cbabackend.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.cbabackend.beans.Branch;
import com.cbabackend.util.SQLConstants;

/**
 * This Class is used to save the Branch Details of Common Wealth
 * Bank from Data-Base
 * @author venkat
 *
 */
public class BranchDAOImpl  implements  BranchDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;


	@Override
	public Integer saveBankBranchDetails(final Branch branch) {
		return 	jdbcTemplate.update(SQLConstants.SQL_SAVE_BRANCH_DETAILS,branch.getBranchId(),
				branch.getAddress(),branch.getBranchCode(),branch.getBranchName(),
				branch.getCity(),branch.getCountry(),branch.getEmail(),branch.getPhoneNumber1(),
				branch.getPhoneNumber2(),branch.getRegionId(),branch.getState(),branch.getSwiftCode(),
				branch.getWorkingHoursId(),branch.getZipcode());


	}

}
