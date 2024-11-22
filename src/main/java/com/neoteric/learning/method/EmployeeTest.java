package com.neoteric.learning.method;

import java.util.Date;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee noarguments = new Employee();
        noarguments.employeename = "susheel";
        noarguments.address = "suryapet";
        Employee withparameterized = new Employee("susheel", "suryapet", new Date());


        System.out.println(withparameterized.address);
        System.out.println(noarguments.address);
    }
}
