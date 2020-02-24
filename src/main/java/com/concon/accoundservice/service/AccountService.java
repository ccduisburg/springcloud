package com.concon.accoundservice.service;

import com.concon.accoundservice.entity.Account;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


//@Component birlesenlere kullanima aciyor
//@Repository birlesenlere kullanima aciyor
@Service
public class AccountService {
    public Account get(String id){
    return new Account("test-id");
    }
    public Account save(Account account){
        return new Account("test-id");
    }
    public Account update(Account account){
        return new Account("test-id");
    }
    public void delete(String id){

    }


}
