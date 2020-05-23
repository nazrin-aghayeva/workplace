package stepProject5.logging;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class AmazingLoggableApplication2 {

  public static void main(String[] args) {
    log.error("this is a serious error");
    log.warn("this is a warning");
    log.info("just info message");
    log.debug("deeply detailed message");
    log.trace("extremely deep message");
  }
}
