import nwt.script.NwtScriptHost

fun main(vararg args: String) {
  if (args.size != 1) {
    println("usage: <app> <script file>")
  } else {
    NwtScriptHost().execFile(args[0])
  }
}
