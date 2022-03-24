package com.calculator.Project;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class WebProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(WebProjectApplication.class, args);		
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		    System.out.println("PRESS 1 FOR ENTERING NUMBERS");
		    System.out.println("PRESS 2 FOR EXITING APPLICATION");
		    int a=sc.nextInt();
		    switch(a)
		    {
		    case 1:
		        System.out.println("CALCULATOR");
		        System.out.println("ENTER FIRST NUMBER");
		        int x=sc.nextInt();
		        System.out.println("ENTER SECOND NUMBER");
		        int y=sc.nextInt();
		        System.out.println("PRESS 1 FOR ADDING");
		        System.out.println("PRESS 2 FOR SUBTRACTING");
		        System.out.println("PRESS 3 FOR MULTIPLYING");
		        System.out.println("PRESS 4 FOR DIVIDING");
		        int c=sc.nextInt();
		        switch(c)
		        {
		        case 1:
		            Addition obj=context.getBean(Addition.class);
		            obj.add(x, y);
		            break;
		        case 2:
		            Subtraction obj1=context.getBean(Subtraction.class);
		            obj1.subtract(x, y);
		            break;
		        case 3:
		            Multiply obj2=context.getBean(Multiply.class);
		            obj2.multiply(x, y);
		            break;
		        case 4:
		            Division obj3=context.getBean(Division.class);
		            obj3.divide(x, y);
		            break;
		        }
		        continue;
		    case 2:
		        System.out.println("THANKYOU FOR USING OUR APLLICATION");
		        System.exit(0);
		        
		    }
		        
		    
		}
	}

}
