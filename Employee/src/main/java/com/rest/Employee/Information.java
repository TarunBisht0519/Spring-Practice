package com.rest.Employee;

public class Information 
{
    private int id;  
    private String Fname;  
    private String Lname;  
    private int age;  
    private String department;  
    public Information()  
    {
    }  
  
    public Information(int id, String Fname, String Lname, int age, String department)   
    {  
        super();  
        this.id = id;  
        this.Fname= Fname;  
        this.Lname= Lname;  
        this.age = age;  
        this.department =department;  
    }  
    public int getId()   
    {  
        return id;  
    }  
    public void setId(int id)   
    {  
        this.id = id;  
    }  
    public String getFname()   
    {  
        return Fname;  
    }  
    public void setFname(String Fname)   
    {  
        this.Fname = Fname;  
    }  
    public String getLname()   
    {  
        return Lname;  
    }  
    public void setLname(String Lname)   
    {  
        this.Lname = Lname;  
    }   
    public int getAge()   
    {  
        return age;  
    }  
    public void setAge(int age)   
    {  
        this.age = age;  
    }  
    public String getDepartment()   
    {  
        return department;  
    }  
    public void setNoofproduct(String department)   
    {  
        this.department = department;  
    }  
}  


