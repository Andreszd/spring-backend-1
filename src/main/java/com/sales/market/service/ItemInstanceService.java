/**
 * @author: Edson A. Terceros T.
 */

package com.sales.market.service;

import com.sales.market.model.ItemInstance;

import java.time.LocalDate;
import java.util.List;

public interface ItemInstanceService extends GenericService<ItemInstance> {
    List<ItemInstance> findByDueDateBetween(LocalDate start , LocalDate end);
    List<ItemInstance> productsToExpire(Integer days);
}
