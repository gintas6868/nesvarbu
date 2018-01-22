package pamoka04;

public class TobuliejiSkaiciai {
    public static void main(String[] args) {
        System.out.println("Tobulieji skaiciai intervale nuo 1 iki 1000 yra:");
        int i;
        int n;
        for (i = 1000; i > 0; i--) {
            int z = 0;
            for (n = 1; n <= 500; n++) {
                if (i % n == 0) {
                    z = z + n;
                }
            }
            if (z / 2 == i) {
                System.out.println(i);
            }
        }
    }
}


