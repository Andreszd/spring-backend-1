/**
 * @author: Edson A. Terceros T.
 */

package com.sales.market.service;

import com.sales.market.model.ItemInstance;
import com.sales.market.repository.GenericRepository;
import com.sales.market.repository.ItemInstanceRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class ItemInstanceServiceImpl extends GenericServiceImpl<ItemInstance> implements ItemInstanceService {
    private final ItemInstanceRepository repository;
    private final ItemService itemService;

    public ItemInstanceServiceImpl(ItemInstanceRepository repository, ItemService itemService) {
        this.repository = repository;
        this.itemService = itemService;
    }

    @Override
    protected GenericRepository<ItemInstance> getRepository() {
        return repository;
    }

    public List<ItemInstance> findByDueDateBetween(LocalDate start , LocalDate end){
        return repository.findByDueDateBetween(start, end);
    }
    public List<ItemInstance> productsToExpire(Integer days){

        List res = new ArrayList<ItemInstance>();

        List<ItemInstance> ItemInstances = findAll();
        for (ItemInstance instance: ItemInstances) {
            LocalDate date = instance.getDueDate();
            if(expiresWithin(date,days.intValue())){
                res.add(instance);
            }
        }

        return  res;
    }
    private boolean expiresWithin(LocalDate dueDate, int numberDays){
        boolean result = false;
        LocalDate current = LocalDate.now();
        int date = current.getDayOfMonth()+numberDays;

        if(current.getMonthValue() == dueDate.getMonthValue()){
            if(date <= 31){
                if(dueDate.getDayOfMonth()<=date){
                    result  = true;
                }
            }
        }

        return result;
    }
    @Override
    public ItemInstance bunchSave(ItemInstance itemInstance) {
        // here make all objects save other than this resource
        if (itemInstance.getItem() != null) {
            // todo habria que distinguir si permitiremos guardar y  actualizar o ambos mitando el campo id
            itemService.save(itemInstance.getItem());
        }
        return super.bunchSave(itemInstance);
    }
}
