package cn.gooday.logistics.model.entity;


import java.math.BigDecimal;
import java.util.Date;


public class LSOrder {
    private long lsOrderId;
    private String lsOrderCode;//物流订单编号
    private long orderId;
    private BigDecimal fee;//物流费用
    private long sendAddr;
    private String recvAddr;
    private String lsCompanyName;
    private long lsCompanyId;
    private String wayBillno;//运单号
    private int status;//运单状态 1 待支付 2已付款 3待揽收 4已揽收 5已妥投 6已取消 7已拒收
    private Date createTime;
    private long creator;
    private Date updateTime;
    private long updator;
    private int packageNum;//包裹数
    private String receiptInfo;//发票信息
    private int sendType;//发货类型,1 线上平台物流商发货 2 线上自联物流商发货 3 线下发货
    private String demo;//发货备注信息
    private String wayBillnoHid;//顺风返回数据 未公布运单号
    private BigDecimal realWeight; //实际重量
    private BigDecimal realVolume;//实际体积
    private BigDecimal realFee;//实际运费
    private BigDecimal insuranceFee ;//保险费
    private BigDecimal deliveryFee ;//送货上门
    private BigDecimal doorInFee ;//上门揽收费
    private String originCode;//源寄地代码
    private String destinationCode;//目的地代码
    private String filterResult;//筛单结果
    private String returnTrackingNo;//回签单号
    private String mailno;//运单母单号未公布运单,只有商家点击了填写运单号，才把此字段的值复制到way_billno字段
    private int lsSettleStatus;//物流发货单结算状态 1，未结算, 2，欠款 3，已结算
    private int sendDataSrc;

    public long getLsOrderId() {
        return lsOrderId;
    }

    public void setLsOrderId(long lsOrderId) {
        this.lsOrderId = lsOrderId;
    }

    public String getLsOrderCode() {
        return lsOrderCode;
    }

    public void setLsOrderCode(String lsOrderCode) {
        this.lsOrderCode = lsOrderCode;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public long getSendAddr() {
        return sendAddr;
    }

    public void setSendAddr(long sendAddr) {
        this.sendAddr = sendAddr;
    }

    public String getRecvAddr() {
        return recvAddr;
    }

    public void setRecvAddr(String recvAddr) {
        this.recvAddr = recvAddr;
    }

    public String getLsCompanyName() {
        return lsCompanyName;
    }

    public void setLsCompanyName(String lsCompanyName) {
        this.lsCompanyName = lsCompanyName;
    }

    public long getLsCompanyId() {
        return lsCompanyId;
    }

    public void setLsCompanyId(long lsCompanyId) {
        this.lsCompanyId = lsCompanyId;
    }

    public String getWayBillno() {
        return wayBillno;
    }

    public void setWayBillno(String wayBillno) {
        this.wayBillno = wayBillno;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public long getCreator() {
        return creator;
    }

    public void setCreator(long creator) {
        this.creator = creator;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public long getUpdator() {
        return updator;
    }

    public void setUpdator(long updator) {
        this.updator = updator;
    }

    public int getPackageNum() {
        return packageNum;
    }

    public void setPackageNum(int packageNum) {
        this.packageNum = packageNum;
    }

    public String getReceiptInfo() {
        return receiptInfo;
    }

    public void setReceiptInfo(String receiptInfo) {
        this.receiptInfo = receiptInfo;
    }

    public int getSendType() {
        return sendType;
    }

    public void setSendType(int sendType) {
        this.sendType = sendType;
    }

    public String getDemo() {
        return demo;
    }

    public void setDemo(String demo) {
        this.demo = demo;
    }

    public String getWayBillnoHid() {
        return wayBillnoHid;
    }

    public void setWayBillnoHid(String wayBillnoHid) {
        this.wayBillnoHid = wayBillnoHid;
    }

    public BigDecimal getRealWeight() {
        return realWeight;
    }

    public void setRealWeight(BigDecimal realWeight) {
        this.realWeight = realWeight;
    }

    public BigDecimal getRealVolume() {
        return realVolume;
    }

    public void setRealVolume(BigDecimal realVolume) {
        this.realVolume = realVolume;
    }

    public BigDecimal getRealFee() {
        return realFee;
    }

    public void setRealFee(BigDecimal realFee) {
        this.realFee = realFee;
    }

    public BigDecimal getInsuranceFee() {
        return insuranceFee;
    }

    public void setInsuranceFee(BigDecimal insuranceFee) {
        this.insuranceFee = insuranceFee;
    }

    public BigDecimal getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(BigDecimal deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public BigDecimal getDoorInFee() {
        return doorInFee;
    }

    public void setDoorInFee(BigDecimal doorInFee) {
        this.doorInFee = doorInFee;
    }

    public String getOriginCode() {
        return originCode;
    }

    public void setOriginCode(String originCode) {
        this.originCode = originCode;
    }

    public String getDestinationCode() {
        return destinationCode;
    }

    public void setDestinationCode(String destinationCode) {
        this.destinationCode = destinationCode;
    }

    public String getFilterResult() {
        return filterResult;
    }

    public void setFilterResult(String filterResult) {
        this.filterResult = filterResult;
    }

    public String getReturnTrackingNo() {
        return returnTrackingNo;
    }

    public void setReturnTrackingNo(String returnTrackingNo) {
        this.returnTrackingNo = returnTrackingNo;
    }

    public String getMailno() {
        return mailno;
    }

    public void setMailno(String mailno) {
        this.mailno = mailno;
    }

    public int getLsSettleStatus() {
        return lsSettleStatus;
    }

    public void setLsSettleStatus(int lsSettleStatus) {
        this.lsSettleStatus = lsSettleStatus;
    }

    public int getSendDataSrc() {
        return sendDataSrc;
    }

    public void setSendDataSrc(int sendDataSrc) {
        this.sendDataSrc = sendDataSrc;
    }
}

