public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto("Audi SQ7", 2200, 320, 69000);
        System.out.println(auto.getV6imsus());
        System.out.println(auto.getHind());
        Mootorrattas mootorrattas = new Mootorrattas("BMW M1000RR", 200, 150, 25000);
        System.out.println(mootorrattas.getV6imsus());
        System.out.println(mootorrattas.getHind());
        Lennuk lennuk = new Lennuk("Cessna 172", 750, 134, 120000);
        System.out.println(lennuk.getV6imsus());
        System.out.println(lennuk.getHind());
    }
}