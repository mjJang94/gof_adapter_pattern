package com.mj.gof_adapter_pattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mj.gof_adapter_pattern.ActionClass.TurkeyAdapter
import com.mj.gof_adapter_pattern.ActionClass.WildDuck
import com.mj.gof_adapter_pattern.ActionClass.WildTurkey

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val wildDuck = WildDuck()
        val wildTurkey = WildTurkey()

        val turkeyAdapter =
            TurkeyAdapter(duck = wildDuck)

        println("##The turkey do somthing..")
        wildTurkey.googoo()
        wildTurkey.fly()

        println("##The duck do somthing..")
        wildDuck.quack()
        wildDuck.fly()

        println("##The turkey by adapter do somthing..")
        turkeyAdapter.duck.quack()
        turkeyAdapter.duck.fly()
    }
}