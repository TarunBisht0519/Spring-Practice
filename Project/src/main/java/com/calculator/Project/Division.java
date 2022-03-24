package com.calculator.Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Division
{
    @Autowired
    Alertdiv object;
    
    public void divide(int a,int b)
    {
        try
        {
            int c=a/b;
            object.alert(c);
        }
        catch(Exception e)
        {
            System.out.println("CANT BE DIVIDED BY ZERO");
        }
    }

}
