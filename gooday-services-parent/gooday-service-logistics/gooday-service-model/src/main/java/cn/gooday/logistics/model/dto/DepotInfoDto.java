/*
 * 巨商汇平台 版权所有 Copyright@2014
 */
package cn.gooday.logistics.model.dto;

/**
 * [简短描述该类的功能]
 *
 * @ProjectName: [gooday-services]
 * @Author: [tophawk]
 * @CreateDate: [2015/6/11 22:44]
 * @Update: [说明本次修改内容] BY[tophawk][2015/6/11]
 * @Version: [v1.0]
 */
public class DepotInfoDto {
    private long depotId;
    private String depotName;
    private String depotCode;

    public long getDepotId() {
        return depotId;
    }

    public void setDepotId(long depotId) {
        this.depotId = depotId;
    }

    public String getDepotName() {
        return depotName;
    }

    public void setDepotName(String depotName) {
        this.depotName = depotName;
    }

    public String getDepotCode() {
        return depotCode;
    }

    public void setDepotCode(String depotCode) {
        this.depotCode = depotCode;
    }
}
