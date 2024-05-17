package com.veryfi.lens.bank.statements.demo.logs

import org.json.JSONObject

data class Log(
    var title: String = "",
    var message: JSONObject = JSONObject()
)