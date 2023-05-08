package edu.uaslp.objetos.shoppingcart;

public class ItemNotFoundException extends RuntimeException {
    public ItemNotFoundException(String message){
        super(message);
    }
}
