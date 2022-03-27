package com.rest.Employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController 
{
    @Autowired
    private Iservice iservice;  
  //mapping the getProduct() method to /product  
  @GetMapping(value = "/employee")  
  public List<Information> getProduct()   
  {  
  //finds all the products  
  List<Information> products = iservice.findAll();  
  //returns the product list  
  return products;  
  }
  /*@RequestMapping(value="/add-user", method=RequestMethod.POST)    
  public void addUser(@RequestBody Information info)  
  {    
      iservice.addEmployee(info);    
  }  
  */  
 }  
 
  


