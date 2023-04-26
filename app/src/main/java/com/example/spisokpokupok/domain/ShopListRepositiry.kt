package com.example.spisokpokupok.domain

import androidx.lifecycle.LiveData

interface ShopListRepositiry {

    fun addShopItem(shopItem: ShopItem)
    fun deleteShopItem(shopItem: ShopItem)
    fun editShopItem(shopItem: ShopItem)
    fun getShopItem(shopItemId: Int): ShopItem
    fun getShopList():LiveData<List<ShopItem>>
}