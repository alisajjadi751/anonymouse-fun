package com.ali_sajjadi.tamrin

import android.util.Log

class Test private constructor() {


    companion object {

        val instance: Test by lazy {
            Test()
        }

    }

    fun showLog(){

        Log.i("TESTING",getDate("Miladi"))
    }

    //Anonymous fun
    val getDate = fun(time: String) ="2024/08/05 $time"


}
