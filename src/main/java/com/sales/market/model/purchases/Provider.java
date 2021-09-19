package com.sales.market.model.purchases;

import com.sales.market.dto.purchasesDto.ProviderDto;
import com.sales.market.model.ModelBase;

import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Provider extends ModelBase<ProviderDto>{
    @Column(unique = true)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}