package org.example

/**
 * Hello world!
 *
 */
object Main extends App {
  val SLEEP_TIME=1000
  while (true) {
    print( " Ahhh..." )
    Thread.sleep(SLEEP_TIME/2)
    print( " Ahhh..." )
    Thread.sleep(SLEEP_TIME/2)
    print( " Ahhh..." )
    Thread.sleep(SLEEP_TIME/2)
    print( " Ahhh..." )
    Thread.sleep(SLEEP_TIME/2)
    print( " Staying alive!" )
    Thread.sleep(SLEEP_TIME)
    println( " Staying alive!" )
    Thread.sleep(SLEEP_TIME)
  }
}
