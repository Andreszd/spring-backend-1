package com.sales.market.service.purchasesService;

import com.sales.market.model.purchases.ActionRequired;
import com.sales.market.model.purchases.PurchaseOrder;
import com.sales.market.repository.GenericRepository;
import com.sales.market.repository.purchases.ActionRequiredRepository;
import com.sales.market.repository.purchases.PurchaseOrderRepository;
import com.sales.market.service.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class ActionRequiredServiceImpl extends GenericServiceImpl<ActionRequired> implements ActionRequiredService {
    private final ActionRequiredRepository actionRequiredRepository;

    public ActionRequiredServiceImpl(ActionRequiredRepository actionRequiredRepository){
        this.actionRequiredRepository = actionRequiredRepository;
    }

    @Override
    protected GenericRepository<ActionRequired> getRepository() {
        return null;
    }
}
