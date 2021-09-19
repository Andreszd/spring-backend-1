package com.sales.market.dto.purchasesDto;

import com.sales.market.dto.DtoBase;
import com.sales.market.model.purchases.ActionRequired;
import com.sales.market.model.purchases.PurchaseOrder;

public class ActionRequiredDto extends DtoBase<ActionRequired> {

    private PurchaseOrder purchaseOrder;
    private String notes;

    public PurchaseOrder getPurchaseOrder() {
        return purchaseOrder;
    }

    public void setPurchaseOrder(PurchaseOrder purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
