package com.sales.market.dto.purchasesDto;

import com.sales.market.dto.DtoBase;
import com.sales.market.model.purchases.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class PurchaseOrderDto extends DtoBase<PurchaseOrder> {
    private String orderNumber;
    private Date date;
    private PurchaseOrderState state;
    private PurchaseOrderReceivedType receivedType;
    private String providerCode;
    private String gloss;
    private Date receptionDate;
    private BigDecimal totalAmount;
    private PurchaseOrderDetail defaultDetail;
    private Provider provider;
    private List<PurchaseOrderDetail> purchaseOrderDetailList;
    private PurchaseOrderPaymentStatus paymentStatus;
    private BigDecimal balanceAmount;

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public PurchaseOrderState getState() {
        return state;
    }

    public void setState(PurchaseOrderState state) {
        this.state = state;
    }

    public PurchaseOrderReceivedType getReceivedType() {
        return receivedType;
    }

    public void setReceivedType(PurchaseOrderReceivedType receivedType) {
        this.receivedType = receivedType;
    }

    public String getProviderCode() {
        return providerCode;
    }

    public void setProviderCode(String providerCode) {
        this.providerCode = providerCode;
    }

    public String getGloss() {
        return gloss;
    }

    public void setGloss(String gloss) {
        this.gloss = gloss;
    }

    public Date getReceptionDate() {
        return receptionDate;
    }

    public void setReceptionDate(Date receptionDate) {
        this.receptionDate = receptionDate;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public PurchaseOrderDetail getDefaultDetail() {
        return defaultDetail;
    }

    public void setDefaultDetail(PurchaseOrderDetail defaultDetail) {
        this.defaultDetail = defaultDetail;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public List<PurchaseOrderDetail> getPurchaseOrderDetailList() {
        return purchaseOrderDetailList;
    }

    public void setPurchaseOrderDetailList(List<PurchaseOrderDetail> purchaseOrderDetailList) {
        this.purchaseOrderDetailList = purchaseOrderDetailList;
    }

    public PurchaseOrderPaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PurchaseOrderPaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public BigDecimal getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(BigDecimal balanceAmount) {
        this.balanceAmount = balanceAmount;
    }
}
