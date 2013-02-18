package au.com.project.sample.process.impl;

import java.util.List;

import org.apache.log4j.Logger;

import au.com.project.sample.domain.Currency;
import au.com.project.sample.persistence.CurrencyDAO;
import au.com.project.sample.process.CurrencyController;
import au.com.project.sample.process.impl.dto.CurrencyDTO;

public class CurrencyControllerImpl implements CurrencyController {

	private static Logger log = Logger.getLogger(CurrencyControllerImpl.class);

	private CurrencyDAO currencyDAO;

	private Currency updateCurrency(CurrencyDTO currencyDTO) {
		Currency currency = new Currency();

		currency.setName(currencyDTO.getName());
		currency.setCode(currencyDTO.getCode());

		return currency;
	}

	public void createCurrency(CurrencyDTO currencyDTO) {
		log.info("Creating Currency");
		currencyDAO.createCurrency(updateCurrency(currencyDTO));
		log.info("Currency Created");
	}

	public void editCurrency(CurrencyDTO currencyDTO) {
	}

	public void removeCurrency(CurrencyDTO currencyDTO) {
	}

	// public void updateSalary(Long salary, CurrencyDTO currencyDTO){}
	//
	// public void updateCurrency(String location, Location applicant){}
	//
	// public void updateCurrency(String location, Long applicantId){}
	//
	// public void addCurrency(String location, Long applicantId){}
	//
	// public void updateCurrency(CurrencyDTO currencyDTO, Long applicantId){}

	public CurrencyDTO findCurrency(Object id) {
		return null;
	}

	public List<CurrencyDTO> findAllCurrency() {
		return null;
	}

	public List<CurrencyDTO> findRangeCurrency(int[] range) {
		return null;
	}

	public int countCurrency() {
		return 0;
	}

	public CurrencyDAO getCurrencyDAO() {
		return currencyDAO;
	}

	public void setCurrencyDAO(CurrencyDAO currencyDAO) {
		this.currencyDAO = currencyDAO;
	}
}
