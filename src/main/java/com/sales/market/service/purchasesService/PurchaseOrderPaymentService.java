package com.sales.market.service.purchasesService;

import com.sales.market.model.ItemInstance;
import com.sales.market.model.purchases.PurchaseOrderPayment;
import com.sales.market.service.GenericService;

import java.util.List;

public interface PurchaseOrderPaymentService extends GenericService<PurchaseOrderPayment> {
    List<ItemInstance> productsToExpire(Integer days);
}
