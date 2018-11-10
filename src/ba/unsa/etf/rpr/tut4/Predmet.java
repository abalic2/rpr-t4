package ba.unsa.etf.rpr.tut4;


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
        System.out.println(getImePredmeta());
    }

    public String getImePredmeta() {
        return imePredmeta;
    }

    public void ispisiStudenteNaPredmetu(){
        for(int i=0;i<brojStudenataNaPredmetu;i++){
            spisakStudenata[i].ispisiStudenta();
        }
    }

    public void upisiStudenta(Student s){
        spisakStudenata[brojStudenataNaPredmetu++]=new Student(s.getImeStudenta(),s.getPrezimeStudenta(),s.getBrojIndeksa());
    }
}
