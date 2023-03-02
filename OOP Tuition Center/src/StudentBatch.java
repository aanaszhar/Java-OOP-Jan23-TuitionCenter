import java.util.ArrayList;
import java.util.List;
public class StudentBatch {

//DATA
    private List<Student> studbatch;

    public StudentBatch() {
        this.studbatch = new ArrayList<>();
    }

//OPERATIONS
    public void addStudent(Student student) {
        studbatch.add(student);
    }
    public void removeStudent(Student student) {
        studbatch.remove(student);
    }
    // !!operations to find students with the same name ina  batch

}