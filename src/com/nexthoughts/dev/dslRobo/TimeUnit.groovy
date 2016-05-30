package com.nexthoughts.dev.dslRobo

/**
 * Created by chetan on 29/5/16.
 */
enum TimeUnit {
hour  ('h',3600),
minute   ('min',60),
seconds  ('s',1)

String abbreviation
double multiplier

    TimeUnit(double multiplier, String abbreviation) {
        this.multiplier = multiplier
        this.abbreviation = abbreviation
    }

    String toString()
    {
        abbreviation
    }
}
