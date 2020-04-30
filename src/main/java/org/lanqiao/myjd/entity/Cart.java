package org.lanqiao.myjd.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Cart {
    private Integer cartId;

    private Integer usersId;

    private Integer productId;

    private Integer cartCount;


    private Float cartPrice;

    private Date cartTime;

    private Date cartModified;

    private Product product;

    private ProductPic pic;

    private Float sumM;

    public Float getSumM() {
        return sumM;
    }

    public void setSumM(Float sumM) {
        this.sumM = sumM;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public ProductPic getPic() {
        return pic;
    }

    public void setPic(ProductPic pic) {
        this.pic = pic;
    }

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getCartCount() {
        return cartCount;
    }

    public void setCartCount(Integer cartCount) {
        this.cartCount = cartCount;
    }


    public Float getCartPrice() {
        return cartPrice;
    }

    public void setCartPrice( Float cartPrice) {
        this.cartPrice = cartPrice;
    }

    public Date getCartTime() {
        return cartTime;
    }

    public void setCartTime(Date cartTime) {
        this.cartTime = cartTime;
    }

    public Date getCartModified() {
        return cartModified;
    }

    public void setCartModified(Date cartModified) {
        this.cartModified = cartModified;
    }


    @Override
    public String toString() {
        return "Cart{" +
                "cartId=" + cartId +
                ", usersId=" + usersId +
                ", productId=" + productId +
                ", cartCount=" + cartCount +
                ", cartPrice=" + cartPrice +
                ", cartTime=" + cartTime +
                ", cartModified=" + cartModified +
                ", product=" + product +
                ", pic=" + pic +
                ", sumM=" + sumM +
                '}';
    }
}