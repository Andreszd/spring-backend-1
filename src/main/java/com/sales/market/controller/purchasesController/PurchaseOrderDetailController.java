package com.sales.market.controller.purchasesController;

import com.sales.market.controller.GenericController;
import com.sales.market.dto.purchasesDto.PurchaseOrderDetailDto;
import com.sales.market.model.purchases.Provider;
import com.sales.market.model.purchases.PurchaseOrderDetail;
import com.sales.market.service.GenericService;
import com.sales.market.service.purchasesService.ProviderItemService;
import com.sales.market.service.purchasesService.PurchaseOrderDetailService;
import com.sales.market.service.purchasesService.PurchaseOrderDetailServiceImpl;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchaseorderdetails")
public class PurchaseOrderDetailController extends GenericController<PurchaseOrderDetail, PurchaseOrderDetailDto> {
    private PurchaseOrderDetailServiceImpl service;

    public PurchaseOrderDetailController(PurchaseOrderDetailServiceImpl service) {
        this.service = service;
    }

    @Override
    protected GenericService getService() {
        return service;
    }

    @GetMapping("/provider-less-total-cost/{idItem}")
    public Provider getBestProvider(@PathVariable("idItem") Long idProvider){
        return service.getBestProvider(idProvider);
    }

}