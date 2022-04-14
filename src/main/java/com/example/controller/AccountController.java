package com.example.controller;

import com.example.entity.AccountEntity;
import com.example.entity.model.Account;
import com.example.service.AccountService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private AccountService accountService;


    @GetMapping("/getAll")
    public List<Account> getAllUsers() {
//        List<AccountEntity> lsUsers = accountService.getAllAccount();
        return accountService.getAllAccount()
                .stream()
                .map(acc -> modelMapper.map(acc, Account.class))
                .collect(Collectors.toList());
    }

    @GetMapping("/getUID/{id}")
    public ResponseEntity<Account> getUidUser(@PathVariable("id") Integer id) {
        Optional<AccountEntity> getID = accountService.getByUidAccount(id);
        Account accResp = modelMapper.map(getID, Account.class);
        return ResponseEntity.ok().body(accResp);
    }

    @PostMapping("/add")
    public ResponseEntity<Account> addUsers(@RequestBody AccountEntity acc) {
        AccountEntity acc1 = modelMapper.map(acc, AccountEntity.class);
        AccountEntity post = accountService.addAccount(acc1);
        Account accResponse = modelMapper.map(post, Account.class);
        return new ResponseEntity<Account>(accResponse, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUsers(@PathVariable("id") Integer id) {
        accountService.removeAccount(id);
    }
}
