package com.sales.market.dto.purchasesDto;

import com.sales.market.dto.DtoBase;
import com.sales.market.model.Item;
import com.sales.market.model.purchases.Provider;
import com.sales.market.model.purchases.ProviderItem;
import com.sales.market.model.purchases.Unit;

import java.math.BigDecimal;

public class ProviderItemDto extends DtoBase<ProviderItem> {
    private Provider provider;
    private Item item;
    private Unit unit;
    private BigDecimal itemPrice;

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }
}



