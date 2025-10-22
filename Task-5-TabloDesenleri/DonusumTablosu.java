
public class DonusumTablosu {
    public static void main(String[] args) {
        double katsayi = 1.609;

        System.out.println("Mil\t Kilometre");
        System.out.println("-------------------");

        int[] milDegerleri = {1, 5, 10, 20, 50};

        for (int i = 0; i < milDegerleri.length; i++) {
            int mil = milDegerleri[i];
            double km = mil * katsayi;
            System.out.println(mil + "\t " + km);
        }
    }
}
