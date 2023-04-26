package com.example.spisokpokupok.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.spisokpokupok.data.ShopListREpositiryImpl
import com.example.spisokpokupok.domain.DeleteShopItemUseCase
import com.example.spisokpokupok.domain.EditShopItemUseCase
import com.example.spisokpokupok.domain.GetShopListUseCase
import com.example.spisokpokupok.domain.ShopItem

class MainViewModel: ViewModel() {

    private val repository = ShopListREpositiryImpl

    private val getShopListUseCase = GetShopListUseCase(repository)
    private val deliteShopItemUseCase = DeleteShopItemUseCase(repository)
    private val editShopItemUseCase = EditShopItemUseCase(repository)

    val shopList = getShopListUseCase.getShopList()


    fun deleteShopItem(shopItem: ShopItem){
        deliteShopItemUseCase.deleteShopItem(shopItem)
    }

    fun chengeEnableState(shopItem: ShopItem){
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editShopItemUseCase.editShopItem(newItem)
    }
}