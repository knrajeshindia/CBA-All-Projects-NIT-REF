package com.cbabackend.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.cbabackend.beans.WorkingHours;
import com.cbabackend.util.SQLConstants;

/**
 * This Class is used to save the Complete WorkingHours Details of Common Wealth
 * Bank from Data-Base
 * @author venkat
 *
 */
public class WorkingHoursDAOImpl implements  WorkingHoursDAO{

	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Integer saveTheWorkingDetailsOfTheBank( final WorkingHours workinghours) {
		
		return jdbcTemplate.update(SQLConstants.SQL_SAVE_WORKING_HOURS,workinghours.getId(),workinghours.getOpeningHours(),workinghours.getClosingHours());
	}

	
}
