val checking = Account("checking", "Checking")
val savings = Account("savings", "Savings")
val accounts = listOf(checking, savings)

val snapshotJanuary = Snapshot(
  LocalDate.parse("2022-01-01"), mapOf(
    checking to 1000.0,
    savings to 2000.0
  )
)
val snapshotFebruary = Snapshot(
  LocalDate.parse("2022-02-01"), mapOf(
    checking to 1200.0,
    savings to 2500.0
  )
)
val snapshots = listOf(snapshotJanuary, snapshotFebruary)

val report = Report(accounts, snapshots)
report.displayAccountList()
report.displaySnapshots()
