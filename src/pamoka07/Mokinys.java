package pamoka07;

public class Mokinys {

        String vardas;
        String pavarde;
        int klase;
        int[] pazymiai;
        int[]mok_sk_klaseje;


        public Mokinys(String vardas, String pavarde, int klase, int[] pazymiai) {
            this.vardas = vardas;
            this.pavarde = pavarde;
            this.klase = klase;
            this.pazymiai = pazymiai;
        }

        double vidurkis() {
            double suma = 0;
            for (int i = 0; i < pazymiai.length; i++) {
                suma += pazymiai[i];
            }
            return suma / this.pazymiai.length;
        }

        int getMok_sk_klaseje() {
            int sum = 0;
            for (int i = 1; i<=12; i++) {
                if (i == klase) {
                    sum = sum + 1;
                }
            }
                return sum;
        }
    }


