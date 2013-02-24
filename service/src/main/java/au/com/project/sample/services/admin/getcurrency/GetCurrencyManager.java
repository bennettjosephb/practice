package au.com.project.sample.services.admin.getcurrency;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.process.CurrencyController;
import au.com.project.sample.process.impl.dto.CurrencyDTO;
import au.com.project.sample.services.model.CurrencyInfo;

public class GetCurrencyManager {

	@Autowired
	private CurrencyController currencyController;

	private List<CurrencyInfo> updateCurrencyInfo(List<CurrencyDTO> getCurrencyRequest) {
		List<CurrencyInfo> currencyInfo = new ArrayList<CurrencyInfo>();
//		CurrencyInfo currency = getCurrencyRequest.getMessage().getCurrencyInfo();
//		currencyDTO.setCode(currency.getCode());
//		currencyDTO.setName(currency.getName());
		return currencyInfo;
	}

	public GetCurrencyResponse getCurrencyResponse(
			GetCurrencyRequest getCurrencyRequest) {

		GetCurrencyResponse getCurrencyResponse = new GetCurrencyResponse();

		getCurrencyResponse.setMessage(new GetCurrencyResponse.Message());

//		updateCurrencyInfo(currencyController.findAllCurrency());
		
		getCurrencyResponse.getMessage().getCurrencies().addAll(updateCurrencyInfo(currencyController.findAllCurrency()));

//		getCurrencyResponse.getMessage().setStatus(true);

		return getCurrencyResponse;

	}

	public CurrencyController getCurrencyController() {
		return currencyController;
	}

	public void setCurrencyController(CurrencyController currencyController) {
		this.currencyController = currencyController;
	}
}
