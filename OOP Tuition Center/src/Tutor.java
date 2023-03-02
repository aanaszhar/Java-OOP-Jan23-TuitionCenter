import java.util.ArrayList;
import java.util.List;
public class Tutor {

//DATA
    private Name name;
    private String ic;
    private String address;
    private String qual;
    private int yearsexp;
    private String datejoined;
    private int yearssinceenter;

    public Tutor(String ic, String address, String qual, int yearsexp,String datejoined, int yearssinceenter) {
        this.ic = ic;
        this.address = address;
        this.qual = qual;
        this.yearsexp = yearsexp;
        this.datejoined = datejoined;
        this.yearssinceenter = yearssinceenter;
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

    public void setQual(String qual) {
        this.qual = qual;
    }
    public String getQual(){
        return qual;
    }

    public void setYearsexp(int yearsexp) {
        this.yearsexp = yearsexp;
    }
    public int getYearsexp() {
        return yearsexp;
    }

    public void setDatejoined(String datejoined) {
        this.datejoined = datejoined;
    }
    public String getDatejoined() {
        return datejoined;
    }

    public void setYearssinceenter(int yearssinceenter) {
        this.yearssinceenter = yearssinceenter;
    }
    public int getYearssinceenter() {
        return yearssinceenter;
    }

}