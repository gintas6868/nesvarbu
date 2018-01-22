package pamoka05;

public class Main {
    public static void main(String[] args) {

        Mokinys mokinys1 = new Mokinys();
        mokinys1.vardas = "Jonas";
        mokinys1.pavarde = "Jonaitis";
        mokinys1.klase = 11;
        Mokinys mokinys2 = new Mokinys();
        mokinys2.vardas = "Jonas";
        mokinys2.pavarde = "Petraitis";
        mokinys2.klase = 1;
        Mokinys mokinys3 = new Mokinys();
        mokinys3.vardas = "Petras";
        mokinys3.pavarde = "Petraitis";
        mokinys3.klase = 2;
        Mokinys mokinys4 = new Mokinys();
        mokinys4.vardas = "Antanas";
        mokinys4.pavarde = "Antanaitis";
        mokinys4.klase = 3;
        Mokinys mokinys5 = new Mokinys();
        mokinys5.vardas = "Maryte";
        mokinys5.pavarde = "Jonaite";
        mokinys5.klase = 3;
        Mokinys mokinys6 = new Mokinys();
        mokinys6.vardas = "Zigmas";
        mokinys6.pavarde = " ";
        mokinys6.klase = 6;
        Mokinys mokinys7 = new Mokinys();
        mokinys7.vardas = "Robertas";
        mokinys7.pavarde = "Repeza";
        mokinys7.klase = 7;
        Mokinys mokinys8 = new Mokinys();
        mokinys8.vardas = "Gediminas";
        mokinys8.pavarde = "Repeza";
        mokinys8.klase = 3;
        Mokinys mokinys9 = new Mokinys();
        mokinys9.vardas = "Ieva";
        mokinys9.pavarde = "Petrauskaite";
        mokinys9.klase = 3;
        Mokinys mokinys10 = new Mokinys();
        mokinys10.vardas = "Algirdas";
        mokinys10.pavarde = "Baranauskas";
        mokinys10.klase = 3;
        Mokinys mokinys11 = new Mokinys();
        mokinys11.vardas = "Mantas";
        mokinys11.pavarde = "Kulva";
        mokinys11.klase = 6;
        Mokinys mokinys12 = new Mokinys();
        mokinys12.vardas = "Linas";
        mokinys12.pavarde = "Kulva";
        mokinys12.klase = 6;
        Mokinys[] mokiniai = new Mokinys[12];
        mokiniai[0] = mokinys1;
        mokiniai[1] = mokinys2;
        mokiniai[2] = mokinys3;
        mokiniai[3] = mokinys4;
        mokiniai[4] = mokinys5;
        mokiniai[5] = mokinys6;
        mokiniai[6] = mokinys7;
        mokiniai[7] = mokinys8;
        mokiniai[8] = mokinys9;
        mokiniai[9] = mokinys10;
        mokiniai[10] = mokinys11;
        mokiniai[11] = mokinys12;
        int i;
        int n;
        Mokinys temp;
        int result1;
        int result2;
        for (i = 0; i < mokiniai.length; i++) {
            for (n = 0; n < mokiniai.length; n++) {
                if (mokiniai[i].klase < mokiniai[n].klase) {
                    temp = mokiniai[i];
                    mokiniai[i] = mokiniai[n];
                    mokiniai[n] = temp;
                }
                if (mokiniai[i].klase == mokiniai[n].klase) {
                    result1 = mokiniai[i].pavarde.compareTo(mokiniai[n].pavarde);
                    if (result1 < 0) {
                        temp = mokiniai[i];
                        mokiniai[i] = mokiniai[n];
                        mokiniai[n] = temp;
                    }
                }
                if (mokiniai[i].klase == mokiniai[n].klase && mokiniai[i].pavarde.compareTo(mokiniai[n].pavarde) == 0) {
                    result2 = mokiniai[i].vardas.compareTo(mokiniai[n].vardas);
                    if (result2 < 0) {
                        temp = mokiniai[i];
                        mokiniai[i] = mokiniai[n];
                        mokiniai[n] = temp;
                    }
                }
            }
        }
        for (Mokinys z : mokiniai) {
            System.out.println(z.vardas + " " + z.pavarde + " " + "mokosi" + " " + z.klase + " " + "klaseje;");
        }
    }
}



