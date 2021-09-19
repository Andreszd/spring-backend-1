package com.sales.market.controller.purchasesController;

import com.sales.market.controller.GenericController;
import com.sales.market.dto.purchasesDto.ActionRequiredDto;
import com.sales.market.model.purchases.ActionRequired;
import com.sales.market.service.GenericService;
import com.sales.market.service.purchasesService.ActionRequiredService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/purchases/action")
public class ActionRequiredController extends GenericController<ActionRequired, ActionRequiredDto> {

    private ActionRequiredService service;

    public ActionRequiredController(ActionRequiredService service){
        this.service=service;
    }

    @Override
    protected GenericService getService() {
        return service;
    }
}
