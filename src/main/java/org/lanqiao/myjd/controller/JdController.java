package org.lanqiao.myjd.controller;

import org.lanqiao.myjd.entity.*;
import org.lanqiao.myjd.service.BigClassService;
import org.lanqiao.myjd.service.CartService;
import org.lanqiao.myjd.service.ProductService;
import org.lanqiao.myjd.service.SmallClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class JdController {

    @Autowired
    ProductService productService;
    @Autowired
    CartService cartService;
    @Autowired
    BigClassService bigClassService;
    @Autowired
    SmallClassService smallClassService;

    @RequestMapping("/getCookie")
    public String setCookie(HttpServletResponse response){
        Cookie cookie = new Cookie("test","same");
        cookie.setPath("/");
        response.addCookie(cookie);
        return "success";
    }

    @RequestMapping("/search/getPro")
    public List<Product> getAll(Key key){
        System.out.println(key.getHighPrice());
        List<Product> list=productService.getAll(key);
        return list;
    }

    @RequestMapping("/search/inputCart")
    public int inset(Cart cart){
        return cartService.insert(cart);
    }

    @RequestMapping("/key")
    public Product select(){
        System.out.println(12);
        Product m = productService.selectByPrimaryKey();
        System.out.println(m);
        return m;
    }


    @RequestMapping("/search/getPageCount")
    public int getPageCount(Key key){
        return productService.getPageCount(key);
    }


    @RequestMapping("/search/getAllBigClass")
    public List<BigClass> getAllBigClass(Key key){
        return bigClassService.getAllBigClass(key);
    }

    @RequestMapping("/search/getAllSmallClass")
    public List<SmallClass> getAllSmallClass(Key key){
        return smallClassService.getAllSmallClass(key);
    }

    @RequestMapping("/backstage/search/smallclass")
    public List<SmallClass> getAllSClass_back(Key key){
        return smallClassService.getAllSmallClass(key);
    }

    @RequestMapping("/backstage/search/smallclassCount")
    public int getSmallClassCount(){
        return smallClassService.getSmallClassCount();
    }

    @RequestMapping("/backstage/search/bigclass")
    public List<BigClass> getAllBclass(Key key){
        return bigClassService.getAllBigClass(key);
    }

    @RequestMapping("/backstage/search/bigclassCount")
    public int getBigClassCount(){
        return bigClassService.getBigClassCount();
    }

    @RequestMapping("/backstage/deleteSmall")
    public int deleteSmallClass(Key key){
        return smallClassService.deleteSmallClass(key.getDeleteId());
    }

    @RequestMapping("/backstage/deleteBig")
    public int deleteBigClass(Key key){
        return bigClassService.deleteBigClass(key.getDeleteId());
    }

    @RequestMapping("/backstage/change/smallclass")
    public int changeSmallClass(Key key){
        return smallClassService.changeSmallClass(key);
    }

    @RequestMapping("/backstage/change/bigclass")
    public int changeBigClass(Key key){
        return bigClassService.changeBigClass(key);
    }

    @RequestMapping("backstage/insert/bigclass")
    public int insertBigClass(Key key){
        return bigClassService.insertBigClass(key);
    }

    @RequestMapping("/backstage/insert/smallclass")
    public int insertSmallClass(Key key){
        return smallClassService.insertSmallClass(key);
    }
}
