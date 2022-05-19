package com.example.myservice.service;

import com.example.myservice.dao.DeptDao2;
import com.example.myservice.model.Dept;
import com.example.myservice.model.Dept2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * packageName : com.example.myservice.service
 * fileName : DeptServiceImpl2
 * author : jc
 * date : 2022-05-13
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-13         jc          최초 생성
 */
@Service
public class DeptServiceImpl2 implements DeptService2{
    @Autowired
    DeptDao2 deptDao2;

    @Override
    public List<Dept2> selectAll2() {
        return deptDao2.selectAll2();
    }

    @Override
    public void insertMember2(Dept2 dept2) {
        deptDao2.insert2(dept2);

    }

    @Override
    public void updateMember2(int dno, Dept2 updateDept) {
        Dept2 dept2 = deptDao2.selectById2(dno);

        if (dept2 != null) {
            dept2.setDname(updateDept.getDname());
            dept2.setLoc(updateDept.getLoc());
            deptDao2.update2(dept2);
        }else {
            throw new IllegalStateException("부서가 존재하지 않습니다.");
        }
    }

    @Override
    public void deleteMember2(int dno) {
        Dept2 dept2 = deptDao2.selectById2(dno);

        if (dept2 != null) {

            deptDao2.delete2(dno);
        }else {
            throw new IllegalStateException("부서가 존재하지 않습니다.");
        }
    }
}
