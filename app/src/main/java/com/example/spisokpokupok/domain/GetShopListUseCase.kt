package com.example.spisokpokupok.domain

import androidx.lifecycle.LiveData

class GetShopListUseCase(private  val shopListRepositiry: ShopListRepositiry) {

    fun getShopList():LiveData<List<ShopItem>>{
         return shopListRepositiry.getShopList()
    }
}