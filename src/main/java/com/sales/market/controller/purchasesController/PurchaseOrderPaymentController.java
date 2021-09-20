package com.sales.market.controller.purchasesController;

import com.sales.market.controller.GenericController;
import com.sales.market.dto.purchasesDto.PurchaseOrderPaymentDto;
import com.sales.market.model.ItemInstance;
import com.sales.market.model.purchases.PurchaseOrderPayment;
import com.sales.market.service.GenericService;
import com.sales.market.service.purchasesService.PurchaseOrderPaymentService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.*;

@RestController
@RequestMapping("/purchase/payment")
public class PurchaseOrderPaymentController extends GenericController<PurchaseOrderPayment, PurchaseOrderPaymentDto> {

    private PurchaseOrderPaymentService service;

    public PurchaseOrderPaymentController(PurchaseOrderPaymentService service){
        this.service = service;
    }

    /*@GetMapping("/number/{days}")
    public List<ItemInstance> nextProductsToExpire(@PathVariable("days") Integer days){
        //Enumeration<String> e = Collections.enumeration(service.productsToExpire(days)) ;
        Collection<ItemInstance> collection = new ArrayList<>(service.productsToExpire(days));
        return toDto(collection);

    }*/
    /*public List<Item> getBirthday(@PathVariable("idPromotion") Long idPromotion) {
        return promotionService.sendBirthdayMessage(idPromotion);
    }

    @Override
    protected GenericService getService() {
        return null;
    }*/
    @Override
    protected GenericService getService() {
        return service;
    }
}
