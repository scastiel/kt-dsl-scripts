package nwt.script

import java.io.File
import kotlin.script.experimental.api.*
import kotlin.script.experimental.host.toScriptSource
import kotlin.script.experimental.jvm.dependenciesFromCurrentContext
import kotlin.script.experimental.jvm.jvm
import kotlin.script.experimental.jvmhost.BasicJvmScriptingHost
import kotlin.script.experimental.jvmhost.createJvmCompilationConfigurationFromTemplate

class NwtScriptHost {
  private fun evalFile(scriptFile: File): ResultWithDiagnostics<EvaluationResult> {
    val compilationConfiguration = createJvmCompilationConfigurationFromTemplate<NwtScript> {
      jvm {
        dependenciesFromCurrentContext(wholeClasspath = true)
      }
    }
    return BasicJvmScriptingHost().eval(scriptFile.toScriptSource(), compilationConfiguration, null)
  }

  fun execFile(path: String) {
    val scriptFile = File(path)
    val res = evalFile(scriptFile)

    res.reports.forEach {
      if (it.severity > ScriptDiagnostic.Severity.DEBUG) {
        println(" : ${it.message}" + if (it.exception == null) "" else ": ${it.exception}")
      }
    }
  }
}
