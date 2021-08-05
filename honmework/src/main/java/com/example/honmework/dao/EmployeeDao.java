package com.example.honmework.dao;

import com.example.honmework.pojo.Department;
import com.example.honmework.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
@Mapper
public class EmployeeDao {

    private static Map<Integer, Employee> employeeMap;

    @Autowired
    private DepartmentDao departmentDao;

    static int max;
    private static int initId;

    static {
        employeeMap = new HashMap<>();

        employeeMap.put(1001, new Employee(1001, "张三", new Department(101, "人事部")));
        employeeMap.put(1002, new Employee(1002, "李四", new Department(101, "人事部")));

        initId = 1003;

    }


    public void save(Employee employee){
        if(employee.getId()==null){
            employee.setId(initId++);
        }

        employee.setDepartment(departmentDao.getDepartmentById(employee.getDepartment().getId()));

        employeeMap.put(employee.getId(), employee);

    }

    public Collection<Employee> getAll(){
        return employeeMap.values();
    }

    public Employee getEmployeeById(Integer id){
        return employeeMap.get(id);
    }

    public void delete(Integer id){
        employeeMap.remove(id);
    }

}
