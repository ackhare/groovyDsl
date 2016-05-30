package com.nexthoughts.dev.dslRobo

import org.codehaus.groovy.control.CompilerConfiguration
import org.codehaus.groovy.control.customizers.ImportCustomizer


Integer.metaClass.getCm={->
    new Distance(delegate,Unit.centimeter)
}

Integer.metaClass.getMeter={->
    new Distance(delegate,Unit.meter)
}
Integer.metaClass.getKm={->
    new Distance(delegate,Unit.kilometer)
}


def binding = new Binding([
        robot: new Robot()
//        h: new Duration(1,TimeUnit.hour)
])

def importCustomizer = new ImportCustomizer()
importCustomizer.addStaticStars Direction.class.name

def config = new CompilerConfiguration()
config.addCompilationCustomizers importCustomizer
config.scriptBaseClass = RobotBaseScriptClass.class.name

def shell = new GroovyShell(this.class.classLoader, binding, config)
shell.evaluate(new File("/home/chetan/Downloads/jonathon/groovyDSL/src/robo_command.groovy"))

abstract class RobotBaseScriptClass extends Script {
    @Delegate @Lazy Robot robot = this.binding.robot
}

/*
move left
    move right, 3.meters

    move right, by: 3.meters
    move right, by: 3.meters, at: 5.km/h

    move right by 3.meters at 5.km/h
 */