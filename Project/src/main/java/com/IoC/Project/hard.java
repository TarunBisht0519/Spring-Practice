package com.IoC.Project;

//EXAMPLE OF HARD COUPLING
class A
{
    public void getInfo()
    {
        System.out.println("YOU ARE INSIDE CLASS A ");
    }
}

public class hard 
{
    //HERE CLASS hard IS DIRECTLY DEPENDENT ON  class A
    public static void main(String[] args)
    {
        A obj=new A();/*If the Java class creates an instance of another class via the new operator, 
                      it cannot be used (and tested) independently from this class and 
                      this is called a hard dependency.*/
        obj.getInfo();
        //tight coupling
    }

}

class B
{
    A object;
    B(A object)
    {
        this.object=object;
    }
    public void loose()
    {
        System.out.println("NOT USING HARD DEPENDENCY");
    }
}
