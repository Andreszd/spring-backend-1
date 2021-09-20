package com.sales.market.controller.purchasesController;

import com.sales.market.controller.GenericController;
import com.sales.market.dto.purchasesDto.ProviderItemDto;
import com.sales.market.model.purchases.ProviderItem;
import com.sales.market.service.GenericService;
import com.sales.market.service.purchasesService.ProviderItemService;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/provideritems")
public class ProviderItemController extends GenericController<ProviderItem, ProviderItemDto> {
    private ProviderItemService service;

    public ProviderItemController(ProviderItemService service) {
        this.service = service;
    }

    @Override
    protected GenericService getService() {
        return service;
    }
}