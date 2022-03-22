import domain.Account
import domain.Snapshot
import report.Report
import java.time.LocalDate

fun main(args: Array<String>) {
  val checking = Account("checking", "Checking")
  val savings = Account("savings", "Savings")

  val snapshotJanuary = Snapshot(
    LocalDate.parse("2022-01-01"),
    mapOf(checking to 1000.0, savings to 2000.0)
  )
  val snapshotFebruary = Snapshot(
    LocalDate.parse("2022-02-01"),
    mapOf(checking to 1200.0, savings to 2500.0)
  )

  val report = Report(
    listOf(checking, savings),
    listOf(snapshotJanuary, snapshotFebruary)
  )
  report.displayAccountList()
  report.displaySnapshots()
}