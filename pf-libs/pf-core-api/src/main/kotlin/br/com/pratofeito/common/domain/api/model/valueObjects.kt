package br.com.pratofeito.common.domain.api.model

import java.math.BigDecimal
import java.util.Date

data class AuditEntry(val who: String, val `when`: Date)

data class PersonName(val firstName: String, val lastName: String)

data class Money(val amout: BigDecimal) {
    fun add(delta: Money): Money = Money(amout.add(delta.amout))
    fun multiply(multiplier: Int): Money = Money(amout.multiply(BigDecimal(multiplier)))
    fun isGreatherThanOrEqual(moneyCompare: Money): Boolean = amout >= moneyCompare.amout
}
