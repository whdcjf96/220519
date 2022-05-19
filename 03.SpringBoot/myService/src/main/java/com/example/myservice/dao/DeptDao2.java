package com.example.myservice.dao;

import com.example.myservice.model.Dept2;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * packageName : com.example.myservice.dao
 * fileName : DeptDao2
 * author : jc
 * date : 2022-05-13
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-13         jc          최초 생성
 */
@Mapper
public interface DeptDao2 {
    List<Dept2> selectAll2();

    Dept2 selectById2(int dno);
    void insert2(Dept2 dept2);

    void update2(Dept2 dept2);

    void delete2(int dno);

}
