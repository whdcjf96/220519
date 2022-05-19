package com.example.myservice.dao;

import com.example.myservice.model.Tb;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * packageName : com.example.myservice.dao
 * fileName : TbDao
 * author : jc
 * date : 2022-05-16
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-16         jc          최초 생성
 */
@Mapper
public interface TbDao {
    List<Tb> selectTb();

    void insertTb(Tb tb);
}
