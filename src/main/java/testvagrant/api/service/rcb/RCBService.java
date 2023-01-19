package testvagrant.api.service.rcb;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import io.restassured.response.Response;
import testvagrant.api.listeners.ExtentReporter;
import testvagrant.api.model.Endpoint;
import testvagrant.api.service.rcb.model.RCBTeam;
import testvagrant.api.utils.common.Config;
import testvagrant.api.utils.http.IRestResponse;
import testvagrant.api.utils.http.RequestType;
import testvagrant.api.utils.http.RestClient;
import testvagrant.api.utils.http.RestResponse;

/** This service will is responsible for all data operations for the RCB team.
 *
 * @author pawansharma
 *
 */
public class RCBService {
	private static final Logger LOGGER = LoggerFactory.getLogger(RCBService.class);
	private static final String BASE_URL = Config.getProperty("base.url");
	private static final Map<String, Endpoint> OPERATIONS = new HashMap<String, Endpoint>() {
		{
			put("getRCBPlayerList", new Endpoint(BASE_URL + "/1e759f27ae302be92ad51ec09955e765/raw/184cef7125e6ef5a774e60de31479bb9b2884cb5/TeamRCB.json", RequestType.GET));
          
			
			
			
			// we can put here all the endpoints that are present in RCB service
		}
	};

	/**
	 *  It will retrieve data for RCB players.
	 * @return RCBTeam object
	 */
	public static IRestResponse<RCBTeam> getRCBPlayerList() {
		ExtentReporter.info("Getting RCB player list");
		Endpoint endpointDetails = OPERATIONS.get("getRCBPlayerList");
		Response response = RestClient.submitRequest(endpointDetails.getRoute(), endpointDetails.getRequestType());
		Assert.assertEquals(response.getStatusCode(), 200);
		
		return new RestResponse<>(RCBTeam.class, response);
	}
	
	// TDOD we can also make non-static methods in case if we want to run the tests in parallel and can follow the object creation approach as well for each class. Can use dependency injection if required
}
