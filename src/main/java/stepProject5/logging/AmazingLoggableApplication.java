package stepProject5.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AmazingLoggableApplication {

  private static final Logger log = LogManager.getLogger(AmazingLoggableApplication.class);

  public static void main(String[] args) {
    log.error("this is a serious error");
    log.warn("this is a warning");
    log.info("just info message");
    log.debug("deeply detailed message");
    log.trace("extremely deep message");
  }
}
