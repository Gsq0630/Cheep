package org.lanqiao.myjd.entity;

public class ProductPic {
    private Integer picId;

    private Integer proId;

    private String picWords;

    private String picUrl;

    private Integer picMaster;

    public Integer getPicId() {
        return picId;
    }

    public void setPicId(Integer picId) {
        this.picId = picId;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getPicWords() {
        return picWords;
    }

    public void setPicWords(String picWords) {
        this.picWords = picWords == null ? null : picWords.trim();
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    public Integer getPicMaster() {
        return picMaster;
    }

    public void setPicMaster(Integer picMaster) {
        this.picMaster = picMaster;
    }
}