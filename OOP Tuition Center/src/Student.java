import java.util.ArrayList;
import java.util.List;
public class Student {

//DATA

    private Name name;
    private String ic;
    private String address;
    private int year;
    private String schoolname;
    private List<Float> marks;


//CONSTRUCTORS
    public Student(String ic, int year, String schoolname) {
        this.ic = ic;
        this.year = year;
        this.schoolname = schoolname;
        this.marks = new ArrayList<>();
    }


//OPERATIONS
    public void setName(Name name) {
        this.name = name;
    }
    public Name getName() {
        return name;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }
    public String getIc() {
        return ic;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public int getYear(){
        return year;
    }

    public void setSchoolname (String schoolname) {
        this.schoolname = schoolname;
    }
    public String getSchoolname () {
        return schoolname;
    }

    public void addMarks(float mark) {
        marks.add(mark);
    }
    public void removeMarks(float mark) {
        marks.remove(mark);
    }
    public List<Float> getMarks() {
        return marks;
    }

}