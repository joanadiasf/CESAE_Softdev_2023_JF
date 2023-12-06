package Ex_03;

import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        UserSessionManager sessionManager = UserSessionManager.getInstance();


        System.out.println("Token Acesso: " + sessionManager.getSessionToken());

        System.out.println("Último Acesso: " + sessionManager.getLastAccess());


        //Utilizador usa o programa por uns segundos
        sleep(5800);

        //atualizar o ultimo acesso
        sessionManager.setLastAccess();


        System.out.println("Token Acesso: " + sessionManager.getSessionToken());

        System.out.println("Último Acesso: " + sessionManager.getLastAccess());


    }
}
