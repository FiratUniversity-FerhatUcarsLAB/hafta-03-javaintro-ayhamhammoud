
public class UcgenHesap {
    public static void main(String[] args) {
        // Kenarlar
        double a = 3;
        double b = 4;
        double c = 5;

        // Yarı çevre s = (a + b + c) / 2
        double s = (a + b + c) / 2;

        // Heron formülü: Alan = √[ s (s - a) (s - b) (s - c) ]
        double alan = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        // Çevre = a + b + c
        double cevre = a + b + c;

        // Sonuçları yazdır
        System.out.println("a kenari : " + a);
        System.out.println("b kenari : " + b);
        System.out.println("c kenari : " + c);
        System.out.println("Alan     : " + alan);
        System.out.println("Cevre    : " + cevre);
    }
}
