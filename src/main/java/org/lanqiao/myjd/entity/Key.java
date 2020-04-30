package org.lanqiao.myjd.entity;

public class Key {

    private String keyWord;
    private int pageSize;
    private int pageNum;
    private float lowPrice;
    private float highPrice;
    private String sort;
    private int smallPageSize;
    private int smallPageNum;
    private String newKeyWord;
    private int deleteId;
    private String className;
    private String classBelong;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassBelong() {
        return classBelong;
    }

    public void setClassBelong(String classBelong) {
        this.classBelong = classBelong;
    }

    public int getDeleteId() {
        return deleteId;
    }

    public void setDeleteId(int deleteId) {
        this.deleteId = deleteId;
    }

    public String getNewKeyWord() {
        return newKeyWord;
    }

    public void setNewKeyWord(String newKeyWord) {
        this.newKeyWord = newKeyWord;
    }

    public int getSmallPageSize() {
        return smallPageSize;
    }

    public void setSmallPageSize(int smallPageSize) {
        this.smallPageSize = smallPageSize;
    }

    public int getSmallPageNum() {
        return smallPageNum;
    }

    public void setSmallPageNum(int smallPageNum) {
        this.smallPageNum = smallPageNum;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public float getLowPrice() {
        return lowPrice;
    }

    public void setLowPrice(float lowPrice) {
        this.lowPrice = lowPrice;
    }

    public float getHighPrice() {
        return highPrice;
    }

    public void setHighPrice(float highPrice) {
        this.highPrice = highPrice;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public int cartID;
    public int orderId;
    public int usersId;
    public String orderAddress;
    public float orderPrice;

    public int getCartID() {
        return cartID;
    }

    public void setCartID(int cardID) {
        this.cartID = cardID;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getUsersId() {
        return usersId;
    }

    public void setUsersId(int usersId) {
        this.usersId = usersId;
    }

    public String getOrderAddress() {
        return orderAddress;
    }

    public void setOrderAddress(String orderAddress) {
        this.orderAddress = orderAddress;
    }

    public float getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(float orderPrice) {
        this.orderPrice = orderPrice;
    }

    @Override
    public String toString() {
        return "Key{" +
                "keyWord='" + keyWord + '\'' +
                ", pageSize=" + pageSize +
                ", pageNum=" + pageNum +
                ", lowPrice=" + lowPrice +
                ", highPrice=" + highPrice +
                ", sort='" + sort + '\'' +
                "cardID=" + cartID +
                ", orderId=" + orderId +
                ", usersId=" + usersId +
                ", orderAddress='" + orderAddress + '\'' +
                ", orderPrice=" + orderPrice +
                '}';
    }
}
