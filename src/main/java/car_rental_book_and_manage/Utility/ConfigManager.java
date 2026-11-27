package car_rental_book_and_manage.Utility;

/** Reads database settings from environment variables. */
public final class ConfigManager {

    private ConfigManager() {}

    public static String getRequiredEnv(String name) {
        String value = System.getenv(name);
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalStateException(
                    "Missing required environment variable: " + name);
        }
        return value;
    }
}
