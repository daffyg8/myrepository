package com.example.honmework.dao;

import com.example.honmework.pojo.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
@Mapper
public class DepartmentDao {
    private static Map<Integer, Department> departmentMap = null;

    static {
        departmentMap = new HashMap<Integer,Department>();

        departmentMap.put(101,new Department(101,"人事部"));
        departmentMap.put(102,new Department(102,"市场部"));

    }

    public Collection<Department> getDepartments(){
        return departmentMap.values();
    }

    public Department getDepartmentById(Integer id){
        return departmentMap.get(id);
    }

}
