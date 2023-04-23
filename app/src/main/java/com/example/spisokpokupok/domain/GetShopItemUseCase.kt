package com.example.spisokpokupok.domain

class GetShopItemUseCase(private  val shopListRepositiry: ShopListRepositiry) {

    fun getShopItem(shopItemId: Int): ShopItem{
        return  shopListRepositiry.getShopItem(shopItemId)
    }
}