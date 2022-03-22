package nwt.dsl

import nwt.domain.Account
import nwt.domain.Snapshot
import nwt.report.Report

class ReportBuilder(val accounts: List<Account>, val snapshots: List<Snapshot>) {
  private val report = Report(accounts, snapshots)

  fun accounts() {
    report.displayAccountList()
  }

  fun snapshots() {
    report.displaySnapshots()
  }
}