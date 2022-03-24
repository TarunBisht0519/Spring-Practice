package com.calculator.Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Addition 
{
    @Autowired
    Alertadd object;
    public void add(int a,int b)
    {
        int c=a+b;
        object.compile(c);
    }
}
