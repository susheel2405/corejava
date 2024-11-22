package com.neoteric.learning.method;

import java.util.Date;

public class Employee {

    public String employeename;
    public String empid;
    public String address;
    public Date dob;

    public Employee(){

    }
    public Employee(String employeename,String address,Date dob){
        this.employeename = employeename;
        this.address = address;
        
    }
}
