package com.example.myservice.service;

import com.example.myservice.model.Dept;
import com.example.myservice.model.Dept2;

import java.util.List;

/**
 * packageName : com.example.myservice.service
 * fileName : DeptService2
 * author : jc
 * date : 2022-05-13
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-13         jc          최초 생성
 */
public interface DeptService2 {
    public List<Dept2> selectAll2();

    void insertMember2(Dept2 dept2);

    void updateMember2(int dno, Dept2 updateDept);

    void deleteMember2(int dno);
}
