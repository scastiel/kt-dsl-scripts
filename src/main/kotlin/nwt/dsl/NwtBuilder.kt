package nwt.dsl

import nwt.domain.Account
import nwt.domain.Snapshot

class NwtBuilder {
  private val accounts: MutableMap<String, Account> = mutableMapOf()
  private val snapshots: MutableList<Snapshot> = mutableListOf()

  fun account(id: String, name: String) {
    accounts[id] = Account(id, name)
  }

  fun snapshots(initialize: SnapshotsBuilder.() -> Unit) {
    snapshots.addAll(SnapshotsBuilder(accounts).apply(initialize).build())
  }

  fun report(initialize: ReportBuilder.() -> Unit) {
    ReportBuilder(accounts.values.toList(), snapshots).apply(initialize)
  }
}