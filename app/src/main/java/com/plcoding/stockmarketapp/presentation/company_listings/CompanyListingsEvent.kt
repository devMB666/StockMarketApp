package com.plcoding.stockmarketapp.presentation.company_listings

sealed class CompanyListingsEvent {
    object Refresh: CompanyListingsEvent() // Для обновления списка компаний
    data class OnSearchQueryChange(val query: String): CompanyListingsEvent() // Событие изменения запроса поиска
}
