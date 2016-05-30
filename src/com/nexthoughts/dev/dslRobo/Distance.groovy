package com.nexthoughts.dev.dslRobo

/**
 * Created by chetan on 29/5/16.
 */
class Distance {

    int amount
    Unit unit

    Distance(double amount, Unit unit) {
        this.amount = amount
        this.unit = unit
    }

    Speed div(Duration t)
    {

        new Speed(this,t)
    }
    String toString()
    {
        return "$amount $unit"
    }
}
