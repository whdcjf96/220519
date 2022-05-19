package com.example.myservice.service;

import com.example.myservice.model.Dept3;

import java.util.List;

/**
 * packageName : com.example.myservice.service
 * fileName : DeptService3
 * author : jc
 * date : 2022-05-13
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-13         jc          최초 생성
 */
public interface DeptService3 {
    public List<Dept3> selectAll3();

    void insertMember3(Dept3 dept3);
}
