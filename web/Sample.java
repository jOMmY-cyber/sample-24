package web;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
class Sample{
    @RequestMapping("/api/list-student")
    List m1(){
        return (List) x.findAll();
    }
    @RequestMapping("/api/list-male")
    List m2(){
        return x.findByGender('M');
    }
    @RequestMapping("/api/list-top")
    List m3(){
        return x.findByScoreGreaterThan(90);
    }
    @RequestMapping("/api/list-over")
    List m4(){
        return x.find123();
    }
    @Autowired
    StudentRepository x;
}