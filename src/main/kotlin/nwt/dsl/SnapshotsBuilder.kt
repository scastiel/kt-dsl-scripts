package nwt.dsl

import nwt.domain.Account
import nwt.domain.Snapshot
import java.time.LocalDate

class SnapshotsBuilder(val accounts: Map<String, Account>) {
  private val snapshots: MutableList<Snapshot> = mutableListOf()

  fun on(date: String, initialize: SnapshotBuilder.() -> Unit) {
    val snapshotBuilder = SnapshotBuilder(LocalDate.parse(date), accounts).apply(initialize)
    snapshots.add(snapshotBuilder.build())
  }

  fun build(): List<Snapshot> {
    return snapshots
  }
}