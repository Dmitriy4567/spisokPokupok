package com.example.spisokpokupok.domain

class EditShopItemUseCase(private  val shopListRepositiry: ShopListRepositiry) {

    fun editShopItem(shopItem: ShopItem){
        shopListRepositiry.editShopItem(shopItem)

    }
}