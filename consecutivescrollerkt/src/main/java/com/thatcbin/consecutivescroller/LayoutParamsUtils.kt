package com.thatcbin.consecutivescroller

import android.view.ViewGroup

object LayoutParamsUtils {
    /**
     * 使子view的topMargin和bottomMargin属性无效
     *
     * @param params
     */
    @JvmStatic
    fun invalidTopAndBottomMargin(params: ViewGroup.MarginLayoutParams?) {
        if (params != null) {
            params.topMargin = 0
            params.bottomMargin = 0
        }
    }
}