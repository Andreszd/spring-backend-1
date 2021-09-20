package com.sales.market.service.purchasesService;

import com.sales.market.model.purchases.Provider;
import com.sales.market.repository.purchases.PurchaseOrderDetailRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PurchaseOrderDetailServiceImplTest {

    @Autowired
    PurchaseOrderDetailServiceImpl purchaseOrderDetailService;

    @Test
    public void givenAIdItemWhenExecuteAlgThenSucess(){
        Provider provider = purchaseOrderDetailService.getBestProvider(1L);
        System.out.println(provider);
        assertEquals("Pepsi", provider.getName());
    }
}