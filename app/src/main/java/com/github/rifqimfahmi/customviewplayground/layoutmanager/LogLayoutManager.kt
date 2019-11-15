package com.github.rifqimfahmi.customviewplayground.layoutmanager

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class LogLayoutManager : RecyclerView.LayoutManager() {
    override fun generateDefaultLayoutParams(): RecyclerView.LayoutParams {
        return RecyclerView.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
    }
}