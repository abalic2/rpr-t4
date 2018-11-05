package ba.unsa.etf.rpr.tut4;

import javax.naming.ldap.PagedResultsControl;

public class Predmet {
    private int ECTSBodoviPredmeta;
    private String imePredmeta;
    private int brojStudenataNaPredmetu;
    private Student[] spisakStudenata;
    public Predmet(){}
    public Predmet(String ime, int bodovi){
        imePredmeta = ime;
        ECTSBodoviPredmeta = bodovi;
        brojStudenataNaPredmetu = 0;
        spisakStudenata = new Student[100];
    }
    public void ispisiPredmet(){

    }

    public String getImePredmeta() {
        return imePredmeta;
    }

    public String ispisiStudenteNaPredmetu(){
        return "";
    }

    public void upisiStudenta(Student s){

    }
}
