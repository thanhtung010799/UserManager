package com.example.service;

import com.example.entity.AddressEntity;

import java.util.List;
import java.util.Optional;

public interface AddressService {
    List<AddressEntity> getAllAddress();

    Optional<AddressEntity> getByUidAddress(Integer id);

    AddressEntity addAddress(AddressEntity address);

    void removeAddress(Integer id);
}
