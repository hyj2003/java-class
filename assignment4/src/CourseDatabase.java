import java.util.ArrayList;
public class CourseDatabase {
    private ArrayList<Course> courseList;
    public CourseDatabase(){ courseList = new ArrayList<Course>(); }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void addCourse(Course newCourse) {
        courseList.add(newCourse);
    }
    public void removeCourse(String courseID, int classID) {
        for (Course i : courseList) {
            if (i.getCourseID().equals(courseID) && i.getClassID() == classID) {
                courseList.remove(i);
                break;
            }
        }
    }
    public void removeCourse(Course course) {
        for (Course i : courseList) {
            if (i == course) {
                courseList.remove(i);
                break;
            }
        }
    }
    public ArrayList<Course> searchCourseByID(String courseID){
        ArrayList<Course> res = new ArrayList<Course>();
        for (Course i : courseList)
            if (i.getCourseID().equals(courseID)) res.add(i);
        return res;
    }
    public ArrayList<Course> searchCourseByTeacherName(String teacherName) {
        ArrayList<Course> res = new ArrayList<Course>();
        for (Course i : courseList)
            if (i.getTeacherName().equals(teacherName)) res.add(i);
        return res;
    }
    public ArrayList<Course> searchCourseByCourseName(String courseName) {
        ArrayList<Course> res = new ArrayList<Course>();
        for (Course i : courseList)
            if (i.getCourseName().equals(courseName)) res.add(i);
        return res;
    }
    public ArrayList<Course> searchCourseByCourseTime(String startTime, String endTime) {
        ArrayList<Course> res = new ArrayList<Course>();
        for (Course i : courseList) {
            for (SUSTechTime j : i.getTimeList()) {
                if (j.getStartTime().equals(startTime) && j.getEndTime().equals(endTime)) {
                    res.add(i);
                    break;
                }
            }
        }
        return res;
    }
}