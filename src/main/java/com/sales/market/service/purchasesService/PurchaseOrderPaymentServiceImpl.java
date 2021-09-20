package com.sales.market.service.purchasesService;

import com.sales.market.model.Item;
import com.sales.market.model.ItemInstance;
import com.sales.market.model.purchases.PurchaseOrderPayment;
import com.sales.market.model.purchases.PurchaseOrderPaymentKind;
import com.sales.market.repository.GenericRepository;
import com.sales.market.repository.purchases.PurchaseOrderPaymentRepository;
import com.sales.market.service.GenericServiceImpl;
import com.sales.market.service.ItemInstanceService;
import org.apache.tomcat.jni.Local;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class PurchaseOrderPaymentServiceImpl extends GenericServiceImpl<PurchaseOrderPayment> implements PurchaseOrderPaymentService{

    private final PurchaseOrderPaymentRepository repository;
    private final ItemInstanceService instanceService;

    public PurchaseOrderPaymentServiceImpl(PurchaseOrderPaymentRepository repository, ItemInstanceService instanceService){
        this.repository = repository;
        this.instanceService = instanceService;

    }

    public void changeState(PurchaseOrderPaymentKind state,Long id){
        PurchaseOrderPayment purchaseOrderPayment = findById(id);
        purchaseOrderPayment.setPurchaseOrderPaymentKind(state);
        PurchaseOrderPayment purchaseOrderPaymentUpdate = getRepository().save(purchaseOrderPayment);
    }

    public List<ItemInstance> productsToExpire(Integer days){

        List res = new ArrayList<ItemInstance>();

        List<ItemInstance> ItemInstances = instanceService.findAll();
        for (ItemInstance instance: ItemInstances) {
            LocalDate date = instance.getDueDate();
            if(expiresWithin(date,days.intValue())){
                res.add(instance);
            }
        }

        return  ItemInstances;
    }
    private boolean expiresWithin(LocalDate dueDate, int numberDays){
        boolean result = false;
        LocalDate current = LocalDate.now();
        int date = current.getDayOfMonth()+numberDays;
        if(date <= 31){
            if(dueDate.getDayOfMonth()<=date){
                result  = true;
            }
        }

        return result;
    }

    @Override
    protected GenericRepository<PurchaseOrderPayment> getRepository() {
        return repository;
    }
}
