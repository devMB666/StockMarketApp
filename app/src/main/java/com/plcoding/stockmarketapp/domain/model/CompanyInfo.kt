package com.plcoding.stockmarketapp.domain.model

import androidx.compose.ui.text.input.KeyboardCapitalization

data class CompanyInfo(
    val symbol: String,
    val description: String,
    val name: String,
    val country: String,
    val industry: String,
    val sector: String,
    val marketCapitalization: String,
    val ebitba: String,
    val trailingPE: String,
    val forwardPE: String,
    val dividend: String,
    val dividendPer: String,
    val dividendDate: String,
)