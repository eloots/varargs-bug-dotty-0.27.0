package org.cmt

import org.apache.logging.log4j.{LogManager, Logger}

@main def main(): Unit = {
  
  val log = LogManager.getLogger("test")

  log.error("Just logging a message {}", 5)
}
