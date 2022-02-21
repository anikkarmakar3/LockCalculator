package com.lock.lockcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    lateinit var edt_result: EditText
    var number1 : Float = 0.0f

    var isSum : Boolean = false
    var isSubtract : Boolean = false
    var isMul : Boolean = false
    var isDivide : Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edt_result = findViewById(R.id.edt_number)
        edt_result.setText("")
    }
    fun operationFunction(view: View) {
        when(view.id){
            R.id.bu0->{
                numberClicked(0)
            }
            R.id.bu1->{
                numberClicked(1)
            }
            R.id.bu2->{
                numberClicked(2)
            }
            R.id.bu3->{
                numberClicked(3)
            }
            R.id.bu4->{
                numberClicked(4)
            }
            R.id.bu5->{
                numberClicked(5)
            }
            R.id.bu6->{
                numberClicked(6)
            }
            R.id.bu7->{
                numberClicked(7)
            }
            R.id.bu8->{
                numberClicked(8)
            }
            R.id.bu9->{
                numberClicked(9)
            }
            R.id.buAC->{
                edt_result.setText("")
            }
            R.id.buDot->{
                val number=edt_result.text.toString()+"."
                edt_result.setText(number)
            }
            R.id.buDiv->{
                number1 = edt_result.text.toString().toFloat()
                edt_result.setText("")
                isDivide = true
            }
            R.id.buMul->{
                number1= edt_result.text.toString().toFloat()
                edt_result.setText("")
                isMul= true
            }
            R.id.buSub->{
                number1= edt_result.text.toString().toFloat()
                edt_result.setText("")
                isSubtract= true
            }
            R.id.buSum->{
                number1= edt_result.text.toString().toFloat()
                edt_result.setText("")
                isSum=true
            }
            R.id.buEq->{
                when{
                    isSum->{
                        val number2=edt_result.text.toString().toFloat()
                        val result= number1 + number2
                        edt_result.setText("$result".toString())
                        isSum=false
                    }
                    isDivide->{
                        val number2=edt_result.text.toString().toFloat()
                        val result= number1 / number2
                        edt_result.setText("$result".toString())
                        isDivide=false
                    }
                    isMul->{
                        val number2=edt_result.text.toString().toFloat()
                        val result= number1 * number2
                        edt_result.setText("$result".toString())
                        isMul=false
                    }
                    isSubtract->{
                        val number2=edt_result.text.toString().toFloat()
                        val result= number1 - number2
                        edt_result.setText("$result".toString())
                        isSubtract=false
                    }
                }
            }
        }

    }
    private fun numberClicked(numberClicked: Int) {
        val number = edt_result.text.toString() + numberClicked.toString()
        edt_result.setText(number)
    }


}