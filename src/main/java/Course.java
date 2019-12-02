import org.joda.time.DateTime;

public class Course {
    private String courseName;
    private Module[] cModulesList;
    private Student[] cStudentList;
    private DateTime startDate;
    private DateTime endDate;

    Course(String courseName, Module[] cModulesList, Student[] cStudentList, DateTime startDate, DateTime endDate)
    {
        this.courseName = courseName;
        this.cModulesList=cModulesList;
        this.cStudentList=cStudentList;
        this.startDate=startDate;
        this.endDate=endDate;
    }

    public Course(String courseName, Module[] cModulesList, Student[] cStudentList, String format, String format1) {

    }


    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Module[] getcModulesList() {
        return cModulesList;
    }

    public void setcModulesList(Module[] cModulesList) {
        this.cModulesList = cModulesList;
    }

    public Student[] getcStudentList() {
        return cStudentList;
    }

    public void setcStudentList(Student[] cStudentList) {
        this.cStudentList = cStudentList;
    }
}
