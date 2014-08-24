package com.dmitriy.jaxws.publish;

import com.dmitriy.jaxws.OrderProcessService;

import javax.xml.ws.Endpoint;

/**
 * Created by dmitriy on 8/24/14.
 */
public class OrderWebServicePublisher {

    public static void main(String [] args){

        Endpoint.publish("http://localhost:8081/OrderProcessWeb/orderprocess", new OrderProcessService());

        System.out.println("The web service is published at http://localhost:8081/OrderProcessWeb/orderprocess");

        System.out.println("To stop running the web service , terminate the java process");
    }
}
