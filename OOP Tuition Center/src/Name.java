public class Name {

//DATA
    private String fname;
    private String mname;
    private String lname;

//CONSTRUCTORS
    public Name(String fname, String mname, String lname) {
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
}


//OPERATIONS

    public void setFName(String fname) {
        this.fname = fname;
    }
    public String getFName() {
        return fname;
    }

    public void setMName(String mname) {
        this.mname = mname;
    }
    public String getMName() {
        return fname;
    }
    public void setLName(String lname) {
        this.lname = lname;
    }
    public String getLName() {
        return lname;
    }

    public String getFullName() {
        return fname +" "+ mname +" "+ lname;
    }

}