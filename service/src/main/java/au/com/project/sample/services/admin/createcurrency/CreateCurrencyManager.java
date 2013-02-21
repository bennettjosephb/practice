package au.com.project.sample.services.admin.createcurrency;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.process.CurrencyController;
import au.com.project.sample.process.impl.dto.CurrencyDTO;
import au.com.project.sample.services.model.CurrencyInfo;

public class CreateCurrencyManager {

	@Autowired
	private CurrencyController currencyController;

	public CreateCurrencyResponse createCurrencyResponse(
			CreateCurrencyRequest createRoleRequest) {
		CreateCurrencyResponse createRoleResponse = new CreateCurrencyResponse();

		createRoleResponse.setMessage(new CreateCurrencyResponse.Message());

		currencyController
				.createCurrency(updateCurrencyInfoDTO(createRoleRequest));

		createRoleResponse.getMessage().setStatus(true);

		return createRoleResponse;
	}

	private CurrencyDTO updateCurrencyInfoDTO(
			CreateCurrencyRequest createRoleRequest) {
		
		CurrencyInfo currencyInfo = createRoleRequest.getMessage().getCurrencyInfo(); 
		
		CurrencyDTO  currencyDTO = new CurrencyDTO();
		currencyDTO.setCode(currencyInfo.getCode());
		currencyDTO.setName(currencyInfo.getName());
		
		return currencyDTO;
		
	}

	public CurrencyController getCurrencyController() {
		return currencyController;
	}

	public void setCurrencyController(CurrencyController currencyController) {
		this.currencyController = currencyController;
	}

}
