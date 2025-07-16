package com.tecdesoftware.market.persistence;

import com.tecdesoftware.market.domain.Purchase;
import com.tecdesoftware.market.domain.repository.PurchaseRepository;
import com.tecdesoftware.market.persistence.crud.CompraCrudRepository;
import com.tecdesoftware.market.persistence.entity.Compra;
import com.tecdesoftware.market.persistence.mapper.PurchasesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

// En el paquete: com.tecdesoftware.market.persistence
@Repository
public class PurchaseRepositoryImpl implements PurchaseRepository {

    @Autowired
    private CompraCrudRepository compraCrudRepository;

    @Autowired
    private PurchasesMapper mapper; // Encargado de convertir entre Entity y Domain

    @Override
    public List<Purchase> getAll() {
        return mapper.toPurchases((List<Compra>) compraCrudRepository.findAll());
    }

    @Override
    public Optional<List<Purchase>> getByClient(String clientId) {
        return compraCrudRepository.findByIdCliente(clientId)
                .map(mapper::toPurchases);
    }

    @Override
    public Purchase save(Purchase purchase) {
        Compra compra = mapper.toCompra(purchase);
        return mapper.toPurchase(compraCrudRepository.save(compra));
    }
}

