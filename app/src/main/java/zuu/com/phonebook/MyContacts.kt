package zuu.com.phonebook

import android.app.Application
import android.content.Context

class MyContacts:Application() {
    companion object{
        lateinit var appContext:Context
//        context is an environmental var that gives information of what is happening within
    }
    override fun onCreate() {
        super.onCreate()
        appContext = applicationContext
    }
}