package au.com.project.sample.services.admin.getdesignation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.process.DesignationController;
import au.com.project.sample.process.impl.dto.DesignationDTO;
import au.com.project.sample.services.model.DesignationInfo;

public class GetDesignationManager {

	@Autowired
	private DesignationController currencyController;

	private List<DesignationInfo> updateDesignationInfo(List<DesignationDTO> getDesignationRequest) {
		List<DesignationInfo> currencyInfo = new ArrayList<DesignationInfo>();
//		DesignationInfo currency = getDesignationRequest.getMessage().getDesignationInfo();
//		currencyDTO.setCode(currency.getCode());
//		currencyDTO.setName(currency.getName());
		return currencyInfo;
	}

	public GetDesignationResponse getDesignationResponse(
			GetDesignationRequest getDesignationRequest) {

		GetDesignationResponse getDesignationResponse = new GetDesignationResponse();

		getDesignationResponse.setMessage(new GetDesignationResponse.Message());

//		updateDesignationInfo(currencyController.findAllDesignation());
		
		getDesignationResponse.getMessage().getDesignationInfo().addAll(updateDesignationInfo(currencyController.findAllDesignation()));

//		getDesignationResponse.getMessage().setStatus(true);

		return getDesignationResponse;

	}

	public DesignationController getDesignationController() {
		return currencyController;
	}

	public void setDesignationController(DesignationController currencyController) {
		this.currencyController = currencyController;
	}
}
