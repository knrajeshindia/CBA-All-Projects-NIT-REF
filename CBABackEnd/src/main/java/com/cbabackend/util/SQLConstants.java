/*
 * Copyright (c) 2017, 2018, CBA and/or its affiliates. All rights reserved.
 * CBA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.cbabackend.util;

/**
 * This class is used hold the All SQL Query from FlatFiles
 * 
 * @author Sathish.Bandi
 * @since CBABE 1.0
 */
public class SQLConstants {
	/**
	 * Hold the SQL-Query
	 */
	public static final String SQL_SAVE_WORKING_HOURS = "insert into WorkingHours(working_hour_id,opening_hours,closing_hours) values(?,?,?) ";
	public static final String SQL_SAVE_BANK_DETAILS = "insert into Bank(bank_id,bank_name,bank_desc) values(?,?,?) ";
	public static final String SQL_SAVE_REGION_DETAILS = "insert into Region(region_id,region_name,region_code,region_head_office,region_desc,region_address,bank_id) values(?,?,?,?,?,?,?)";
	public static final String SQL_SAVE_BRANCH_DETAILS = "insert into Branch(branch_id,branch_name,branch_code,phone_number1,phone_number2,email,swift_code,working_hours_id,branch_address,branch_city,branch_state,branch_country,branch_zipcode,region_id) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	public static final String SQL_GET_ACCOUNT_TRANSACTIONS="select account_id,transaction_type,transaction_date,transaction_amount,transaction_status,transaction_mode,transaction_desc,updated_by from Account_Transactions where account_transaction_id=?";
public static final String SQL_UPDATE_ACCOUNT_TRANSACTIONS="update Account_Transactions set transaction_amount=?,transaction_date=?,transaction_status=?,transaction_mode=?,transaction_type=? where account_transaction_id=?";
public static final String SQL_SAVE_ACCOUNT_TRANSACTIONS="insert into Account_Transactions(account_transaction_id,account_id,transaction_amount,transaction_date,transaction_mode,transaction_type,transaction_status,transaction_desc,updated_by) values(?,?,?,?,?,?,?,?,?) ";

}
