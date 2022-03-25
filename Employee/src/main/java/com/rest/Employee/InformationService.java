package com.rest.Employee;

import java.util.*;

import org.springframework.stereotype.Service;

@Service
public class InformationService implements Iservice 
{

    @Override
    public List<Information> findAll() 
    {
        ArrayList<Information> list=new ArrayList<Information>();
        list.add(new Information(1,"TARUN","BISHT",22,"DEVELOPMENT"));
        list.add(new Information(2,"MANKIRAT","KAUR",22,"MEDICAL"));
        list.add(new Information(3,"HITESH","MOUDGIL",25,"IT"));
        list.add(new Information(4,"TANIYA","BISHT",26,"AUTOMATION"));
        list.add(new Information(5,"DESHRAJ","BISHT",44,"MANAGEMENT"));
        return list;
    }
    
}
