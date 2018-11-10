package ba.unsa.etf.rpr.tut4;

public class Student {
    private String imeStudenta;
    private String prezimeStudenta;
    private int brojIndeksa;
    private StudijStudenta semestar;
    public Student(String ime, String prezime, int brojIndeksa, Studij s){
        imeStudenta = ime;
        prezimeStudenta = prezime;
        this.brojIndeksa = brojIndeksa;
        semestar = s;
    }

    public void ispisiStudenta(){
        System.out.println(getImeStudenta()+" "+getPrezimeStudenta()+" "+getBrojIndeksa());
    }

    public void getImeStudenta() {
        return imeStudenta;
    }

    public void getPrezimeStudenta() {
        return prezimeStudenta;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public StudijStudenta getSemestar() {
        return semestar;
    }
}
