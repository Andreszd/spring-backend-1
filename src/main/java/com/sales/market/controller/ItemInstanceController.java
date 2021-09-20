/**
 * @author: Edson A. Terceros T.
 */

package com.sales.market.controller;

import com.sales.market.dto.ItemInstanceDto;
import com.sales.market.model.ItemInstance;
import com.sales.market.service.ItemInstanceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/item/instances")
public class ItemInstanceController extends GenericController<ItemInstance, ItemInstanceDto> {
    private ItemInstanceService service;

    public ItemInstanceController(ItemInstanceService service) {
        this.service = service;
    }

    @GetMapping("/number/{days}")
    public List<ItemInstanceDto> nextProductsToExpire(@PathVariable("days") Integer days){
        return toDto(getService().productsToExpire(days));
    }
    @Override
    protected ItemInstanceService getService() {
        return service;
    }
}
