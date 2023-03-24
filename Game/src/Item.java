public class Item implements WorldObject  {
    int xCoordinaate;
    int yCoordinaate;
    int strenght;
    int durability;
    String name;

    public Item(int strenght, int durability, String name, int worldWidth, int worldHeight) {}

    public int getRandomCoordinaate(int worldDimension) {
        return (int) (Math.random() * (worldDimension - 2) + 1);
    }
}
