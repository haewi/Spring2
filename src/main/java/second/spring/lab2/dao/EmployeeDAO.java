package second.spring.lab2.dao;

import java.util.List;

import second.spring.lab2.model.EmployeeVO;
 
public interface EmployeeDAO 
{
    public List<EmployeeVO> getAllEmployees();
}