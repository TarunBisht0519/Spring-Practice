package com.rest.repository;
import com.rest.Employee.*;
import org.springframework.data.repository.CrudRepository;
public interface EmployeeRepository extends CrudRepository<Information, String>   
{

}
