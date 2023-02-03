package com.example.inventory.ui.screens.itemDetails

import com.example.inventory.model.Item
import com.example.inventory.ui.screens.itemEntry.ItemEntryUiState

/**
 * UI state for ItemDetailsScreen
 */
data class ItemDetailsUiState(
    val outOfStock: Boolean = true,
    val itemDetails: ItemDetails = ItemDetails()
)

data class ItemDetails(
    val id: Int = 0,
    val name: String = "",
    val price: String = "",
    val quantity: String = "",
)

/**
 * Extension function to convert [ItemEntryUiState] to [Item]. If the value of [Item.price] is
 * not a valid [Double], then the price will be set to 0.0. Similarly if the value of
 * [ItemEntryUiState] is not a valid [Int], then the quantity will be set to 0
 */
fun ItemDetails.toItem(): Item = Item(
    id = id,
    name = name,
    price = price.toDoubleOrNull() ?: 0.0,
    quantity = quantity.toIntOrNull() ?: 0
)

/**
 * Extension function to convert [Item] to [ItemEntryUiState]
 */
fun Item.toItemUiState(isEntryValid: Boolean = false): ItemEntryUiState = ItemEntryUiState(
    itemDetails = this.toItemDetails(),
    isEntryValid = isEntryValid
)

/**
 * Extension function to convert [Item] to [ItemDetails]
 */
fun Item.toItemDetails(): ItemDetails = ItemDetails(
    id = id,
    name = name,
    price = price.toString(),
    quantity = quantity.toString()
)
