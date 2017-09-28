package com.cbabackend.dao;

import com.cbabackend.beans.WorkingHours;

/**
 * * This interface is used to save the Complet WorkingHours Details of Common
 * Wealth Bank from Data-Base
 * @author venkat
 *
 */
public interface WorkingHoursDAO {
public  abstract Integer  saveTheWorkingDetailsOfTheBank(WorkingHours workinghours);
}
