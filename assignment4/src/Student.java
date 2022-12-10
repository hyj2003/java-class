import java.util.ArrayList;
public class Student {
    private int studentID;
    private ArrayList<Course> curriculum;

    private ArrayList<Integer> crd;
    private int remainingCredit;
    public Student(int studentID) {
        this.studentID = studentID;
        curriculum = new ArrayList<Course>();
        crd = new ArrayList<Integer>();
        this.remainingCredit = 100;
    }
    public boolean selectCourse(Course course, int credit) {
        if (credit > remainingCredit) return false;
        for (Course i : curriculum) {
            for (SUSTechTime j : i.getTimeList()) {
                for (SUSTechTime k : course.getTimeList()) {
                    if (j.getWeekType() == WeekType.Even && j.getWeekType() == WeekType.Odd) continue;
                    if (j.getWeekType() == WeekType.Odd && j.getWeekType() == WeekType.Even) continue;
                    if (j.getStartTime().equals(k.getStartTime()) || j.getEndTime().equals(k.getEndTime())) return false;
                }
            }
        }
        curriculum.add(course);
        crd.add(credit);
        remainingCredit -= credit;
        return true;
    }
    public void dropCourse(Course course) {
        int pos = curriculum.indexOf(course);
        if (pos == -1) return ;
        curriculum.remove(pos);
        remainingCredit += crd.get(pos);
        crd.remove(pos);
    }
    public void changeCredit(Course course, int credit) {
        int pos = curriculum.indexOf(course);
        int c = crd.get(pos);
        if (remainingCredit + c - credit < 0) return ;
        remainingCredit += crd.get(pos);
        crd.set(pos, credit);
        remainingCredit -= credit;
    }

    public ArrayList<Course> getCurriculum() {
        return curriculum;
    }

    public int getStudentID() {
        return studentID;
    }

    public ArrayList<Integer> getCrd() {
        return crd;
    }

    public void setCurriculum(ArrayList<Course> curriculum) {
        this.curriculum = curriculum;
    }


}