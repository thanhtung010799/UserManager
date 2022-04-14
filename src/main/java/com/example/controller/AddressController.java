package com.example.controller;

import com.example.entity.AddressEntity;
import com.example.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping("/getAll")
    public List<AddressEntity> getAllAddress() {
        List<AddressEntity> lsAddre = addressService.getAllAddress();
        return lsAddre;
    }

    @GetMapping("/getbyid/{id}")
    public Optional<AddressEntity> getByUidAddressEntity(@PathVariable("id") Integer id) {
        Optional<AddressEntity> userId = addressService.getByUidAddress(id);
        return userId;
    }

    @PostMapping("/add")
    public AddressEntity addAddressEntity(@RequestBody AddressEntity address) {
        AddressEntity addressN = addressService.addAddress(address);
        return addressN;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAddressEntity(@PathVariable("id") Integer id) {
        addressService.removeAddress(id);
    }
}
