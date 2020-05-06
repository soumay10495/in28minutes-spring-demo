package com.example.spring.demo.xml;

public class XMLPersonDAO {
    XMLJdbcConnection jdbcConnection;

    public XMLPersonDAO() {
        System.out.println("XMLPersonDao constructor");
    }

    public XMLJdbcConnection getXMLJdbcConnection() {
        return jdbcConnection;
    }

    public void setXMLJdbcConnection(XMLJdbcConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }
}
