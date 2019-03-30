package com.jk.service;

import com.jk.pojo.Shop;

import java.util.List;

public interface ShopService {
    List<Shop> queryShop();

    Shop updShop(Integer id);

    void update(Shop shop);

    void addShop(Shop shop);

    List<Shop> whereQuery(Shop shop);

    void deletegoods(Integer id);
}
