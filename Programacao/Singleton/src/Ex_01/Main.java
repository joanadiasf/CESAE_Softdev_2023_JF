package Ex_01;

public class Main {
    public static void main(String[] args) {


        DatabaseConnection databaseConnection3306 = DatabaseConnection.getInstance("localhost:3306/database");

        DatabaseConnection databaseConnection8000 = DatabaseConnection.getInstance("localhost:8000/database");

        databaseConnection3306.connect();
        databaseConnection8000.connect();


        databaseConnection3306.disconnect();
        databaseConnection8000.disconnect();

        //só deixa "um utilizador" aceder

    }
}
