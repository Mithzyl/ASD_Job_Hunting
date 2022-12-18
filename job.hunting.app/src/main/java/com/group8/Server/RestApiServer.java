package com.group8.Server;

public class RestApiServer {
    private static RestApiServer single_instance = null;

    public void listen(Object HttpRequest, Object HttpMethod) throws InterruptedException {
        while(true){
            Thread.sleep(2000);
            System.out.println("listening.......");
        }
    }

    private Object process(Object HttpRequest, Object HttpMethod){
        Object HttpResponse = new Object();
        return HttpResponse;
    }


    // constructor

    private RestApiServer() {

    }

    public static RestApiServer getInstance() {
        if (single_instance == null)
            single_instance = new RestApiServer();
        return single_instance;
    }
}
