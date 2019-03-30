package com.jk.controller;

import com.jk.pojo.Shop;
import com.jk.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@Controller
@RequestMapping("shop")
public class ShopController {

    @Autowired
    private ShopService shopService;

    @RequestMapping("hello")
    public String hello(){
        return "Hello My Word";
    }
    @RequestMapping("queryShop")
    public String queryShop(Model model){
        List<Shop> shopping=shopService.queryShop();
        model.addAttribute("shop",shopping);
        return  "showShop";
    }
    @RequestMapping("updShop")
    public String updShop(Integer id,Model model){
        Shop shop= shopService.updShop(id);
        model.addAttribute("shop",shop);
        return "updShop";
    }
    @RequestMapping("update")
    @ResponseBody
    public void update(Shop shop){
        shopService.update(shop);
    }
    @RequestMapping("addShop1")
    public String addShop(){
        return "addShop";
    }
    @RequestMapping("addShop")
    @ResponseBody
    public void addShop(Shop shop){
        shopService.addShop(shop);
    }
    @RequestMapping("whereQuery")
    public String whereQuery(Shop shop2,Model model){
        List<Shop> shopList = shopService.whereQuery(shop2);
        model.addAttribute("shop",shopList);
        return "showShop";
    }


    @RequestMapping("uploadPhotoFile")
    @ResponseBody
    public String upImg(MultipartFile artImg,HttpServletRequest req) throws Exception{
        //获取原文件名称
        String fileName = artImg.getOriginalFilename();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String folderPath = req.getSession().getServletContext().getRealPath("/")+
                "upload/";
        File file = new File(folderPath);
        //	        该目录是否已经存在
        if(!file.exists()){
            //   创建文件夹
            file.mkdir();
        }
        String onlyFileName = sdf.format(new Date())+fileName.substring(fileName.lastIndexOf('.'));
        FileOutputStream fos = new FileOutputStream(folderPath+onlyFileName);
        fos.write(artImg.getBytes());
        fos.flush();
        fos.close();
        return  "/upload/"+onlyFileName;
    }



    @RequestMapping("deletegoods")
    @ResponseBody
    public void deletegoods(Integer id){
        shopService.deletegoods(id);
    }


   @RequestMapping("testgit")
    public String testgit(){
        return "testokkkk";
   }

}
