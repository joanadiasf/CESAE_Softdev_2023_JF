package Ex_01;

public class Player {

    private String name;
    private AttackStrategy attackStrategy;

    public Player(String name, AttackStrategy attackStrategy) {
        this.name = name;
        this.attackStrategy = attackStrategy;
    }

    public void attack(){

        System.out.println("Attacking...");
    }

    public void setAttackStrategy(AttackStrategy attackStrategy){
        this.attackStrategy=attackStrategy;
    }
}
