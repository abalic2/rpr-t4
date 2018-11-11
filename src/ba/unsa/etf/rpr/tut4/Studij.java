package ba.unsa.etf.rpr.tut4;

public class Studij {
    private Predmet[] spisakObaveznihPredmeta;
    private int brojObaveznihPredmeta;
    private int ECTSBodoviObaveznih;
    private String imeStudija;
    Studij(){
        spisakObaveznihPredmeta = new Predmet[10];
        brojObaveznihPredmeta = 0;
        ECTSBodoviObaveznih = 0;
    }

    Studij(Predmet[] spisak, int brojPredmeta, int ECTSpredmeta, String ime){
        spisakObaveznihPredmeta = new Predmet[100];
        System.arraycopy(spisak,0,spisakObaveznihPredmeta,0,brojPredmeta);
        brojObaveznihPredmeta = brojPredmeta;
        ECTSBodoviObaveznih = ECTSpredmeta;
    }

    public int getBrojPredmeta() {
        return brojObaveznihPredmeta;
    }

    public int getECTSBodoviUkupno() {
        return ECTSBodoviObaveznih;
    }

    public String getImeStudija() {
        return imeStudija;
    }
}
