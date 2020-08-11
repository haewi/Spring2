package second.spring.lab2.service;

import java.util.List;

import second.spring.lab2.model.EmployeeVO;
 
public interface EmployeeManager 
{
    public List<EmployeeVO> getAllEmployees();
}