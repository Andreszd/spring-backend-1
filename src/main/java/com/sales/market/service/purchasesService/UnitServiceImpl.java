package com.sales.market.service.purchasesService;

import com.sales.market.model.purchases.Unit;
import com.sales.market.repository.GenericRepository;
import com.sales.market.repository.purchases.UnitRepository;
import com.sales.market.service.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UnitServiceImpl extends GenericServiceImpl<Unit> implements UnitService {
    private final UnitRepository repository;

    public UnitServiceImpl(UnitRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Unit> getRepository() {
        return repository;
    }
}