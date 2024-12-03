

public class App {
    public static void main(String[] args) {
        // Retrieve environment variables from .env file
        String myVariable = EnvConfig.get("MY_VARIABLE");
        String mySecretKey = EnvConfig.get("MY_SECRET_KEY");

        // Print out the values to confirm they're being loaded
        System.out.println("MY_VARIABLE: " + myVariable);
        System.out.println("MY_SECRET_KEY: " + mySecretKey);
        System.out.println("Hello,World!");
    }
}
