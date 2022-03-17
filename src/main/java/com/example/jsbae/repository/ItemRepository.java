package com.example.jsbae.repository;

import com.example.jsbae.Item;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Component
@Repository
public class ItemRepository {

    private Map<Long, Item> itemList = new HashMap<>();

    private Long itemId = 0L;

    public void save(Item item) {
        itemList.put(++itemId, item);
    }

    public Map<Long, Item> findAll() {
        return itemList;
    }


    public void deleteItem(long itemId) {
        itemList.remove(itemId);
    }

    public void updateById(long itemId, Item item) {
        itemList.put(itemId, item);
    }
}