package stepProject3.migrations;

public class SuperMagicApp {
  public static void main(String[] args) {
    DbSetup.migrate(
        "jdbc:postgresql://localhost:5432/ibatech",
        "postgres",
        "secret");
    /**
     * if table exists then do nothing
     * if something went wrong - exec: flyway.clean and flyway.migrate
     */
  }
}
