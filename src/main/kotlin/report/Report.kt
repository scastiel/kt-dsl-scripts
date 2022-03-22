package report

import domain.Account
import domain.Snapshot

class Report(val accounts: List<Account>, val snapshots: List<Snapshot>) {
  fun displayAccountList() {
    println("ACCOUNTS:")
    accounts.forEach { println("- ${it.name}") }
  }

  fun displaySnapshots() {
    println("SNAPSHOTS:")
    snapshots.forEach { snapshot ->
      println("* ${snapshot.date}:")
      accounts.forEach { account ->
        println("  - ${account.name}: ${snapshot.balances[account]?.toString() ?: "-"}")
      }
    }
  }
}
