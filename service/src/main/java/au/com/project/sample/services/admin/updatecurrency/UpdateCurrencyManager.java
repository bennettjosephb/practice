package au.com.project.sample.services.admin.updatecurrency;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.process.CurrencyController;
import au.com.project.sample.process.impl.dto.CurrencyDTO;
import au.com.project.sample.services.model.CurrencyInfo;

public class UpdateCurrencyManager {

	private static Logger log = Logger.getLogger(UpdateCurrencyManager.class);

	@Autowired
	private CurrencyController currencyController;

	private CurrencyDTO updateCurrencyInfoDTO(
			UpdateCurrencyRequest updateCurrencyRequest) {
		CurrencyDTO categoryInfoDTO = new CurrencyDTO();

		CurrencyInfo categoryInfo = updateCurrencyRequest.getMessage()
				.getCurrencyInfo();
		categoryInfoDTO.setCode(categoryInfo.getCode());
		categoryInfoDTO.setName(categoryInfo.getName());

		return categoryInfoDTO;
	}

	public UpdateCurrencyResponse updateCurrencyResponse(
			UpdateCurrencyRequest updateCurrencyRequest) {
		UpdateCurrencyResponse updateCurrencyResponse = new UpdateCurrencyResponse();

		updateCurrencyResponse.setMessage(new UpdateCurrencyResponse.Message());

		currencyController
				.updateCurrency(updateCurrencyInfoDTO(updateCurrencyRequest));

		updateCurrencyResponse.getMessage().setStatus(true);

		return updateCurrencyResponse;
	}

	public CurrencyController getCurrencyController() {
		return currencyController;
	}

	public void setCurrencyController(CurrencyController currencyController) {
		this.currencyController = currencyController;
	}

}
