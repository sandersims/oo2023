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

        int worldWidth = 10;
        int worldHeight = 5;

        int playerXCoordinaate = getRandomCoordinaate(worldWidth);
        int playerYCoordinaate = getRandomCoordinaate(worldHeight);// castimine ehk teisendamine ühest tüübist teise
        char playerSymbol = 'X';
        int dragonXCoordinaate = getRandomCoordinaate(worldWidth);
        int dragonYCoordinaate = getRandomCoordinaate(worldHeight);
        char dragonSymbol = 'D';
        int orcXCoordinaate = getRandomCoordinaate(worldWidth);
        int orcYCoordinaate = getRandomCoordinaate(worldHeight);
        char orcSymbol = 'O';


        //algväärtus  kuni  iga tsükkel
        for (int y = 0; y < worldHeight; y++) {
            System.out.println();
            for (int x = 0; x < worldWidth; x++) {
                if (y == 0 || y == worldHeight-1) {
                    System.out.print("-");
                } else if (x == 0 || x == worldWidth-1) {
                        System.out.print("|");
                } else {
                    // parem klõps refactor ja veel midagi
                    printCharacters(playerXCoordinaate, playerYCoordinaate, playerSymbol,
                            dragonXCoordinaate, dragonYCoordinaate, dragonSymbol,
                            orcXCoordinaate, orcYCoordinaate, orcSymbol, y, x);
                }
            }
        }
    }

    private static int getRandomCoordinaate(int worldDimension) {
        return (int) (Math.random() * (worldDimension - 2) + 1);
    }

    // void on tagastustüüp ehk mis tüüp järgneb return kirjele
    // void tähendab, et ei tagastagi midagi
    private static void printCharacters(int playerXCoordinaate, int playerYCoordinaate, char playerSymbol,
                                        int dragonXCoordinaate, int dragonYCoordinaate, char dragonSymbol,
                                        int orcXCoordinaate, int orcYCoordinaate, char orcSymbol, int mapY, int mapX) {
        if (playerXCoordinaate == mapX && playerYCoordinaate == mapY) {
            System.out.print(playerSymbol);
        } else if (dragonXCoordinaate == mapX && dragonYCoordinaate == mapY) {
            System.out.print(dragonSymbol);
        } else if (orcXCoordinaate == mapX && orcYCoordinaate == mapY) {
            System.out.print(orcSymbol);
        } else {
            System.out.print(" ");
        }
    }
}
