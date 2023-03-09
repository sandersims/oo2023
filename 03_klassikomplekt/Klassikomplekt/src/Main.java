public class Main {
    public static void main(String[] args) {
        Treener treener = new Treener("Rühmatreener", 4, "Tallinn");
        Gym gym = new Gym(treener, 20, 50);

        System.out.println(gym.vabadkohad());
        System.out.println(gym.treenerperkylastaja());
    }

}