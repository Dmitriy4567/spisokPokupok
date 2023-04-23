package com.example.spisokpokupok.domain

class DeleteShopItemUseCase(private  val shopListRepositiry: ShopListRepositiry) {

    fun deleteShopItem(shopItem: ShopItem){
        shopListRepositiry.deleteShopItem(shopItem)

    }
}