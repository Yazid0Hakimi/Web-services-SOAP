package org.example.ws;

import jakarta.xml.ws.Endpoint;

public class serverJws {
    public static void main(String[] args) {
        String url = "http://localhost:9090/";
        Endpoint.publish(url, new BanqueService());
        System.out.println("Web service Deployé sur " + url);
    }
}
