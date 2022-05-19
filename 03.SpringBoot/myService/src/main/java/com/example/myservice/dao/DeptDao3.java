package com.example.myservice.dao;

import com.example.myservice.model.Dept3;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * packageName : com.example.myservice.dao
 * fileName : DeptDao3
 * author : jc
 * date : 2022-05-13
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-13         jc          최초 생성
 */
@Mapper
public interface DeptDao3 {
    List<Dept3> selectAll3();

    void insert3(Dept3 dept3);
}
