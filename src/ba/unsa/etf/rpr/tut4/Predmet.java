package ba.unsa.etf.rpr.tut4;


public class Predmet {
    private int ECTSBodoviPredmeta;
    private String imePredmeta;
    protected int brojStudenataNaPredmetu;
    protected Student[] spisakStudenata;
    public Predmet(){}
    public Predmet(String ime, int bodovi, int brojStudenata, Student[] spisak){
        imePredmeta = ime;
        ECTSBodoviPredmeta = bodovi;
        brojStudenataNaPredmetu = brojStudenata;
        spisakStudenata = new Student[100];
        System.arraycopy(spisak,0,spisakStudenata,0,brojStudenata);
    }
    public void ispisiPredmet(){
        System.out.println(getImePredmeta());
    }

    public String getImePredmeta() {
        return imePredmeta;
    }

    public int getECTSBodoviPredmeta() {
        return ECTSBodoviPredmeta;
    }

    public int getBrojStudenataNaPredmetu() {
        return brojStudenataNaPredmetu;
    }

    public Student[] getSpisakStudenata() {
        return spisakStudenata;
    }

    public void dodajStudenta(Student s){
        spisakStudenata[brojStudenataNaPredmetu++]=new Student(s.getImeStudenta(),s.getPrezimeStudenta(),s.getBrojIndeksa(),s.getSemestar());
    }

    public void ispisiStudenteNaPredmetu(){
        for(int i=0;i<brojStudenataNaPredmetu;i++){
            spisakStudenata[i].ispisiStudenta();
        }
    }
}
