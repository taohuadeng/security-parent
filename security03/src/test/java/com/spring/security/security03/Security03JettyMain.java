package com.spring.security.security03;

import org.mortbay.jetty.Connector;
import org.mortbay.jetty.Server;
import org.mortbay.jetty.bio.SocketConnector;
import org.mortbay.jetty.webapp.WebAppContext;

public class Security03JettyMain {
    public static void main(String[] args) throws Exception {
        Server jettyServer = new Server();

        SocketConnector conn = new SocketConnector();
        conn.setPort(8083);
        jettyServer.setConnectors(new Connector[]{conn});

        WebAppContext webAppContext = new WebAppContext();
        webAppContext.setContextPath("/security03");
        webAppContext.setWar("src/main/webapp");
        jettyServer.setHandler(webAppContext);
        jettyServer.start();
    }
}
