package com.github.rifqimfahmi.customviewplayground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import com.github.rifqimfahmi.customviewplayground.adapter.LogAdapter
import com.github.rifqimfahmi.customviewplayground.layoutmanager.LogLinearLayoutManager
import kotlinx.android.synthetic.main.activity_linear_layout_manager.*

class LinearLayoutManagerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear_layout_manager)


        rvLinear.layoutManager = LogLinearLayoutManager(this)
        rvLinear.adapter = LogAdapter()
        rvLinear.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
                Log.d("RECYCLER_SCROLL", dy.toString())
            }
        })
    }
}
