package com.nexthoughts.dev.DzoneMemoExample

/**
 * Created by chetan on 26/5/16.
 */

/*
A static method that accepts a closure is a hassle free way to implement a DSL.
In the memo example, the class MemoDsl has a make method. It creates an instance and delegates
all calls in the closure to the instance. This is the mechanism where the "to", and "from" sections
end up executing methods inside the MemoDsl class. Once the to() method is called, we store the text
in the instance for formatting later on.
 */
class MemoDsl {

    String toText
    String fromText
    String body
    def sections = []

    /**
     * This method accepts a closure which is essentially the DSL. Delegate the
     * closure methods to
     * the DSL class so the calls can be processed
     */
    def static make(closure) {
        MemoDsl memoDsl = new MemoDsl()
        // any method called in closure will be delegated to the memoDsl class
        closure.delegate = memoDsl
        closure()
    }

    /**
     * Store the parameter as a variable and use it later to output a memo
     */
    def to(String toText) {
        this.toText = toText
    }

    def from(String fromText) {
        this.fromText = fromText
    }

    def body(String bodyText) {
        this.body = bodyText
    }
}
