import java.util.ArrayList;
import java.util.List;
public class TuitionCenter {

//DATA
    private String address;
    private List<Tutor> tutors;
    private List<Student> students;

    public TuitionCenter(String address){
        this.address = address;
        this.tutors = new ArrayList<>();
        this.students = new ArrayList<>();
    }
//OPERATIONS
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {

        return address;
    }
    public void addtutors(Tutor tutor) {
        tutors.add(tutor);
    }
    public void removenumtutors(Tutor tutor) {
        tutors.remove(tutor);
    }
    public int getnumtutors(){
        return tutors.size();
    }

    public void addnumstud(Student student) {
        students.add(student);
    }
    public void removenumstud(Student student) {
        students.remove(student);
    }
    public int getnumstud(){
        return students.size();
    }

    public double getAverageMarks() {
        float totalmarks = 0;
        float nummarks = 0;
        for (Student student : students) {
            List<Float> marks = student.getMarks();
            for (Float mark : marks) {
                totalmarks += mark;
                nummarks++;
            }
        }
        if (nummarks > 0) {
            return (float) totalmarks / nummarks;
        } else {
            return 0;
        }
    }

    public Float getMinMarks() {
        Float minmarks = (float) Integer.MAX_VALUE;
        for (Student student : students) {
            List<Float> marks = student.getMarks();
            for (Float mark : marks) {
                if (mark < minmarks) {
                    minmarks = mark;
                }
            }
        }
        if (minmarks == (float) Integer.MAX_VALUE) {
            return (float) 0;
        } else {
            return minmarks;
        }
    }

    public Float getMaxMarks() {
        Float maxmarks = (float)Integer.MIN_VALUE;
        for (Student student : students) {
            List<Float> marks = student.getMarks();
            for (Float mark : marks) {
                if (mark > maxmarks) {
                    maxmarks = mark;
                }
            }
        }
        if (maxmarks == (float)Integer.MIN_VALUE) {
            return (float) 0;
        } else {
            return maxmarks;
        }
    }

    public List<String> getTutorQuals() {
        List<String> quals = new ArrayList<>();
        for (Tutor tutor : tutors) {
            quals.add(tutor.getQual());
        }
        return quals;
    }
}

