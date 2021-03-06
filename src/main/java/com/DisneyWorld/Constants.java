package com.DisneyWorld;

public class Constants {
	// Spring Security

		public static final String LOGIN_URL = "/auth/login";
		public static final String INDEX_URL = "/index.html";
		public static final String CSS_URL = "/css/**";
		public static final String HEADER_AUTHORIZACION_KEY = "Authorization";
		public static final String TOKEN_BEARER_PREFIX = "Bearer ";

		// JWT

		//public static final String ISSUER_INFO = "https://www.autentia.com/";
		public static final String SUPER_SECRET_KEY = "abcdefghIJKLM123456789abcdefghIJKLM123456789abcdefghIJKLM123456789abcdefghIJKLM123456789abcdefghIJKLM123456789";
		public static final long TOKEN_EXPIRATION_TIME = 864_000_000; // 10 day
}
