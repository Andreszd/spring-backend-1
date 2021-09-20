/**
 * @author: Edson A. Terceros T.
 */

package com.sales.market.repository;


import com.sales.market.model.ItemInstance;

import java.time.LocalDate;
import java.util.List;

public interface ItemInstanceRepository extends GenericRepository<ItemInstance> {

    List<ItemInstance> findByDueDateBetween(LocalDate start, LocalDate end);
}
