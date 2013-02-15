package au.com.project.sample.registration.services.getcountry;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;

public class GetCountryImplementation implements GetCountry {

	public GetCountryResponse getCountry(GetCountryRequest request)
			throws BusinessFault, TechnicalFault {
		try {
			System.out.println(request);
//			System.out.println(request.getId());

			System.out.println(request.getHeader());
			System.out.println(request.getHeader().getFrom());
			System.out.println(request.getMessage());
			System.out.println(request.getMessage().getId());
			System.out.println(request.getMessage().getName());
			System.out.println(request.getMessage().getCode());
		} catch (Exception e) {
			e.printStackTrace();
		}

		GetCountryResponse getCountryResponse = new GetCountryResponse();
		getCountryResponse.setMessage(new GetCountryResponse.Message());
		// getCountryResponse.getMessage().setCountry(country);
//		getCountryResponse.setId("RESPONSE ID");
		// getCountryResponse.setMessage()
		return getCountryResponse;
	}
}