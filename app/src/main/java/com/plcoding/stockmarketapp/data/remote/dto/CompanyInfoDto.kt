package com.plcoding.stockmarketapp.data.remote.dto

import com.squareup.moshi.Json

data class CompanyInfoDto(
    @field:Json(name = "Symbol") val symbol: String?,
    @field:Json(name = "Description") val description: String?,
    @field:Json(name = "Name") val name: String?,
    @field:Json(name = "Country") val country: String?,
    @field:Json(name = "Industry") val industry: String?,
    @field:Json(name = "Sector") val sector: String?,
    @field:Json(name = "MarketCapitalization") val marketCapitalization: String?,
    @field:Json(name = "EBITDA") val ebitba: String?,
    @field:Json(name = "TrailingPE") val trailingPE: String?,
    @field:Json(name = "ForwardPE") val forwardPE: String?,
    @field:Json(name = "DividendPerShare") val dividend: String?,
    @field:Json(name = "DividendYield") val dividendPer: String?,
    @field:Json(name = "DividendDate") val dividendDate: String?,
)
