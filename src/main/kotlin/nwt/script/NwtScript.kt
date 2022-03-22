package nwt.script

import kotlin.script.experimental.annotations.KotlinScript
import kotlin.script.experimental.api.ScriptCompilationConfiguration
import kotlin.script.experimental.api.defaultImports

@KotlinScript(fileExtension = "nwt.kts", compilationConfiguration = NwtScriptConfiguration::class)
abstract class NwtScript

object NwtScriptConfiguration: ScriptCompilationConfiguration({
  defaultImports("nwt.dsl.nwt")
})
