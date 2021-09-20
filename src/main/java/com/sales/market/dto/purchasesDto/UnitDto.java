package com.sales.market.dto.purchasesDto;

import com.sales.market.dto.DtoBase;
import com.sales.market.model.purchases.Unit;

public class UnitDto extends DtoBase<Unit> {
    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}



