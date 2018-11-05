package ba.unsa.etf.rpr.tut4;

public class Student {
    private String imeStudenta;
    private String prezimeStudenta;
    private int brojIndeksa;
    private Semestar semestar;
    public Student(String ime, String prezime, int brojIndeksa, Semestar s){
        imeStudenta = ime;
        prezimeStudenta = prezime;
        this.brojIndeksa = brojIndeksa;
        semestar = s;
    }
    public Student(Student s){

    }

    public String ispisiStudenta(){
        return "";
    }

    public String getImeStudenta() {
        return imeStudenta;
    }

    public String getPrezimeStudenta() {
        return prezimeStudenta;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }
}
