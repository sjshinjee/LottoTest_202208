package com.example.lottotest_202208

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var mNumList = ArrayList<Int>()
    val mNumViewList = ArrayList<TextView>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numBtn.setOnClickListener {
           btnNum()
        }

    }

    fun btnNum(){
        for (i in 0 until 6) {

            while (true) {
                val randomNum = (Math.random() * 45 + 1).toInt()

                if(!mNumList.contains(randomNum)) {
                    mNumList.add(randomNum)
                    break
                }
            }  //whiel(true)
        }   //for(i in 0 until 6)

        mNumList.sort()

        for ((index, num) in mNumList.withIndex()) {

            mNumViewList[index].text = num.toString()
        }
    }

}