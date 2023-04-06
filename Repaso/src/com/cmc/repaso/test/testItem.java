package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class testItem {
    public static void main(String[] args) {
        Item item = new Item();
        item.setProductosActuales(20);
        item.imprimir();
        item.vender(10);
        item.imprimir();
        item.devolver(5);
        item.imprimir();
        Item item1 = new Item();
        item1.setProductosActuales(30);
        item1.imprimir();
        item1.vender(20);
        item1.imprimir();
        item1.devolver(5);
        item1.imprimir();
    }
}
