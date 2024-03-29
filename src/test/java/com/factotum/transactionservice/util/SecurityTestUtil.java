package com.factotum.transactionservice.util;

import org.springframework.security.oauth2.jwt.Jwt;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

public class SecurityTestUtil {

    private SecurityTestUtil() {
    }

    public static Jwt getTestJwt() {
        return getTestJwt("5809b48e-b705-4b3e-be9f-16ce0380cb45");
    }

    public static Jwt getTestJwt(String userId) {

        Map<String, Object> claims = new HashMap<>();
        claims.put("sub", userId);

        Map<String, Object> headers = new HashMap<>();
        headers.put("typ", "JWT");
        headers.put("alg", "RS256");

        return new Jwt("value", Instant.now(), Instant.now().plusSeconds(20), headers, claims);
    }

}
