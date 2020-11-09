package com.mj.gof_adapter_pattern.ActionClass

import com.mj.gof_adapter_pattern.impl.Duck

class TurkeyAdapter: Duck {

    var duck : Duck

    constructor(duck: Duck){
        this.duck = duck
    }

    override fun quack() {
        duck.quack()
    }

    override fun fly() {
        duck.fly()
    }
}