Inventory app
==================================

This app is an Inventory tracking app. Demos how to add, update, sell, and delete items from the local database.


one thing to note was how the Routes used in navidation were done. NO ENUM
instead each screen had an object on top
```kotlin
// Example
object ItemDetailsDestination : NavigationDestination {
    override val route = "item_details"
    override val titleRes = R.string.item_detail_title
    const val itemIdArg = "itemId"
    val routeWithArgs = "$route/{$itemIdArg}"
}
```



ref: codelab-room-inventory-app-android-kotlin-compose

