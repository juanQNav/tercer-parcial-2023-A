package edu.uaslp.objetos.shoppingcart;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ShoppingCart {
    private List<ShoppingItemCatalog> shoppingCart;

    public ShoppingCart(ShoppingItemCatalog shoppingItemCatalog){
        shoppingCart =  new ArrayList<>();
    }


    public void add(String abc1000) {
        shoppingCart.add(abc1000);
    }

    public int getTotalCostInCents() {
        Iterator <String> iterator = shoppingCart.iterator();
        ShoppingItemCatalog catalog;
            catalog.getItem(iterator.next());

    }

    public int getDistinctItemsCount() {
    }

    public int getTotalItemsCount() {
    }

    public List<ShoppingItem> getItems() {
    }

    public Collection<ShoppingItem> getDistinctItems() {
    }
}
