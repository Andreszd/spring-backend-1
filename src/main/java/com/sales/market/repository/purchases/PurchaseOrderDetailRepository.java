package com.sales.market.repository.purchases;

import com.sales.market.model.purchases.PurchaseOrderDetail;
import com.sales.market.repository.GenericRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseOrderDetailRepository extends GenericRepository<PurchaseOrderDetail> {
}