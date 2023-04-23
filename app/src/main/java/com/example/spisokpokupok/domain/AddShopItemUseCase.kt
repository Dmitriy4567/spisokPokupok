package com.example.spisokpokupok.domain

class AddShopItemUseCase(private  val shopListRepositiry: ShopListRepositiry) {

    fun addShopItem(shopItem: ShopItem){
        shopListRepositiry.addShopItem(shopItem)

    }
}