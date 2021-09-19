package com.sales.market.controller.purchasesController;

import com.sales.market.controller.GenericController;
import com.sales.market.dto.purchasesDto.PurchaseOrderDto;
import com.sales.market.model.purchases.PurchaseOrder;
import com.sales.market.service.GenericService;
import com.sales.market.service.purchasesService.PurchaseOrderService;
import com.sales.market.service.purchasesService.PurchaseOrderServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/purchases/order")
public class PurchaseOrderController extends GenericController<PurchaseOrder, PurchaseOrderDto> {
    private PurchaseOrderService service;

    public PurchaseOrderController(PurchaseOrderService service){
        this.service = service;
    }

    /*@GetMapping()
    public List<PurchaseOrder> purchaseOrders(){
        return service.findAll();
    }*/

    @Override
    protected GenericService getService() {
        return service;
    }


}
