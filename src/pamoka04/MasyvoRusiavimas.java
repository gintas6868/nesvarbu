package pamoka04;

public class MasyvoRusiavimas {

    public static void main(String[] args) {
        int[] mas = {5, 6, 12, -1, 15};
        for (int i = 0; i < mas.length; i++) {
            for (int n = 0; n < mas.length; n++) {
                if (mas[i] > mas[n]) {
                    int tarp = mas[i];
                    mas[i] = mas[n];
                    mas[n] = tarp;
                }
            }
        }
        for(int element:mas) {
            System.out.println(element);
        }
    }
}

