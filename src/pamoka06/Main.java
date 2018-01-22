package pamoka06;

public class Main {
    public static void main (String[] args){
        Mokinys mokinys1 = new Mokinys("Jonas","Jonaitis",10,new int[]{7,7,8});
        Mokinys mokinys2 = new Mokinys("Petras","Petraitis",9, new int[]{8,9,8});
        Mokinys mokinys3 = new Mokinys("Antanas","Antanaitis",7,new int[]{9,9,7});
        Mokinys mokinys4 = new Mokinys("Juozas","Juozaitis",7,new int[]{9,9,10});
        Mokinys mokinys5 = new Mokinys("Onute","Onaite",10,new int[]{10,9,10});
        Mokinys mokinys6 = new Mokinys("Aukse","Auksaite",9,new int[]{8,9,10});
        Mokinys[]mokiniai = new Mokinys[6];
        mokiniai[0] = mokinys1;
        mokiniai[1] = mokinys2;
        mokiniai[2] = mokinys3;
        mokiniai[3] = mokinys4;
        mokiniai[4] = mokinys5;
        mokiniai[5] = mokinys6;
        Mokinys temp;
        for(int i = 0;i<mokiniai.length;i++){
        for(int n=0;n<mokiniai.length;n++){
            if (mokiniai[i].klase < mokiniai[n].klase) {
                temp = mokiniai[i];
                mokiniai[i] = mokiniai[n];
                mokiniai[n] = temp;
            }
            if(mokiniai[i].klase == mokiniai[n].klase&&mokiniai[i].vidurkis()>mokiniai[n].vidurkis()){
                temp = mokiniai[i];
                mokiniai[i] = mokiniai[n];
                mokiniai[n] = temp;
            }
        }
        }
        for (Mokinys z : mokiniai) {
            System.out.println(z.vardas + " " + z.pavarde + " " + "mokosi" + " " + z.klase + " " + "klaseje." +
                    " Jo(s) vidurkis yra "+" "+z.vidurkis()+".");
              }
    }
}
