package com.github.rifqimfahmi.customviewplayground.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.github.rifqimfahmi.customviewplayground.R
import com.github.rifqimfahmi.customviewplayground.util.DataUtil
import kotlinx.android.synthetic.main.item_log.view.*

class LogAdapter : RecyclerView.Adapter<LogAdapter.LogItem>() {

    private val logData = DataUtil.createLogData()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LogItem {
        return LogItem.create(parent, viewType)
    }

    override fun getItemCount(): Int {
        return logData.size
    }

    override fun onBindViewHolder(holder: LogItem, position: Int) {
        holder.bind(logData[position])
    }

    class LogItem(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(logData: LogData) {
            itemView.tvName.text = logData.name
        }

        companion object {
            val LAYOUT = R.layout.item_log

            fun create(parent: ViewGroup, viewType: Int): LogItem {
                return LogItem(LayoutInflater.from(parent.context).inflate(LAYOUT, parent, false))
            }
        }
    }

    data class LogData(val name: String)
}