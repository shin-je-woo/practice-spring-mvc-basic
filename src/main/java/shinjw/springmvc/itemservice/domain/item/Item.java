package shinjw.springmvc.itemservice.domain.item;

import lombok.Data;

@Data
public class Item {

    private long id;
    private String itemName;
    private Integer price;
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
