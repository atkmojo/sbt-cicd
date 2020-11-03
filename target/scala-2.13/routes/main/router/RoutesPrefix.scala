// @GENERATOR:play-routes-compiler
// @SOURCE:/home/faris/IdeaProjects/play-samples-play-scala-starter-example/conf/routes
// @DATE:Tue Nov 03 21:12:57 CET 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
