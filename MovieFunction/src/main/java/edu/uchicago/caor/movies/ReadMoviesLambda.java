package edu.uchicago.caor.movies;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadMoviesLambda {

    private final ObjectMapper objectMapper = new ObjectMapper();

    public APIGatewayProxyResponseEvent handleRequest (APIGatewayProxyRequestEvent requestEvent) throws JsonProcessingException {

        // simulating reading movie
        Movie movie = new Movie("12324898", "Love Story", 2022);
        return new APIGatewayProxyResponseEvent().withStatusCode(200).withBody(movie.toString());
    }
}