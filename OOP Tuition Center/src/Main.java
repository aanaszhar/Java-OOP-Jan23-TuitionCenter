public class Main {

    public static void main(String[] args) {

    //STUDENT
        Name studname1 = new Name("Ahmad", "Anas", "Azhar");
        Address studadd1 = new Address("Jalan V4", "Seri Iskandar", "12345", "Perak");
        Student anas = new Student("22005996", 6, "KMB");
        anas.addMarks(30);
        anas.addMarks(10);
        anas.addMarks(20);

        System.out.println("---Student Info---");
        System.out.println("Name: " + studname1.getFullName());
        System.out.println("IC: " + anas.getIc());
        System.out.println("Address: " + studadd1.getFullAddress());
        System.out.println("Year: " + anas.getYear());
        System.out.println("Marks: " + anas.getMarks());
        System.out.println("");

        Name studname2 = new Name("Muhd", "Hanis", "Afifi");
        Address studadd2 = new Address("Pasar Payang", "Kuala Ganu Boh", "12345", "Terengganu");
        Student hanis = new Student("22001602", 5, "RMC");
        hanis.addMarks(70);
        hanis.addMarks(60);
        hanis.addMarks(50);

        System.out.println("---Student Info---");
        System.out.println("Name: " + studname2.getFullName());
        System.out.println("IC: " + hanis.getIc());
        System.out.println("Address: " + studadd2.getFullAddress());
        System.out.println("Year: " + hanis.getYear());
        System.out.println("Marks: " + hanis.getMarks());
        System.out.println("");

    //TUTORS
        Name tutname1 = new Name("Nur", "Ira", "Jef");
        Tutor ira = new Tutor("13563236", "Selangor", "2 years teaching", 2, "05/12", 2);

        System.out.println("---Tutor Info---");
        System.out.println("Name: " + tutname1.getFullName());
        System.out.println("IC: " + ira.getIc());
        System.out.println("Address: " + ira.getAddress());
        System.out.println("Qualifications: " + ira.getQual());
        System.out.println("Year of Experience: " + ira.getYearsexp());
        System.out.println("Date Joined: " + ira.getDatejoined());
        System.out.println("Years since enter: " + ira.getYearssinceenter());
        System.out.println("");

        Name tutname2 = new Name("Sir", "Nordin", "Zakaria");
        Tutor nordin = new Tutor("12356546", "Selangor", "20 years teaching", 20, "2010", 20);

        System.out.println("---Tutor Info---");
        System.out.println("Name: " + tutname2.getFullName());
        System.out.println("IC: " + nordin.getIc());
        System.out.println("Address: " + nordin.getAddress());
        System.out.println("Qualifications: " + nordin.getQual());
        System.out.println("Year of Experience: " + nordin.getYearsexp());
        System.out.println("Date Joined: " + nordin.getDatejoined());
        System.out.println("Years since enter: " + nordin.getYearssinceenter());
        System.out.println("");

    //TUITION CENTER
        TuitionCenter si = new TuitionCenter("Seri Iskandar");

        si.addtutors(ira);
        si.addtutors(nordin);
        si.addnumstud(anas);
        si.addnumstud(hanis);

        System.out.println("---Tuition Center Info---");
        System.out.println("Address: " + si.getAddress());
        System.out.println("Number of tutors: " + si.getnumtutors());
        System.out.println("Number of students: " + si.getnumstud());
        System.out.println("Average student marks: " + si.getAverageMarks());
        System.out.println("Minimum mark: " + si.getMinMarks());
        System.out.println("Maximum mark: " + si.getMaxMarks());
        System.out.println("Tutor's background: " + si.getTutorQuals());

    }

}