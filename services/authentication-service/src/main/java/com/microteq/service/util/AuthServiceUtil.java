package com.microteq.service.util;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.oauth2.core.user.OAuth2User;

public class AuthServiceUtil {

    private AuthServiceUtil(){}

    /**
     * Retrieves the username of the currently authenticated user from the security context.
     * If the user is authenticated, their username is returned. If the user is not authenticated,
     * a default value is returned.
     *
     * @return The username of the authenticated user if available, otherwise a default value.
     */
    public static String getUserFromSecurityContext() {
        // Get the current authentication object from the security context
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (authentication != null && authentication.isAuthenticated()) {
            // Get the principal (user) from the authentication object
            Object principal = authentication.getPrincipal();

            // Check if the principal is a UserDetails object (usually represents the user)
            if (principal instanceof UserDetails) {
                UserDetails userDetails = (UserDetails) principal;
                // Access user details like username, authorities, etc.
                return userDetails.getUsername();
            } else if (principal instanceof String) {
                // Handle string principal (e.g., username)
                return (String) principal;
            } else if (principal instanceof OAuth2User) {
                // Handle OAuth2 user
                OAuth2User oAuth2User = (OAuth2User) principal;
                // Retrieve the username from OAuth2 user details
                return oAuth2User.getName();
            } else {
                // Handle other types of principals if needed
                return "test";
            }
        } else {
            // Handle unauthenticated users if needed
            return "unsecured testing";
        }
    }
}
