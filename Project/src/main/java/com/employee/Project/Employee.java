package com.employee.Project;

public abstract class Employee 
{
    public int fixed=10000;
    int hourly=500;
    int base=12000;
    String dep;
    public String fname;
    public String lname;
    public int age;
    public abstract int salary();
}
