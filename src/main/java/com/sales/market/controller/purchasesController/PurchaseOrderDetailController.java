package com.sales.market.controller.purchasesController;

import com.sales.market.controller.GenericController;
import com.sales.market.dto.purchasesDto.PurchaseOrderDetailDto;
import com.sales.market.model.purchases.PurchaseOrderDetail;
import com.sales.market.service.GenericService;
import com.sales.market.service.purchasesService.ProviderItemService;
import com.sales.market.service.purchasesService.PurchaseOrderDetailService;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/purchaseorderdetails")
public class PurchaseOrderDetailController extends GenericController<PurchaseOrderDetail, PurchaseOrderDetailDto> {
    private PurchaseOrderDetailService service;

    public PurchaseOrderDetailController(PurchaseOrderDetailService service) {
        this.service = service;
    }

    @Override
    protected GenericService getService() {
        return service;
    }

}