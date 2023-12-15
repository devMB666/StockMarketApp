package com.plcoding.stockmarketapp.util

/*
Resource - явл общим обертывающим классом для представления
результатов выполнения операций в приложении
 */
sealed class Resource<T>(val data: T? = null, val message: String? = null) {
    class Success<T>(data: T?): Resource<T>(data)
    class Error<T>(message: String, data: T? = null): Resource<T>(data, message)
    class Loading<T>(val isLoading: Boolean = true): Resource<T>(null)
}
