package com.spring.security.security04;

import org.mortbay.jetty.Connector;
import org.mortbay.jetty.Server;
import org.mortbay.jetty.bio.SocketConnector;
import org.mortbay.jetty.webapp.WebAppContext;

public class Security04JettyMain {
    public static void main(String[] args) throws Exception {
        Server jettyServer = new Server();

        SocketConnector conn = new SocketConnector();
        conn.setPort(8084);
        jettyServer.setConnectors(new Connector[]{conn});

        WebAppContext webAppContext = new WebAppContext();
        webAppContext.setContextPath("/security04");
        webAppContext.setWar("src/main/webapp");
        jettyServer.setHandler(webAppContext);
        jettyServer.start();
    }
}
