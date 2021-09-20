package com.sales.market.controller.purchasesController;

import com.sales.market.controller.GenericController;
import com.sales.market.dto.purchasesDto.ProviderDto;
import com.sales.market.model.purchases.Provider;
import com.sales.market.service.GenericService;
import com.sales.market.service.purchasesService.ProviderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/providers")
public class ProviderController extends GenericController<Provider, ProviderDto> {
    private ProviderService service;

    public ProviderController(ProviderService service) {
        this.service = service;
    }

    @Override
    protected GenericService getService() {
        return service;
    }
}