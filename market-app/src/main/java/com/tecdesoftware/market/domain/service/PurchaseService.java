package com.tecdesoftware.market.domain.service;

import com.tecdesoftware.market.domain.Purchase;
import com.tecdesoftware.market.domain.repository.PurchaseRepository;
import com.tecdesoftware.market.persistence.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;



//Quien decide si es posible
@Service
public class PurchaseService {

    @Autowired
    private PurchaseRepository purchaseRepository;
    @Autowired
    private ProductoRepository productoRepository;

    public List<Purchase> getAll(){
        return purchaseRepository.getAll();
    }
    public Optional<List<Purchase>> getByClient(String clientId){
        return purchaseRepository.getByClient(clientId);
    }
    public Purchase save(Purchase purchase){
        return purchaseRepository.save(purchase);
    }

}
