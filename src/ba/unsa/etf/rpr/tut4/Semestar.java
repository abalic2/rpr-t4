package ba.unsa.etf.rpr.tut4;

public class Semestar {
    private Predmet[] spisakPredmeta;
    private int brojPredmeta;
    private int ECTSBodoviUkupno;
    Semestar(){
        spisakPredmeta = new Predmet[10];
        brojPredmeta = 0;
        ECTSBodoviUkupno = 0;
    }

    public int getBrojPredmeta() {
        return brojPredmeta;
    }

    public int getECTSBodoviUkupno() {
        return ECTSBodoviUkupno;
    }

    void UpisiUSemestar(){
        //upisi studenta na obavezne i nek bira izborne
    }
}
