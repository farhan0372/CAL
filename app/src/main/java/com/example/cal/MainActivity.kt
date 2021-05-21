package com.example.cal

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Num1 = findViewById<EditText>(R.id.ac_main_edt_Num1)
        val Num2 = findViewById<EditText>(R.id.ac_main_edt_Num2)
        var btn_Plus = findViewById<Button>(R.id.ac_main_btn_Plus)
        var btn_Min = findViewById<Button>(R.id.ac_main_btn_Min)
        var btn_Mullti = findViewById<Button>(R.id.ac_main_btn_Mullti)
        var btn_Div = findViewById<Button>(R.id.ac_main_btn_Div)
        var tv_Result=findViewById<TextView>(R.id.ac_main_tv_Result)

        btn_Plus.setOnClickListener{

            var n10:String=Num1.text.toString()
            var n11:Int=n10.toInt()
            var n2:Int=Num2.text.toString().toInt()
            var Result = n11+n2
            tv_Result.text=Result.toString()

            tv_Result.setTextColor(Color.parseColor("#FF9800"))


        }

        btn_Min.setOnClickListener{
            var n10:String=Num1.text.toString()
            var n11:Int=n10.toInt()
            var n2:Int=Num2.text.toString().toInt()
            var Result = n11-n2
            tv_Result.text=Result.toString()

            tv_Result.setTextColor(Color.parseColor("#2196F3"))
        }

        btn_Div.setOnClickListener{

            var n10:String=Num1.text.toString()
            var n11:Int=n10.toInt()
            var n2:Int=Num2.text.toString().toInt()
            var Result = n11 / n2
            tv_Result.text=Result.toString()

            tv_Result.setTextColor(Color.parseColor("#4CAF50"))

        }

        btn_Mullti.setOnClickListener {

            var n10:String=Num1.text.toString()
            var n11:Int=n10.toInt()
            var n2:Int=Num2.text.toString().toInt()
            var Result = n11 * n2
            tv_Result.text=Result.toString()

            tv_Result.setTextColor(Color.parseColor("#FFEB3B"))
        }
    }
}