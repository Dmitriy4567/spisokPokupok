package com.example.spisokpokupok.domain

interface ShopListRepositiry {

    fun addShopItem(shopItem: ShopItem)
    fun deleteShopItem(shopItem: ShopItem)
    fun editShopItem(shopItem: ShopItem)
    fun getShopItem(shopItemId: Int): ShopItem
    fun getShopList():List<ShopItem>
}