package ba.unsa.etf.rpr.tut4;

public class StudijStudenta  extends  Studij{
    private Predmet[] spisakIzbornihPredmeta;
    private int brojIzbornihPredmeta;
    private int ECTSBodoviIzborni;

    StudijStudenta(Predmet[] spisak, int brojPredmeta, int ECTSpredmeta, String ime){
        spisakIzbornihPredmeta = new Predmet[10];
        System.arraycopy(spisak,0,spisakIzbornihPredmeta,0,brojPredmeta);
        brojIzbornihPredmeta = brojPredmeta;
        ECTSBodoviIzborni = ECTSpredmeta;
    }

    public void dodajIzborni(Predmet p, Student s){
        spisakIzbornihPredmeta[brojIzbornihPredmeta++] = new Predmet(p.getImePredmeta(),p.getECTSBodoviPredmeta(),p.getBrojStudenataNaPredmetu(),p.getSpisakStudenata());
        ECTSBodoviIzborni+=p.getECTSBodoviPredmeta();
        p.dodajStudenta(s);
    }

    public int getECTSBodoviIzborni() {
        return ECTSBodoviIzborni;
    }

    public int getBrojIzbornihPredmeta() {
        return brojIzbornihPredmeta;
    }
}
