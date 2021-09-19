package com.sales.market.service.purchasesService;

import com.sales.market.model.purchases.PurchaseOrder;
import com.sales.market.model.purchases.PurchaseOrderState;
import com.sales.market.repository.GenericRepository;
import com.sales.market.repository.purchases.PurchaseOrderRepository;
import com.sales.market.service.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class PurchaseOrderServiceImpl extends GenericServiceImpl<PurchaseOrder> implements  PurchaseOrderService {

    private final PurchaseOrderRepository purchaseOrderRepository;

    public PurchaseOrderServiceImpl(PurchaseOrderRepository purchaseOrderRepository){
        this.purchaseOrderRepository = purchaseOrderRepository;
    }


    public boolean possibleToEdit(Long id){
        boolean res = false;
         PurchaseOrder purchaseOrder = findById(id);
         String state = purchaseOrder.getState().toString();
         if(state.equals("PEN") || state.equals("APR")){
             res = true;
         }
       return res;
    }

    public void changeState(PurchaseOrderState state, Long id){
        PurchaseOrder purchaseOrder = findById(id);
        purchaseOrder.setState(state);
        PurchaseOrder purchaseOrderUpdate = purchaseOrderRepository.save(purchaseOrder);
    }



    @Override
    protected GenericRepository<PurchaseOrder> getRepository() {
        return purchaseOrderRepository;
    }
}
