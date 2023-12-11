package Ex_01;

public class Main {

    public static void main(String[] args) {

        Player player1 = new Player("Godrick",new MagicAttack());

        player1.attack();
        player1.setAttackStrategy(new LongDistanceAttack());
        player1.attack();

    }
}
