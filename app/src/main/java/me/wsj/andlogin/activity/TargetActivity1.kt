package me.wsj.andlogin.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import me.wsj.andlogin.R
import per.wsj.annotation.NeedLogin

@NeedLogin
class TargetActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_target1)
    }
}