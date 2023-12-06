package Ex_03;

import java.time.LocalDateTime;
import java.util.Random;

public class UserSessionManager {

    private String lastAccess;
    private int sessionToken;
    private static UserSessionManager instance;

    private UserSessionManager() {

        Random random = new Random();

        this.lastAccess = String.valueOf(LocalDateTime.now());
        this.sessionToken = random.nextInt(100);;
    }

    public static UserSessionManager getInstance() {

        if (instance == null) {
            instance = new UserSessionManager();
        }

        return instance;
    }

    public String getLastAccess() {
        return lastAccess;
    }

    public int getSessionToken() {
        return sessionToken;
    }

    public void setLastAccess(String lastAccess) {
        this.lastAccess = String.valueOf(LocalDateTime.now());
    }
}
