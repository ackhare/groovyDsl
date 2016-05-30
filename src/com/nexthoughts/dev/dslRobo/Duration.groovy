package com.nexthoughts.dev.dslRobo

/**
 * Created by chetan on 29/5/16.
 */
class  Duration {
    int amount
    TimeUnit unit
    Duration(int amount, TimeUnit unit) {

        this.amount = amount
        this.unit = unit
    }
    Duration(TimeUnit unit) {

//        this.amount = amount
        this.unit = unit
    }
    String toString()
    {
     amount?"$amount $unit":"$unit"
    }
}