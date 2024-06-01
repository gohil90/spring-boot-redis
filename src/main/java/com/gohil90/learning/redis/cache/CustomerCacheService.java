package com.gohil90.learning.redis.cache;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Component;

@Component
@EnableCaching
public class CustomerCacheService {

    @Cacheable(cacheNames = "customerCache", key = "#root.args[0]")
    public double getCustomerCode(Long cif) {
        System.out.println("Fetching customer hash code for " + cif);
        return Math.random();
    }
}
