package me.wsj.login.startup

import android.content.Context
import androidx.startup.Initializer
import me.wsj.login.hook.AndLogin
import me.wsj.login.utils.LogUtil

class AndLoginInitializer : Initializer<Unit> {
    //原来在Application中的sdk初始化放到的这里统一初始化
    override fun create(context: Context) {
//        CrashHandler.getInstance().init(context)
        LogUtil.i("AndLoginInitializer create ")
        AndLogin.getInstance().init(context)
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        return emptyList()
    }
}