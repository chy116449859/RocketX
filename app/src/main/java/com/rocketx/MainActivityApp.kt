package com.rocketx

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.projectb.MainActivityB
import com.projectc.MainActivityC

class MainActivityApp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_projectc)

        startActivity(Intent(this,MainActivityC::class.java))
    }

    fun test(v: View) {
//        Log.e("lzy", "test: " )
        MainActivityB.test()
        MainActivityC.test()
    }
}