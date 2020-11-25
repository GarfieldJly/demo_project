package com.garfield.pape.req;


import java.io.Serializable;

public class PageReq implements Serializable{

	private static final long serialVersionUID = 1L;

    private Integer pageNumber = 1;

    private Integer pageSize = 10;

    private String sortType = "";

    private String sortColumn = "";

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getSortType() {
        return sortType;
    }

    public void setSortType(String sortType) {
        this.sortType = sortType;
    }

    public String getSortColumn() {
        return sortColumn;
    }

    public void setSortColumn(String sortColumn) {
        this.sortColumn = sortColumn;
    }
}
