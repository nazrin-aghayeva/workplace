package stepProject3.migrations;

import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.configuration.FluentConfiguration;

public class DbSetup {

  static void migrate(String path, String user, String password) {
    migrate(path, user, password, false);
  }

  static void migrate(String path, String user, String password, boolean clean) {
    FluentConfiguration config = new FluentConfiguration()
        .dataSource(path, user, password);
    Flyway flyway = new Flyway(config);
    if (clean) flyway.clean();
    flyway.migrate();
  }

}
