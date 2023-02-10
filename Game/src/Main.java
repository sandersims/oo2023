public class Main {

    //fori
    //sout
    public static void main(String[] args) {
        System.out.println("Hello world!");
         // String sonaline = "Sõnaline muutuja";
         // char taheline = 's';
         // double komakohaga = 5432.23435;
         // float komakohaga2 = 313.12341F;
         // boolean kahendv22rtus = true; 0 ja 1
         // byte pisikeNumber = 100;
         // short lyhikenumber = 312;
         // long pikkNUmber = 31231232131L;

        int playerXCoordinaate = 3;
        int playerYCoordinaate = 3;
        int dragonXCoordinaate = 6;
        int dragonYCoordinaate = 2;
        int orcXCoordinaate = 5;
        int orcYCoordinaate = 1;

        //algväärtus  kuni  iga tsükkel
        for (int y = 0; y < 5; y++) {
            System.out.println();
            for (int x = 0; x < 10; x++) {
                if (y == 0 || y == 4) {
                    System.out.print("-");
                } else if (x == 0 || x == 9) {
                        System.out.print("|");
                    } else {
                        if (playerXCoordinaate == x && playerYCoordinaate == y) {
                            System.out.print("X");
                        } else if (dragonXCoordinaate == x && dragonYCoordinaate == y)) {
                        System.out.print("D");
                        } else if (orcXCoordinaate == x && orcYCoordinaate == y)) {
                        System.out.print("O");
                        } else {
                        System.out.print(" ");
                    }
            }
        }
    }
}