import java.util.Scanner;

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

        Scanner scanner = new Scanner(System.in);


       World world = new World(10, 5 );

        Player player = new Player(world.width, world.height);
        Dragon dragon = new Dragon(world.width, world.height);
        Orc orc = new Orc(world.width, world.height);

        world.printMap(world.width, world.height,
                player.xCoordinaate, player.yCoordinaate, player.symbol,
                dragon.xCoordinaate, dragon.yCoordinaate, dragon.symbol,
                orc.xCoordinaate, orc.yCoordinaate, orc.symbol);
        String input = scanner.nextLine();
 //       for (; !input.equals("end"); )
        while (!input.equals("end")) {
            player.move(input, world);
            world.printMap(world.width, world.height,
                    player.xCoordinaate, player.yCoordinaate, player.symbol,
                    dragon.xCoordinaate, dragon.yCoordinaate, dragon.symbol,
                    orc.xCoordinaate, orc.yCoordinaate, orc.symbol);
            System.out.println();
            input = scanner.nextLine();
        }
    }


}
