package com.nexthoughts.dev.dslRobo

import groovy.transform.TupleConstructor

/**
 * Created by chetan on 29/5/16.
 */
//@TupleConstructor
class Speed {
    Speed(Distance distance, Duration duration) {
        this.distance = distance
        this.duration = duration
    }
    Distance distance
    Duration duration

    String toString()
    {
        return "$distance/$duration"
    }
}
