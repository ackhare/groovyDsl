package com.nexthoughts.dev.dsldemo

import org.codehaus.groovy.control.CompilerConfiguration
import org.codehaus.groovy.control.customizers.SecureASTCustomizer


def binding = new Binding([
        fan: new Fan(),
         * : FanMoves.values().collectEntries { [(it.name()): it] }
//        one: FanMoves.one,
//        two: FanMoves.two,
//        three: FanMoves.three,
//        four: FanMoves.four
])
CompilerConfiguration conf = new CompilerConfiguration();

SecureASTCustomizer customizer = new SecureASTCustomizer();

conf.addCompilationCustomizers(customizer);
customizer.closuresAllowed=false
customizer.setReceiversBlackList(Arrays.asList(System.class.getName()));
def shell = new GroovyShell(this.class.classLoader, binding,conf)

shell.evaluate(new File("/home/chetan/Downloads/jonathon/groovyDSL/src/command.groovy"))