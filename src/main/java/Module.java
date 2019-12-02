import com.sun.xml.internal.fastinfoset.util.StringArray;

public class Module {
    private String moduleName;
    private String mID;
    private  Student[] mStudentList;
    private  Course[] mCourseList;

    Module(String moduleName, String mID, Student[] mStudentList, Course[] mCourseList)
    {
        this.moduleName = moduleName;
        this.mID = mID;
        this.mStudentList=mStudentList;
        this.mCourseList=mCourseList;
    }


    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getmID() {
        return mID;
    }

    public void setmID(String mID) {
        this.mID = mID;
    }

    public Student[] getmStudentList() {
        return mStudentList;
    }

    public void setmStudentList(Student[] mStudentList) {
        this.mStudentList = mStudentList;
    }

    public Course[] getmCourseList() {
        return mCourseList;
    }

    public void setmCourseList(Course[] mCourseList) {
        this.mCourseList = mCourseList;
    }
}
