/*
 * To change this template, choose Tools | Templates
 * and open the template in the updateor.
 */
package au.com.project.sample.process.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.domain.Currency;
import au.com.project.sample.domain.EmploymentSummary;
import au.com.project.sample.domain.Salary;
import au.com.project.sample.persistence.CurrencyDAO;
import au.com.project.sample.persistence.EmploymentSummaryDAO;
import au.com.project.sample.process.EmploymentSummaryController;
import au.com.project.sample.process.impl.dto.CurrencyDTO;
import au.com.project.sample.process.impl.dto.EmploymentSummaryDTO;
import au.com.project.sample.process.impl.dto.SalaryDTO;

/**
 *
 * @author SONY
 */
public class EmploymentSummaryControllerImpl implements
		EmploymentSummaryController {

	@Autowired
	private EmploymentSummaryDAO employmentSummaryDAO;

	@Autowired
	private CurrencyDAO currencyDAO;

	private EmploymentSummary populateEmploymentSummary(
			EmploymentSummaryDTO employmentSummaryDTO) {
		EmploymentSummary employmentSummary = new EmploymentSummary();

		if (employmentSummaryDTO.getDesignation() != null) {
			employmentSummary.setDesignation(employmentSummaryDTO
					.getDesignation());
		}

		employmentSummary.setEntityName(employmentSummaryDTO.getEntityName());
		employmentSummary.setFromDate(employmentSummaryDTO.getFromDate());
		employmentSummary.setToDate(employmentSummaryDTO.getTodate());

		if (employmentSummaryDTO.getJoiningDesignation() != null) {
			employmentSummary.setJoiningDesignation(employmentSummaryDTO
					.getJoiningDesignation());
		}
		if (employmentSummaryDTO.getLeavingDesignation() != null) {
			employmentSummary.setLeavingDesignation(employmentSummaryDTO
					.getLeavingDesignation());
		}

		if (employmentSummaryDTO.getLeavingSalary() != null) {
			employmentSummary
					.setLeavingSalary(populateSalary(employmentSummaryDTO
							.getLeavingSalary()));
		}
		if (employmentSummaryDTO.getJoiningSalary() != null) {
			employmentSummary
					.setJoiningSalary(populateSalary(employmentSummaryDTO
							.getJoiningSalary()));
		}
		if (employmentSummaryDTO.getSalary() != null) {
			employmentSummary.setSalary(populateSalary(employmentSummaryDTO
					.getSalary()));
		}

		return employmentSummary;
	}

	private Salary populateSalary(SalaryDTO salaryDTO) {
		Salary salary = new Salary();

		salary.setCurrency(populateCurrency(salaryDTO.getCurrency()));
		salary.setValue(salary.getValue());

		return salary;
	}

	private Currency populateCurrency(CurrencyDTO currencyDTO) {
		return currencyDAO.findCurrencyByCode(currencyDTO.getCode());
	}

	public void createEmploymentSummary(
			EmploymentSummaryDTO employmentSummaryDTO) {
		employmentSummaryDAO
				.createEmploymentSummary(populateEmploymentSummary(employmentSummaryDTO));
	}

	public void updateEmploymentSummary(EmploymentSummaryDTO employmentSummaryDTO) {
	}

	public void deleteEmploymentSummary(
			EmploymentSummaryDTO employmentSummaryDTO) {
		employmentSummaryDAO
				.deleteEmploymentSummary(populateEmploymentSummary(employmentSummaryDTO));
	}

	public EmploymentSummaryDTO findEmploymentSummary(Object id) {
		return null;
	}

	public List<EmploymentSummaryDTO> findAllEmploymentSummary() {
		return null;
	}

	public List<EmploymentSummaryDTO> findRangeEmploymentSummary(int[] range) {
		return null;
	}

	public int countEmploymentSummary() {
		return 0;
	}

}
