package com.plcoding.stockmarketapp.presentation.company_info

import com.plcoding.stockmarketapp.domain.model.CompanyInfo

data class CompanyInfoState(
    val company: CompanyInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
