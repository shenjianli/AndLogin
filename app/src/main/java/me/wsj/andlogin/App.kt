package me.wsj.andlogin

import android.app.Application
import android.content.Context
import me.wsj.andlogin.utils.SpUtil
import me.wsj.login.utils.LogUtil
import per.wsj.annotation.JudgeLogin

class App : Application() {

    companion object {
        @JvmStatic
        lateinit var mContext: Context
    }

    override fun attachBaseContext(base: Context?) {
        LogUtil.i("login Application attachBaseContext")
        super.attachBaseContext(base)
    }

    override fun onCreate() {
        LogUtil.i("login Application onCreate")
        super.onCreate()

        mContext = this
    }
}