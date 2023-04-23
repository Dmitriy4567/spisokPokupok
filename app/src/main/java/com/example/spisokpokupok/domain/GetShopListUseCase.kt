package com.example.spisokpokupok.domain

class GetShopListUseCase(private  val shopListRepositiry: ShopListRepositiry) {

    fun getShopList():List<ShopItem>{
         return shopListRepositiry.getShopList()
    }
}