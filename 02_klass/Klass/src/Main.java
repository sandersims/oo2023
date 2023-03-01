public class Main {
    public static void main(String[] args) {
        GymTime sander = new GymTime("sander", "sims", "sandersims");

        GymTime illar = new GymTime("illar", "kukeke", "illarkukeke");

        String sonum = sander.treeninguAlgus();
        System.out.println(sonum);

        String sonum2 = illar.treeningulõpp();
        System.out.println(sonum2);

    }
}