import java.util.Arrays;
public class Main {
    public static void main(String [] args){
Gamer [] array = new Gamer[5];
        array[0] = new Gamer("Amiens", true);
        array[1] = new Gamer("Duke", false);
        array[2] = new Gamer("Zerg", true);
        array[3] = new Gamer("Nick777", false);
        array[4] = new Gamer("Melange", true);
        for(Gamer gamers: array){
            if(gamers.isActive) {
                System.out.println(gamers);
            }
        }
    }
}
