
public class HesapOzeti {
    public static void main(String[] args) {
        String urun1 = "Ekmek";
        String urun2 = "Süt";
        String urun3 = "Yumurta";

        int miktar1 = 2;
        int miktar2 = 1;
        int miktar3 = 10;

        double fiyat1 = 5.0;
        double fiyat2 = 15.5;
        double fiyat3 = 1.25;

        System.out.println("ÜRÜN\tMİKTAR\tFİYAT");
        System.out.println("---------------------------");
        System.out.println(urun1 + "\t" + miktar1 + "\t" + fiyat1 + " TL");
        System.out.println(urun2 + "\t" + miktar2 + "\t" + fiyat2 + " TL");
        System.out.println(urun3 + "\t" + miktar3 + "\t" + fiyat3 + " TL");
    }
}
