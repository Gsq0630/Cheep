package org.lanqiao.myjd.entity;

import java.util.Date;

public class Product {
    private Integer proId;

    private String proName;

    private Integer proBclassId;

    private Integer proSclassId;

    private Float proPrice;

    private Integer proCount;

    private Integer pageCount;

    private String proWords;

    private Date proDate;

    private ProductPic productPic;

    public ProductPic getProductPic() {
        return productPic;
    }

    public void setProductPic(ProductPic productPic) {
        this.productPic = productPic;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "proId=" + proId +
                ", proName='" + proName + '\'' +
                ", proBclassId=" + proBclassId +
                ", proSclassId=" + proSclassId +
                ", proPrice=" + proPrice +
                ", proCount=" + proCount +
                ", proWords='" + proWords + '\'' +
                ", proDate=" + proDate +
                '}';
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName == null ? null : proName.trim();
    }

    public Integer getProBclassId() {
        return proBclassId;
    }

    public void setProBclassId(Integer proBclassId) {
        this.proBclassId = proBclassId;
    }

    public Integer getProSclassId() {
        return proSclassId;
    }

    public void setProSclassId(Integer proSclassId) {
        this.proSclassId = proSclassId;
    }

    public Float getProPrice() {
        return proPrice;
    }

    public void setProPrice(Float proPrice) {
        this.proPrice = proPrice;
    }

    public Integer getProCount() {
        return proCount;
    }

    public void setProCount(Integer proCount) {
        this.proCount = proCount;
    }

    public String getProWords() {
        return proWords;
    }

    public void setProWords(String proWords) {
        this.proWords = proWords == null ? null : proWords.trim();
    }

    public Date getProDate() {
        return proDate;
    }

    public void setProDate(Date proDate) {
        this.proDate = proDate;
    }
}