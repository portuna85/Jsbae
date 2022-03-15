package com.example.jsbae;


import com.example.jsbae.repository.ItemRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Slf4j
@RestController("/item")
public class ItemController {

    @Autowired
    ItemRepository itemRepository;


    @PostMapping
    public void makeItem(@RequestBody Item item) {
        log.info("make Item");
        itemRepository.save(item);
    }

    @GetMapping("/items")
    public Map<Long, Item> items() {
        return itemRepository.findAll();
    }

    @PutMapping("/{itemId}")
    public void modifyItem(@PathVariable long itemId, @RequestBody Item item) {
        itemRepository.updateById(itemId, item);
    }

    @DeleteMapping("/{id}")
    public void removeItem(@PathVariable("id") long itemId) {
        itemRepository.deleteItem(itemId);
    }
}