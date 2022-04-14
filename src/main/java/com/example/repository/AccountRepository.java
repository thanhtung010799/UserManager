package com.example.repository;


import com.example.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<AccountEntity, Integer> {

    @Query(value = "from AccountEntity acc inner join AddressEntity a on acc.idcity = a.id")
    List<AccountEntity> findAllAcc();

}