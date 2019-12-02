import org.joda.time.DateTime;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void getUsername() {
        Student student = new Student("Emma",22,"11/08/1997",14412345,null,null);
        assertEquals("Emma11/08/1997",student.getUsername());
    }

    @Test
    public void getAge(){
        Student student = new Student("Jack",22,"24/12/1997",11232345,null,null);
        assertEquals(22,student.getAge());
    }

    @Test
    public void getDOB(){
        Student student = new Student("Colm",22,"25/10/1997",15672555,null,null);
        assertEquals("25/10/1997",student.getDOB());
    }

    @Test
    public void getCourses(){
        Course CS = new Course("Computer Science",null,null, DateTime.parse("02-09-19"),DateTime.parse("05-05-22"));
        Course ECE = new Course("Electronic & Computer Engineering",null,null, DateTime.parse("30-08-19"),DateTime.parse("01-05-22"));
        Course courses[] = {CS,ECE};

        Student student = new Student("Colm",22,"25/10/1997",15672555,courses,null);
        assertEquals(new Course[]{CS, ECE},student.getCourses());

    }

    @Test
    public void getModules(){
        Module mod1 = new Module("Machine Learning","CT4101",null,null);
        Module mod2 = new Module("Software Engineering III","CT417",null,null);
        Module mod3 = new Module("System on Chip I","EE451",null,null);

        Module modules[] = {mod1,mod2,mod3};

        Student student = new Student("Colm",22,"25/10/1997",15672555,null,modules);
        assertEquals(new Module[]{mod1,mod2,mod3},student.getModules());

    }
}