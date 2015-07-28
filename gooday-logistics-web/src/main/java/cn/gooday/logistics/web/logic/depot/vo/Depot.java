/*
 * 巨商汇平台 版权所有 Copyright@2014
 */
package cn.gooday.logistics.web.logic.depot.vo;

import com.fasterxml.jackson.annotation.JsonView;

/**
 * [简短描述该类的功能]
 *
 * @ProjectName: [gooday-ls]
 * @Author: [tophawk]
 * @CreateDate: [2015/6/9 22:03]
 * @Update: [说明本次修改内容] BY[tophawk][2015/6/9]
 * @Version: [v1.0]
 */
public final class Depot {
    public static interface OnlyIdView {}
    public static interface OnlyNameView {}
    public static interface IdNameView extends OnlyIdView,OnlyNameView{}

    @JsonView(OnlyIdView.class)
    private long id;

    @JsonView(value={OnlyNameView.class})
    //@JsonView(value={OnlyNameView.class,OnlyIdView.class})
    private String name;

    private long num;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNum() {
        return num;
    }

    public void setNum(long num) {
        this.num = num;
    }
}
