package one.digitalinnovation.collections

import java.math.BigDecimal

fun Array<BigDecimal>.decimal() =
    this.reduce{acc,valor -> acc + valor }

fun Array<BigDecimal>.media() =
    if(this.isEmpty()) BigDecimal.ZERO
    else (this.decimal() / this.size.toBigDecimal())


