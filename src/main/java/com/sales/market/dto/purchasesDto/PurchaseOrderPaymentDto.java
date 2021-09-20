package com.sales.market.dto.purchasesDto;

import com.sales.market.dto.DtoBase;
import com.sales.market.model.purchases.PurchaseOrder;
import com.sales.market.model.purchases.PurchaseOrderPayment;
import com.sales.market.model.purchases.PurchaseOrderPaymentKind;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

public class PurchaseOrderPaymentDto extends DtoBase<PurchaseOrderPayment> {

    private String description;
    private BigDecimal payAmount;
    private PurchaseOrderPaymentKind purchaseOrderPaymentKind;
    private PurchaseOrder purchaseOrder;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    public PurchaseOrderPaymentKind getPurchaseOrderPaymentKind() {
        return purchaseOrderPaymentKind;
    }

    public void setPurchaseOrderPaymentKind(PurchaseOrderPaymentKind purchaseOrderPaymentKind) {
        this.purchaseOrderPaymentKind = purchaseOrderPaymentKind;
    }

    public PurchaseOrder getPurchaseOrder() {
        return purchaseOrder;
    }

    public void setPurchaseOrder(PurchaseOrder purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }
}
