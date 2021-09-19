/**
 * @author: Edson A. Terceros T.
 */

package com.sales.market.model.purchases;

import com.sales.market.dto.purchasesDto.ActionRequiredDto;
import com.sales.market.model.ModelBase;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class ActionRequired extends ModelBase<ActionRequiredDto> {

    @ManyToOne
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
