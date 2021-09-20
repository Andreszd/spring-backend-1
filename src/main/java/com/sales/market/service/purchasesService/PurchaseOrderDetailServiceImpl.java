package com.sales.market.service.purchasesService;

import com.sales.market.model.purchases.Provider;
import com.sales.market.model.purchases.ProviderItem;
import com.sales.market.model.purchases.PurchaseOrderDetail;
import com.sales.market.repository.GenericRepository;
import com.sales.market.repository.purchases.PurchaseOrderDetailRepository;
import com.sales.market.service.GenericServiceImpl;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

@Service
public class PurchaseOrderDetailServiceImpl extends GenericServiceImpl<PurchaseOrderDetail> implements PurchaseOrderDetailService {
    private final PurchaseOrderDetailRepository repository;
    private final ProviderItemServiceImpl providerItemService;

    public PurchaseOrderDetailServiceImpl(PurchaseOrderDetailRepository repository, ProviderItemServiceImpl providerItemService) {
        this.repository = repository;
        this.providerItemService = providerItemService;
    }

    @Override
    protected GenericRepository<PurchaseOrderDetail> getRepository() {
        return repository;
    }

    public Provider getBestProvider(Long idItem){
        List<ProviderItem> providerItems = providerItemService.findAll();

        if (providerItems.size() == 0){
            return null;
        }

        List<ProviderItem> res = new LinkedList<>();

        for (ProviderItem provider :providerItems) {
            if (provider.getItem().getId().equals(idItem)){
               res.add(provider);
            }
        }

        ProviderItem providerWithLessCost = res.get(0);

        for (ProviderItem providerItem : res){
            if (providerItem.getItemPrice().compareTo(providerWithLessCost .getItemPrice()) < 0){
               providerWithLessCost  = providerItem;
            }
        }
        return providerWithLessCost.getProvider();
    }
}