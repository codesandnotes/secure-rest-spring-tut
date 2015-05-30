package codesandnotes.secure.rest.spring.tut.configuration.csrf;

public class CSRF {
	/**
	 * The name of the cookie with the CSRF token sent by the server as a response.
	 */
	public static final String RESPONSE_COOKIE_NAME = "CSRF-TOKEN";
	/**
	 * The name of the header carrying the CSRF token, expected in CSRF-protected requests to the server.
	 */
	public static final String REQUEST_HEADER_NAME = "X-CSRF-TOKEN";
}
