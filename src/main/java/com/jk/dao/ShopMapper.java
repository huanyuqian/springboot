package com.jk.dao;

import com.jk.pojo.Shop;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ShopMapper {

    @Select("select * from t_shopping")
    List<Shop> queryShop();

    @Select("select * from t_shopping where id= #{id}")
    Shop updShop(Integer id);

    @Update("update t_shopping set name=#{name},photo=#{photo},price=#{price},onlinedate=#{onlinedate},sumren=#{sumren} where id=#{id}")
    void update(Shop shop);

    @Insert("insert into t_shopping (name, photo, price, onlinedate, sumren) values(#{name},#{photo},#{price},#{onlinedate},#{sumren})")
    void addShop(Shop shop);
    @Select("select * from t_shopping where 1=1 and name like '%${name}%'")
    List<Shop> whereQuery(Shop shop);

    @Delete("DELETE FROM t_shopping WHERE id =#{id}")
    void deletegoods(Integer id);
}
