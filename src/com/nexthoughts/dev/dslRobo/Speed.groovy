package com.nexthoughts.dev.dslRobo

import groovy.transform.TupleConstructor

/**
 * Created by chetan on 29/5/16.
 */
//@TupleConstructor
class Speed {
    Distance distance
    Duration duration

    String toString()
    {
        return "$distance/$duration"
    }
}
