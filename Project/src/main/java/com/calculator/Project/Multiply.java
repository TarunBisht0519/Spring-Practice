package com.calculator.Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Multiply 
{
    @Autowired
    Alertmul object;
    int c;
    public void multiply(int a ,int b)
    {
        c=a*b;
        object.alert(c);
    }

    

}
