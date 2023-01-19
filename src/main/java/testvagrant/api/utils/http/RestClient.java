package testvagrant.api.utils.http;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

/**
 * This class is a common utility for all the type of operations that can be performed for an API.
 * @author pawansharma
 *
 */
public class RestClient {
	private static final Logger LOGGER = LoggerFactory.getLogger(RestClient.class);

	private static final RequestSpecification request;

	static {
		request = RestAssured.given();
		request.header("Content-Type", "application/json");
		request.filter(new OverrideContentTypeFilter());  // To filter "text/plain" responses https://stackoverflow.com/a/56635177
	}

	/**
	 * This function is responsible for performing http requests
	 * 
	 * @param endpoint    : e.g https://www.reques/us/v1/countries
	 * @param requestType : e.g RequestType.POST, RequestType.PUT, RequestType.GET
	 * @param body        : any Object
	 * @return api response
	 */
	public static Response submitRequest(String endpoint, RequestType requestType, Object... body) {
		LOGGER.info("Submitting {} request for [{}]" , requestType.toString(), endpoint);
		Response response = null;

		switch (requestType) {
		case DELETE:
			response = request.delete(endpoint);
			break;
		case GET:
			response = request.get(endpoint);
			break;
		case POST:
			request.body((String) body[0]);
			response = request.post(endpoint);
			break;
		case PUT:
			request.body((String) body[0]);
			response = request.put(endpoint);
			break;
		case PATCH:
			request.body((String) body[0]);
			response = request.put(endpoint);
			break;
		default:
			break;

		}

		return response;
	}

}
