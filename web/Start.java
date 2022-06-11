package web;
//import java.util.ArrayList;
//import java.util.LinkedList;

import javax.sql.DataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import java.util.List;
//import java.util.Set;
//import java.util.TreeSet;
//import java.util.Map;
//import java.util.TreeMap;

class Start{
    public static void main(String[] data){
        ApplicationContext context;
        context = SpringApplication.run(Prepare.class);
//        List<Integer> a = new ArrayList<>();
//        a.add(8);
//        a.add(5);
//        a.add(7);
//        System.out.println(a);
//       Set w = new TreeSet();
//       w.add(1); w.add(3);
//       w.add(1); //w.add(2.5>
//       System.out.println(w);
//       
//       
//       
//       Set<String> s = new TreeSet<>();
//       s.add("Latte");
//       s.add("Espresso");
//       s.add("Latte");
//       s.add("Mocha");
////       System.out.println(s);
//       for(String i : s){
//           System.out.println(i);
//       }

//        Map<String, Integer> m = new TreeMap<>();
//        m.put("Bang Rak",65800);
//        m.put("Talingchan",87200);
//        m.put("Bang Plad",72500);
//        
//        Integer p = m.get("Bang Sue");
//        System.out.println(p);
    }
}
// List , Set , Map


@SpringBootApplication
class Prepare{
    @Bean
    DriverManagerDataSource dataSource(){
        var source = new DriverManagerDataSource();
        source.setUrl("jdbc:mysql://localhost/sample");
        source.setUsername("john");
        source.setPassword("john");
        return source;
    }
}

@RestController
class Check{
    @RequestMapping("/check")
    String check() {return "This is OK";}
}