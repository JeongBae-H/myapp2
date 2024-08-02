package com.test.myapp5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeManager {
    @Autowired
    Employee employee;
   
    @Autowired
    public void setAddress(Address address){
        employee.setAddress(address);
    }
    public String getAddress(){
        return this.employee.getAddress().getLocation();
    }
}
