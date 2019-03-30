package com.jk.service.impl;

import com.jk.dao.ShopMapper;
import com.jk.pojo.Shop;
import com.jk.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {
    @Autowired
    private ShopMapper shopMapper;
    @Override
    public List<Shop> queryShop() {
        return shopMapper.queryShop();
    }

    @Override
    public Shop updShop(Integer id) {
        return shopMapper.updShop(id);
    }

    @Override
    public void update(Shop shop) {
        shopMapper.update(shop);
    }

    @Override
    public void addShop(Shop shop) {
        shopMapper.addShop(shop);
    }

    @Override
    public List<Shop> whereQuery(Shop shop) {
        return shopMapper.whereQuery(shop);
    }

    @Override
    public void deletegoods(Integer id) {
        shopMapper.deletegoods(id);
    }


}
