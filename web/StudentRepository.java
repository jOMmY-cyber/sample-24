package web;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository 
        extends CrudRepository<Student,Integer>
{
    List<Student> findByGender(char g);
    List<Student> findByScoreGreaterThan(double x);
    @Query("select s from Student s " + "where s.gender = 'M' and "
            +"s.score>=" +
            "(select avg(score) from Student m where m.gender = 'M' ) ")
    List<Student> find123();
}


// An amazing Framework
// CRUD -> C=> Create , R=> Read / Retrieve , U=> Update , D=> Delete