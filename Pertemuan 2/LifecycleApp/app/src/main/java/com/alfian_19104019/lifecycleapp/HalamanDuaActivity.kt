package com.alfian_19104019.lifecycleapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class HalamanDuaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.oncreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_dua)
    }
w
    override fun onStart(){
        super.onstart()
        printState("Halaman dua On Start")
    }
    override fun onResume(){
        super.onResume()
        printState("Halaman dua On Resume")
    }
    override fun onPause(){
        super.onPause()
        printState("Halaman dua On Pause")
    }
    override fun onStop(){
        super.onStop()
        printState("Halaman dua On Stop")
    }
    override fun onRestart(){
        super.onRestart()
        printState("Halaman dua On Restart")
    }
    override fun onDestroy() {
        super.onDestroy()
        printState("Halaman dua On Destroy")
    }
    fun printState(msg: String){
        Log.d("ActivityState",msg)
        Toast.makeText(applicationContext,msg, Toast.LENGTH_SHORT).show()
    }

}