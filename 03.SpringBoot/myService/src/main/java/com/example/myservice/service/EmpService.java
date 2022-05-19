package com.example.myservice.service;

import com.example.myservice.model.Emp;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * packageName : com.example.myservice.service
 * fileName : EmpService
 * author : jc
 * date : 2022-05-13
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-13         jc          최초 생성
 */

public interface EmpService {
    public List<Emp> selectEmp();

    void insertEmpMember(Emp emp);
}
