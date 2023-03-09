import java.util.List;

public class World {
    int width;
    int height;

    public World(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void printMap(int worldWidth, int worldHeight,
                         int playerXCoordinaate, int playerYCoordinaate, char playerSymbol,
                         int dragonXCoordinaate, int dragonYCoordinaate, char dragonSymbol,
                         int orcXCoordinaate, int orcYCoordinaate, char orcSymbol, List<Item> items) {
        // algväärtus   kuni   iga tsükkel
        char symbol = ' '; // luuakse uus muutuja, esmakordne väärtuse andmine on initsialiseerimine
        for (int y = 0; y < worldHeight; y++) {
            System.out.println();
            for (int x = 0; x < worldWidth; x++) {
                if (y == 0 || y == worldHeight -1) {
                    //System.out.print("-");
                    symbol = '-';
                } else if (x == 0 || x == worldWidth -1) {
                   // System.out.print("|");
                    symbol = '|';
                } else {
//                    ctrl + alt + m
//                    parem klõps -> refactor -> extract method
                    for (Item i: items) {
                        if (i.yCoordinaate == y && i.xCoordinaate == x) {        // aktiveerin + parem klõps + refactor + rename
                           // System.out.print("I");
                            symbol = 'I';
                            break;
                        }
                    }
                    //ctrl+alt+n
                    if (playerXCoordinaate == x && playerYCoordinaate == y) {        // aktiveerin + parem klõps + refactor + rename
                        System.out.print(playerSymbol);
                        symbol = playerSymbol;
                    } else if (dragonXCoordinaate == x && dragonYCoordinaate == y) {
                        System.out.print(dragonSymbol);
                        symbol = dragonSymbol;
                    } else if (orcXCoordinaate == x && orcYCoordinaate == y) {
                        System.out.print(orcSymbol);
                        symbol = orcSymbol;
                    }
                }
                System.out.print(symbol);
                symbol = ' ';
            }
        }
    }

//    // int on tagastustüüp ehk mis järgneb return kirjele
//    private static int getRandomCoordinaate(int worldDimension) {
//        return (int) (Math.random() * (worldDimension - 2) + 1);
//                // returni järel tuleb täisarv
//    }

    // void on tagastustüüp ehk mis tüüp järgneb return kirjele
    // void tähendab, et ei tagastatagi midagi

}