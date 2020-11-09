package com.mj.gof_adapter_pattern.ActionClass

import com.mj.gof_adapter_pattern.impl.Duck

class WildDuck: Duck {
    override fun quack() {
        println("Duck: QQUUUUECK!")
    }

    override fun fly() {
        println("Duck: pu du du duck")
    }
}