package com.example.myservice.service;

import com.example.myservice.model.Tb;

import java.util.List;

/**
 * packageName : com.example.myservice.service
 * fileName : TbService
 * author : jc
 * date : 2022-05-16
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-16         jc          최초 생성
 */
public interface TbService {
    List<Tb> selectTb();

    void insertTbMember(Tb tb);
}
