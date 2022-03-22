package nwt.script

import nwt.domain.Account
import nwt.domain.Snapshot
import nwt.report.Report
import java.time.LocalDate
import kotlin.script.experimental.annotations.KotlinScript
import kotlin.script.experimental.api.ScriptCompilationConfiguration
import kotlin.script.experimental.api.defaultImports

@KotlinScript(fileExtension = "nwt.kts", compilationConfiguration = NwtScriptConfiguration::class)
abstract class NwtScript

object NwtScriptConfiguration: ScriptCompilationConfiguration({
  defaultImports(Account::class, Snapshot::class, Report::class, LocalDate::class)
})
