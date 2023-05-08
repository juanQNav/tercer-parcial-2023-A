package edu.uaslp.objetos.shoppingcart;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ShoppingCart {
    private Map<ShoppingItem, Integer> items;
    private ShoppingItemCatalog catalog;

    public ShoppingCart(ShoppingItemCatalog catalog) {
        this.catalog = catalog;
        this.items = new HashMap<>();
    }


    public void add(String itemCode) {
        ShoppingItem item = catalog.getItem(itemCode);
        Integer count = items.getOrDefault(item, 0);
        items.put(item, count + 1);
    }

    public int getTotalCostInCents() {
        return items.entrySet().stream()
                .mapToInt(entry -> entry.getKey().getUnitCostInCents() * entry.getValue())
                .sum();
    }

    public int getDistinctItemsCount() {
        return items.size();
    }

    public int getTotalItemsCount() {
        return items.values().stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
    public List<ShoppingItem> getItems() {
        return items.entrySet().stream()
                .flatMap(entry -> Stream.generate(entry::getKey).limit(entry.getValue()))
                .collect(Collectors.toList());
    }
    public Collection<ShoppingItem> getDistinctItems() {
        return null;
    }
}
