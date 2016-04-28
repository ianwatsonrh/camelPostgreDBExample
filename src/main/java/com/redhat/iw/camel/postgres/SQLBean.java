package com.redhat.iw.camel.postgres;

/**
 * A bean which we use in the route
 */
public class SQLBean {

    public String hello() {
        return "select * from customer where customer_id = :?id;";
    }

}
