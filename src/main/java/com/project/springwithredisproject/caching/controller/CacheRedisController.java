package com.project.springwithredisproject.caching.controller;

import com.project.springwithredisproject.caching.service.CacheRedisService;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CacheRedisController {
    private final CacheRedisService cacheRedisService;

    private int sayac = 0;

    //
    @GetMapping("/api/user")
    public String cacheControl() throws InterruptedException {
        if (sayac == 5){
            cacheRedisService.clear();//cache temizlendi
            sayac = 0;
        }
        sayac++;

        return cacheRedisService.longRun();

    }
}
