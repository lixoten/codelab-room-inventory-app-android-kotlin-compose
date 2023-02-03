package com.example.inventory.ui.screens.itemEntry

import com.example.inventory.ui.screens.itemDetails.ItemDetails

/**
 * Represents Ui State for an Item.
 */
//data class ItemEntryState(
data class ItemEntryUiState(
    val itemDetails: ItemDetails = ItemDetails(),
    val isEntryValid: Boolean = false
)
