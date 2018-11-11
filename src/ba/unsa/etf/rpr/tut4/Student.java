package ba.unsa.etf.rpr.tut4;

public class Student {
    private String imeStudenta;
    private String prezimeStudenta;
    private int brojIndeksa;
    private StudijStudenta semestar;
    public Student(String ime, String prezime, int brojIndeksa, StudijStudenta s){
        imeStudenta = ime;
        prezimeStudenta = prezime;
        this.brojIndeksa = brojIndeksa;
        semestar = s;
    }

    public void ispisiStudenta(){
        System.out.println(getImeStudenta()+" "+getPrezimeStudenta()+" "+getBrojIndeksa());
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

    public StudijStudenta getSemestar() {
        return semestar;
    }
}
