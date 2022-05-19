package com.example.myservice.service;

import com.example.myservice.dao.TbDao;
import com.example.myservice.model.Tb;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * packageName : com.example.myservice.service
 * fileName : TbServiceImpl
 * author : jc
 * date : 2022-05-16
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-16         jc          최초 생성
 */
@Service
public class TbServiceImpl implements TbService{
    @Autowired
    TbDao tbDao;

    Logger logger = LoggerFactory.getLogger(TbServiceImpl.class);

    @Override
    public List<Tb> selectTb() {
        List<Tb> list = tbDao.selectTb();
        return list;
    }

    @Override
    public void insertTbMember(Tb tb) {

        logger.info(" tb : {}", tb);
        System.out.println(" tb : " + tb);
        tbDao.insertTb(tb);

    }
}
