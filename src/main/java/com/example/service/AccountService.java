package com.example.service;

import com.example.entity.AccountEntity;

import java.util.List;
import java.util.Optional;

public interface AccountService {

    List<AccountEntity> getAllAccount();

    Optional<AccountEntity> getByUidAccount(Integer id);

    AccountEntity addAccount(AccountEntity Account);

    void removeAccount(Integer id);

    //login ...
}
