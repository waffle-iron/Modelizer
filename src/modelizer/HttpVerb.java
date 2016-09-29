package modelizer;

/**
 * Created by erikrahtjen on 9/27/16.
 */
public enum HttpVerb {
    GET("GET"),
    POST("POST"),
    PATCH("PATCH"),
    PUT("PUT"),
    DELETE("DELETE");

    String value = "";

    HttpVerb(String name) {
        this.value = name;
    }
}