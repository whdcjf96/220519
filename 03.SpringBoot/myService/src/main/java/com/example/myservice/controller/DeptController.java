package com.example.myservice.controller;

import com.example.myservice.dao.*;
import com.example.myservice.model.*;
import com.example.myservice.service.*;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * packageName : com.example.myservice.controller
 * fileName : DeptController
 * author : jc
 * date : 2022-05-12
 * description : 메뉴달기
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-12         jc          최초 생성
 */
//@RestController : 메뉴달기, 반환값 : json파일형태
//@Controller : jsp, html, 타임리프 파일 형태
//  Rest API : CRUD (Insert : Post, Select : Get, Update : Put, Delete : Delete)
@RestController
public class DeptController {

//    @Autowired : 객체를 자동 의존성 주입( 자동 DI)
    @Autowired
    DeptDao deptDao;
    @Autowired
    DeptDao3 deptDao3;

    @Autowired
    EmpDao empDao;

    @Autowired
    EmpServiceImpl empService;

    @GetMapping("/emp/all")
    public List<Emp> selectEmp(){
        List<Emp> list = empDao.selectEmp();
        return list;
    }
    @PostMapping("/emp/new")
    public List<Emp> insertEmpMember(Emp emp){
        empService.insertEmpMember(emp);
        return empDao.selectEmp();
    }

    //    @Autowired : 객체를 자동 의존성 주입( 자동 DI), 대상 : 스프링에 등록된 객체만
//    스프링에 객체를 등록 : 클래스 위에 @Component , @Service, @repository
    @Autowired
    DeptServiceImpl deptService;
    @Autowired
    DeptServiceImpl3 deptServiceImpl3;


//    @GetMapping : 메뉴 달기 : /main, select실행
//    localhost:8000/main 접속 : 새메뉴
    @GetMapping("/dept/all")
    public List<Dept> selectAll(){
        List<Dept> list = deptDao.selectAll();
        return list;
    }

//    @PostMapping : insert 실행
//    HTML : 헤더(머리말), 본문(BODY)
//    @RequestBody : 본문에 TEXT/JSON 형태로 데이터를 전송하겠다
    @PostMapping("/dept/new")
    public List<Dept> insertMember(@RequestBody Dept dept){
//        웹브라우저에서 json형태로 데이터를 넘겨받아( dept 객체 )
//        DB에 INSERT문을 실행하는 부분
        deptService.insertMember(dept);
//        데이터 추가되었는지 결과 확인 ( DB Select )
        return deptDao.selectAll();
    }

    //   @PutMapping : update 어노테이션
//    @PathVariable : URL 메뉴 /dept/{dno} 중에서 dno를 의미함
//    웹브라우저 URL 매개변수{dno}를 메소드 updateMember의 매개변수 dno로 연결
//    웹 애플리케이션 개발 : 웹 URL 형태
//    형태 1( 전통 ) : http://127.0.0.1/read?no=1 : html, JSP, 타임리프 개발
//    @GetMapping("read")
//    메소드의 매개변수 : @RequestParam("no") int no
//    형태 2( REST API ) : http://127.0.0.1/read/1
//                      : Rest API , axios 이용, 데이터(json), Vue, react
//    @GetMapping("read/{no}")
//    메소드의 매개변수 : @PathVariable("no") int no
    @PutMapping("/dept/{dno}")
    public List<Dept> updateMember(@PathVariable int dno
            ,@RequestBody Dept dept) {
//        update 문 실행
        deptService.updateMember(dno, dept);
//        데이터 수정되었는지 전체 데이터 다시 조회
        return deptService.selectAll();
    }

//    Delete sql문 실행
//    @DeleteMapping : 데이터 삭제에 해당하는 웹 브라우저 URL어노테이션
    @DeleteMapping("/dept/{dno}")
        public List<Dept> deleteMember(@PathVariable int dno) {

//        데이터 삭제 메소드 호출
        deptService.deleteMember(dno);

    //        데이터 삭제되었는지 전체 데이터 다시 조회
    return deptService.selectAll();
}

   @GetMapping("/dept3/all")
    public List<Dept3> selectAll3(){
        List<Dept3> list = deptDao3.selectAll3();
        return list;
    }
    @PostMapping("/dept3/new")
    public List<Dept3> insertMember3(@RequestBody Dept3 dept3){
        deptServiceImpl3.insertMember3(dept3);
        return deptDao3.selectAll3();
    }
    @Autowired
    DeptDao2 deptDao2;

    @Autowired
    DeptServiceImpl2 deptService2;

    @GetMapping("/dept2/all")
    public List<Dept2> selectAll2(){
        List<Dept2> list = deptDao2.selectAll2();
        return list;
    }

    @PostMapping("/dept2/new")
    public List<Dept2> insertMember(@RequestBody Dept2 dept2){
        deptService2.insertMember2(dept2);
        return deptDao2.selectAll2();
    }
    @PutMapping("/dept2/{dno}")
    public List<Dept2> updateMember2(@PathVariable int dno, @RequestBody Dept2 dept2){
        deptService2.updateMember2(dno,dept2);
        return deptService2.selectAll2();
    }

    @DeleteMapping("/dept2/{dno}")
    public List<Dept2> deleteMember2(@PathVariable int dno){
        deptService2.deleteMember2(dno);
        return deptService2.selectAll2();
    }

    @Autowired
    TbDao tbDao;
    @Autowired
    TbServiceImpl tbService;

    @GetMapping("/tb/all")
    public List<Tb> selectTb(){
        List<Tb> list = tbDao.selectTb();
        return list;
    }
    @PostMapping("/tb/new")
    public List<Tb> insertTbMember(@RequestBody Tb tb){
        tbService.insertTbMember(tb);
        return tbDao.selectTb();
    }
}
