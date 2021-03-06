package nwt.dsl

import nwt.domain.Account
import nwt.domain.Snapshot
import java.time.LocalDate

class SnapshotBuilder(val date: LocalDate, val accounts: Map<String, Account>) {
  private val balances: MutableMap<Account, Double> = mutableMapOf()

  fun balance(accountId: String, amount: Double) {
    val account = accounts[accountId] ?: throw Exception("Invalid account ID")
    balances[account] = amount
  }

  fun build(): Snapshot {
    return Snapshot(date, balances)
  }
}