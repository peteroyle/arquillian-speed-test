package com.example.test;

import javax.ejb.Stateless;
import java.io.Serializable;
import javax.ejb.EJB;

@Stateless
public class HelloLocalBean implements HelloLocal, Serializable {

    @Override
    public String sayHelloLocal(String name) {
            return "Hello " + name;
    }

}
