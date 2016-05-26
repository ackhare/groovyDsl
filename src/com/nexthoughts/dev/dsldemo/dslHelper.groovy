package com.nexthoughts.dev.dsldemo


def binding = new Binding([
        fan: new Fan(),
        one: FanMoves.one,
        two: FanMoves.two,
        three: FanMoves.three,
        four: FanMoves.four
])
def shell = new GroovyShell(this.class.classLoader, binding)
shell.evaluate(new File("/home/chetan/Downloads/jonathon/groovyDSL/src/command.groovy"))