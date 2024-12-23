package com.laoumri.socialmediabackend.security.services;

import jakarta.servlet.http.HttpServletRequest;

/**
 * JwtService interface defines operations for handling JSON Web Tokens (JWTs).
 * This service provides methods to generate, validate, and extract information from JWTs.
 */
public interface JwtService {

    /**
     * Extracts a JWT token from the cookies of an HTTP request.
     *
     * @param request the {@link HttpServletRequest} containing the cookies.
     * @return the JWT token as a {@link String}, or {@code null} if no token is found.
     */
    String getJwtTokenFromCookie(HttpServletRequest request);

    /**
     * Generates a JWT token for the given email.
     *
     * @param email the email address to be included as a claim in the token.
     * @return a signed JWT token as a {@link String}.
     */
    String generateJwtTokenFromEmail(String email);

    /**
     * Extracts the email address from a given JWT token.
     *
     * @param token the JWT token as a {@link String}.
     * @return the email address included in the token as a claim.
     */
    String getEmailFromJwtToken(String token);

    /**
     * Validates a JWT token to ensure it is properly signed and not expired.
     *
     * @param token the JWT token as a {@link String}.
     * @return {@code true} if the token is valid, otherwise {@code false}.
     */
    boolean isTokenValid(String token);
}

