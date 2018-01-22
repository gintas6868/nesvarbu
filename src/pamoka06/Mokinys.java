package pamoka06;

public class Mokinys {

    String vardas;
    String pavarde;
    int klase;
    int[] pazymiai;

    public Mokinys(String vardas, String pavarde, int klase, int[] pazymiai) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.klase = klase;
        this.pazymiai = pazymiai;
    }

    double vidurkis() {
        double suma = 0;
        for (int i = 0; i < pazymiai.length; i++) {
            suma = suma + pazymiai[i];
        }
        return suma / this.pazymiai.length;
    }
}

