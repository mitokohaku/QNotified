package me.singleneuron.base.bridge

import com.google.gson.Gson
import nil.nadph.qnotified.util.NonNull
import java.net.URL

abstract class CardMsgList {

    companion object {

        @JvmStatic
        @NonNull
        fun getInstance(): ()->String {
            //Todo
            return ::getBlackList
        }

    }
}

fun getBlackListExample(): String {
    return "{}"
}

fun getBlackList(): String {
    return "{}"
}
