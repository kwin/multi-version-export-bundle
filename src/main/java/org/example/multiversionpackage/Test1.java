package org.example.multiversionpackage;

import org.example.anotherpackage.Used;

public class Test1 {

    public String helloWorld() {
        return new Used().use("Test1");
    }
}
