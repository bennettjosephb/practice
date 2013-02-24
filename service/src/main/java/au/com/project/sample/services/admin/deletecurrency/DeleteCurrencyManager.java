package au.com.project.sample.services.admin.deletecurrency;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.process.CurrencyController;
import au.com.project.sample.process.impl.dto.CurrencyDTO;
import au.com.project.sample.services.model.CurrencyInfo;

public class DeleteCurrencyManager {

	@Autowired
	private CurrencyController currencyController;

	public DeleteCurrencyResponse deleteCurrencyResponse(
			DeleteCurrencyRequest deleteRoleRequest) {
		DeleteCurrencyResponse deleteRoleResponse = new DeleteCurrencyResponse();

		deleteRoleResponse.setMessage(new DeleteCurrencyResponse.Message());

		currencyController
				.deleteCurrency(updateCurrencyInfoDTO(deleteRoleRequest));

		deleteRoleResponse.getMessage().setStatus(true);

		return deleteRoleResponse;
	}

	private CurrencyDTO updateCurrencyInfoDTO(
			DeleteCurrencyRequest deleteRoleRequest) {
		
		CurrencyInfo currencyInfo = deleteRoleRequest.getMessage().getCurrencyInfo(); 
		
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
