package com.example.service.Impl;

import com.example.config.IdLog;
import com.example.entity.AccountEntity;
import com.example.repository.AccountRepository;
import com.example.service.AccountService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {

    private static final Logger logger = Logger.getLogger(AccountServiceImpl.class);
    @Autowired
    private AccountRepository accountRepository;

    @Override
    public List<AccountEntity> getAllAccount() {
        List<AccountEntity> lsAccount = accountRepository.findAll();
        return lsAccount;
    }

    @Override
    public Optional<AccountEntity> getByUidAccount(Integer id) {
        return accountRepository.findById(id);
    }


    @Override
    public AccountEntity addAccount(AccountEntity acc) {
        if (acc.getUsername() == null) {
            logger.error(String.format("transId: % name is null",
                    IdLog.TRANS_ID));
        }
        AccountEntity usersN = accountRepository.save(acc);
        return usersN;
    }

    @Override
    public void removeAccount(Integer id) {
        accountRepository.deleteById(id);
    }

}
