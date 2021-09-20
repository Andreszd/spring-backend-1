/**
 * @author: Edson A. Terceros T.
 */

package com.sales.market.model;

import com.sales.market.dto.ItemInstanceDto;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(uniqueConstraints = {@UniqueConstraint(name = "UK_ITEMINSTANCE_IDENTIFIER", columnNames = {"identifier"})})
public class ItemInstance extends ModelBase<ItemInstanceDto> {
    @OneToOne
    private Item item;
    private String identifier;// sku

    private Boolean featured = Boolean.FALSE;

    private Double price;

    private LocalDate dueDate;

    private ItemInstanceStatus itemInstanceStatus;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getFeatured() {
        return featured;
    }

    public void setFeatured(Boolean featured) {
        this.featured = featured;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public ItemInstanceStatus getItemInstanceStatus() {
        return itemInstanceStatus;
    }

    public void setItemInstanceStatus(ItemInstanceStatus itemInstanceStatus) {
        this.itemInstanceStatus = itemInstanceStatus;
    }

    /*@Override
    public ModelBase toDomain(ItemInstanceDto element, ModelMapper mapper) {
        super.toDomain(element, mapper);
        setItem((Item) new Item().toDomain(element.getItemDto(), mapper));
        return this;
    }*/
}
