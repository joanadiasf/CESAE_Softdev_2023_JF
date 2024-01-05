package Ex_03;

public class Main {

    public static void main(String[] args) {

        Animal tobias = new Animal("TObias","Gorila","Congo",40,new String[]{"macacos","banana","pessoas"});


        tobias.comer(10,"banana");

        System.out.println(tobias.getPeso());


        tobias.comer(20,"peixe");

        System.out.println(tobias.getPeso());

    }
}
