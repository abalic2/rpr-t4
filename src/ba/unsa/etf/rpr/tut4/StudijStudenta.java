package ba.unsa.etf.rpr.tut4;

public class StudijStudenta  extends  Studij{
    private Predmet[] spisakIzbornihPredmeta;
    private int brojIzbornihPredmeta;
    private int ECTSBodoviIzborni;

    Studij(Predmet[] spisak, int brojPredmeta, int ECTSpredmeta, String ime){
        spisakIzbornihPredmeta = new Predmet[10];
        for(int i = 0 ; i < brojPredmeta ; i++ ){
            spisakIzbornihPredmeta[i] = spisak[i];
        }
        brojIzbornihPredmeta = brojPredmeta;
        ECTSBodoviIzborni = ECTSpredmeta;
    }

        public int getECTSBodoviIzborni() {
        return ECTSBodoviIzborni;
    }

    public int getBrojIzbornihPredmeta() {
        return brojIzbornihPredmeta;
    }
}
