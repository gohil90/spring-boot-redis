package com.gohil90.learning.redis.cache;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Component;

@Component
@EnableCaching
public class ItemCacheService {

    @Cacheable(cacheNames = "itemCache", key = "{'item-'.concat(#id)}")
    public String fetchItem(String id) {
        System.out.println("Fetching item with " + id);
        return new StringBuilder(id).reverse().toString();
    }
}
