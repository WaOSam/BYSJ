package com.sam.pojo;

import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * springboot_jxc
 * 自定义page对象
 *
 * @author Sam_T
 * @date 2020-03-27 20:23
 */
public class Page<T> {
    /**
     * 当前页数
     */
    private int pageNum;

    /**
     * 页大小
     */
    private int pageSize;

    /**
     * 总页数
     */
    private int totalPage;

    /**
     * 总结果数
     */
    private long totalSize;

    /**
     * 结果集
     */
    private List<T> list;

    public Page(PageInfo<T> pageInfo){
        this.pageNum = pageInfo.getPageNum();
        this.pageSize = pageInfo.getPageSize();
        this.totalPage = pageInfo.getPages();
        this.totalSize = pageInfo.getTotal();
        this.list = pageInfo.getList();
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public long getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(long totalSize) {
        this.totalSize = totalSize;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
