package org.lanqiao.myjd.entity;

public class BigClass {
    private Integer bclassId;

    private String bclassName;

    private Integer bclassPageCount;

    public Integer getBclassPageCount() {
        return bclassPageCount;
    }

    public void setBclassPageCount(Integer bclassPageCount) {
        this.bclassPageCount = bclassPageCount;
    }

    public Integer getBclassId() {
        return bclassId;
    }

    public void setBclassId(Integer bclassId) {
        this.bclassId = bclassId;
    }

    public String getBclassName() {
        return bclassName;
    }

    public void setBclassName(String bclassName) {
        this.bclassName = bclassName == null ? null : bclassName.trim();
    }
}