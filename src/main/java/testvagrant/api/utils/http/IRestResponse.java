package testvagrant.api.utils.http;

import io.restassured.response.Response;

public interface IRestResponse<T> {
	
	public T getBody();

	public String getContent();

	public int getStatusCode();

	public String getStatusDescription();

	public Response getResponse();

	public Exception getException();
}