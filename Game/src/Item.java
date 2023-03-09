public class Item {
    int xCoordinaate;
    int yCoordinaate;
    int strenght;
    int durability;
    String name;

    // generate constructor ctrl ja valin kõik
    public Item(int strenght, int durability, String name, int worldWidth, int worldHeight) {
        this.xCoordinaate = getRandomCoordinaate(worldWidth);;
        this.yCoordinaate = getRandomCoordinaate(worldHeight);;
        this.strenght = strenght;
        this.durability = durability;
        this.name = name;
    }

    private static int getRandomCoordinaate(int worldDimension) {
        return (int) (Math.random() * (worldDimension - 2) + 1);
    }
}
