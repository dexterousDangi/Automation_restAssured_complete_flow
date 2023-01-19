package testvagrant.api.utils.http;

import io.restassured.builder.ResponseBuilder;
import io.restassured.filter.Filter;
import io.restassured.filter.FilterContext;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.FilterableResponseSpecification;

/**
 * We added this filter to override the content type of responses that are non-json
 * @author pawansharma
 *
 */
public class OverrideContentTypeFilter implements Filter {

    @Override
    public Response filter(FilterableRequestSpecification requestSpec,
                           FilterableResponseSpecification responseSpec,
                           FilterContext ctx) {

        Response next = ctx.next(requestSpec, responseSpec);
        return new ResponseBuilder().clone(next).setContentType(ContentType.JSON).build();
    }
}