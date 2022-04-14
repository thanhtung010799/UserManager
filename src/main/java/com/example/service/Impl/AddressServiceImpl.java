package com.example.service.Impl;


import com.example.entity.AddressEntity;
import com.example.repository.AddressRepository;
import com.example.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public List<AddressEntity> getAllAddress() {
        List<AddressEntity> lsAdress = addressRepository.findAll();
        return lsAdress;
    }

    @Override
    public Optional<AddressEntity> getByUidAddress(Integer id) {
        Optional<AddressEntity> addressID = addressRepository.findById(id);
        return addressID;
    }

    @Override
    public AddressEntity addAddress(AddressEntity address) {
        AddressEntity addressN = addressRepository.save(address);
        return addressN;
    }

    @Override
    public void removeAddress(Integer id) {
        addressRepository.deleteById(id);
    }
}
