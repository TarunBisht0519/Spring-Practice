package com.calculator.Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Subtraction 
{
    @Autowired
    Alertsub object;
    int c;
    public void subtract(int a,int b)
    {
        if(a>b)
        {
            c=a-b;
        }
        else
        {
            c=b-a;
        }
        object.alert(c);
    }

   
    
}
