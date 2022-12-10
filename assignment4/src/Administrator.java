import java.util.ArrayList;
public class Administrator {
    private ArrayList<Student> studentList;
    private CourseDatabase database;
    public Administrator(){
        database = new CourseDatabase();
        studentList = new ArrayList<Student>();
    }
    public void addStudent(Student student) {
        studentList.add(student);
    }
    public void addStudent(int studentID) {
        studentList.add(new Student(studentID));
    }
    public void generateCurriculum() {
        ArrayList<Student> ary = new ArrayList<>();
        for (Student st : studentList) {
            Student now = new Student(st.getStudentID());
            ary.add(now);
            for (int i = 0; i < st.getCurriculum().size(); i++) {
                int cnt = 0;
                for (Student ss : studentList) {
                    for (int j = 0; j < ss.getCurriculum().size(); j++) {
                        if (st.getCurriculum().get(i).equals(ss.getCurriculum().get(j))) {
                            if (st.getCrd().get(i) <= ss.getCrd().get(j)) ++cnt;
                            break;
                        }
                    }
                }
                if (cnt - 1 >= st.getCurriculum().get(i).getCapacity()) {
                    ary.get(ary.size() - 1).selectCourse(st.getCurriculum().get(i), 0);
                }
            }
        }
        for (int i = 0; i < ary.size(); i++) {
            for (Course crs : ary.get(i).getCurriculum())
                studentList.get(i).dropCourse(crs);
        }
    }

    public CourseDatabase getDatabase() {
        return database;
    }
}