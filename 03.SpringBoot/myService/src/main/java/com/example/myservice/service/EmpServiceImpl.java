package com.example.myservice.service;

import com.example.myservice.dao.EmpDao;
import com.example.myservice.model.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * packageName : com.example.myservice.service
 * fileName : EmpServiceImpl
 * author : jc
 * date : 2022-05-13
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-13         jc          최초 생성
 */
@Service
public class EmpServiceImpl implements EmpService{
    @Autowired
    EmpDao empDao;

    @Override
    public List<Emp> selectEmp() {
        List<Emp> list = empDao.selectEmp();
        return list;
    }

    @Override
    public void insertEmpMember(Emp emp) {
        empDao.insertEmp(emp);

    }
}
