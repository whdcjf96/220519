package com.example.myservice.service;

import com.example.myservice.dao.DeptDao3;
import com.example.myservice.model.Dept3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * packageName : com.example.myservice.service
 * fileName : DeptServiceImpl3
 * author : jc
 * date : 2022-05-13
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-13         jc          최초 생성
 */
@Service
public class DeptServiceImpl3 implements DeptService3{
    @Autowired
    DeptDao3 deptDao3;

    @Override
    public List<Dept3> selectAll3() {
        return deptDao3.selectAll3();
    }

    @Override
    public void insertMember3(Dept3 dept3) {
        deptDao3.insert3(dept3
        );
    }
}
