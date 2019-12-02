import com.sun.xml.internal.bind.v2.model.core.ID;
import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.util.Date;

public class Student {
    private String Name;
    private int Age;
    private String DOB;
    private float ID;
    private String username;
    private Course[] Courses;
    private Module[] Modules;

    Student(String Name, int Age, String DOB, float ID, Course[] Courses, Module[] Modules)
    {
        this.Name = Name;
        this.Age = Age;
        this.DOB =DOB;
        this.ID = ID;
        this.Courses = Courses;
        this.Modules = Modules;
    }



    public Module[] getModules() {
        return Modules;
    }

    public void setModules( Module[] modules) {
        Modules = modules;
    }

    public Course[] getCourses() {
        return Courses;
    }

    public void setCourses(Course[] courses) {
        Courses = courses;
    }

    public String getUsername() {

        return Name.concat(getDOB());
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public float getID() {
        return ID;
    }

    public void setID(float ID) {
        this.ID = ID;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
