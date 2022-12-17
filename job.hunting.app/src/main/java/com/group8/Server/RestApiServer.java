package com.group8.Server;

public class RestApiServer<T, V, R> {
    private static RestApiServer single_instance = null;

    public R listen(T HttpRequest, V HttpMethod){return null;}

    private R process(T HttpRequest, V HttpMethod){return null;}


    // constructor

    private RestApiServer() {

    }

    public static RestApiServer getInstance() {
        if (single_instance == null)
            single_instance = new RestApiServer();
        return single_instance;
    }
}
