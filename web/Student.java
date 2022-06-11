package web;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity @Table(name="students")
public class Student{
    @Id
    public int code;
    public String name;
    public char gender;
    public double score;
    public transient String room;
}
