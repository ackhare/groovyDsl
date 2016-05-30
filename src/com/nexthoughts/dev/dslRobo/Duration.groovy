package com.nexthoughts.dev.dslRobo

/**
 * Created by chetan on 29/5/16.
 */
class  Duration {
    int amount
    TimeUnit unit
    String toString()
    {
        "$amount $unit"
    }
}