package com.example.jsbae.controller;

import com.example.jsbae.Item;
import com.example.jsbae.repository.ItemRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Slf4j
@RestController("/item")
public class ItemController {

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
    public void modifyItem(@PathVariable long itemId,
                           @RequestBody Item item) {
        itemRepository.updateById(itemId, item);
    }

    @PutMapping("/")

    @DeleteMapping("/{id}")
    public void removeItem(@PathVariable("id") long itemId) {
        itemRepository.deleteItem(itemId);
    }
}