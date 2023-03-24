public class Character implements WorldObject {
    int xCoordinaate;
    int yCoordinaate;
    char symbol;

    public Character(int worldWidth, int worldHeight, char symbol) {
        this.xCoordinaate = getRandomCoordinaate(worldWidth);
        this.yCoordinaate = getRandomCoordinaate(worldHeight);
        this.symbol = symbol;
    }

    public int getRandomCoordinaate(int worldDimension) {
        return (int) (Math.random() * (worldDimension - 2) + 1);
    }
}
