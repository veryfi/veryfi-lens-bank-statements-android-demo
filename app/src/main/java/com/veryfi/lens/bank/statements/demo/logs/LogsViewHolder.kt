package com.veryfi.lens.bank.statements.demo.logs

import androidx.recyclerview.widget.RecyclerView
import com.veryfi.lens.bank.statements.demo.databinding.LogsListItemBinding

class LogsViewHolder(
    private val itemBinding: LogsListItemBinding
) : RecyclerView.ViewHolder(itemBinding.root) {

    fun onBind(log: Log) {
        itemBinding.logsTitle.text = log.title
        itemBinding.logsMessage.setJson(log.message)
        itemBinding.logsMessage.expandJson()
    }
}