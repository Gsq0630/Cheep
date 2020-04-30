package org.lanqiao.myjd.entity;

public class SmallClass {
    private Integer sclassId;

    private String sclassName;

    private Integer bclassId;

    private String bclassName;

    private int pageCount;

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getBclassName() {
        return bclassName;
    }

    public void setBclassName(String bclassName) {
        this.bclassName = bclassName;
    }

    public Integer getSclassId() {
        return sclassId;
    }

    public void setSclassId(Integer sclassId) {
        this.sclassId = sclassId;
    }

    public String getSclassName() {
        return sclassName;
    }

    public void setSclassName(String sclassName) {
        this.sclassName = sclassName == null ? null : sclassName.trim();
    }

    public Integer getBclassId() {
        return bclassId;
    }

    public void setBclassId(Integer bclassId) {
        this.bclassId = bclassId;
    }
}