package com.mj.gof_adapter_pattern.ActionClass

import com.mj.gof_adapter_pattern.impl.Turkey

class WildTurkey: Turkey {
    override fun googoo() {
        println("Turkey: goo!! goo!")
    }

    override fun fly() {
        println("Turkey: pu du du duck")
    }
}