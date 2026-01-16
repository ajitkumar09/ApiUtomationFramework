package com.api.filters;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.restassured.filter.Filter;
import io.restassured.filter.FilterContext;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.FilterableResponseSpecification;

public class LoggingFilter implements Filter {

    private static final Logger logger = LogManager.getLogger(LoggingFilter.class);

    @Override
    public Response filter(FilterableRequestSpecification requestSpec,
                           FilterableResponseSpecification responseSpec,
                           FilterContext ctx) {

        // Log Request
        logRequest(requestSpec);

        // Continue request & capture response
        Response response = ctx.next(requestSpec, responseSpec);

        // Log Response
        logResponse(response);

        return response;
    }

    public void logRequest(FilterableRequestSpecification requestSpec) {
        logger.info("BASE URI: " + requestSpec.getBaseUri());
        logger.info("REQUEST METHOD: " + requestSpec.getMethod());
        logger.info("REQUEST PATH: " + requestSpec.getURI());
        logger.info("REQUEST HEADERS: " + requestSpec.getHeaders());
        logger.info("REQUEST BODY: " + requestSpec.getBody());
    }

    public void logResponse(Response response) {
        logger.info("STATUS CODE: " + response.getStatusCode());
        logger.info("RESPONSE BODY: " + response.getBody().asPrettyString());
    }
}

