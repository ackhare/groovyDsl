package com.nexthoughts.dev.dslRobo

import com.nexthoughts.dev.dslFanMovesdemo.FanMoves

class Robot {
    def move(Direction dir) {
        [by: { Distance dist ->
            [at: { Speed s ->
                println "robot moved $dir by $dist at $s"
            }]
        }]
    }

    void move(Direction dir, Distance d) {
        println "robot moved $dir by $d"
    }

    void move(Map m, Direction dir) {
        println "robot moved $dir by $m.by at ${m.at ?: '1 km/h'}"
    }
}

