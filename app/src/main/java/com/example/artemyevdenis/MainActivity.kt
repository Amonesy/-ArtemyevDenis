package com.example.artemyevdenis

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout


class MainActivity : AppCompatActivity() {
    //oblast peremennyh

    private var text: String = "В магазине <осталось> 10 колы, а может и больше"
    private var text2: String = "В магазине осталось 10 колы, а <может> и больше"
    private var tvText: TextView? = null;



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //отображение нужного слоя
        tvText = findViewById(R.id.tvTextView) //сВЯЗАЛИ ПЕРЕМЕННУЮ И КОМПОНЕНТ
        var subText: String = text.substringAfter('<')
        var subText2: String = subText.substringBefore('>')
        var subText3: String = text2.substringAfter('<')
        var subText4: String = subText.substringBefore('>')
        //Отобразить содержимое переменной tvText на компоненте tvTextView2
        tvText?.setText(subText2)



    }
    }

