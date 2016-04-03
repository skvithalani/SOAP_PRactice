package com.test;

import javax.jws.WebService;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by salonivithalani on 4/3/16.
 */
@XmlType(name = "TestingClass", namespace = "ns")
public class TestingClass {
    public String name;

    public TestingClass(){
        name = "Testing class name";
    }

    public TestingClass(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
