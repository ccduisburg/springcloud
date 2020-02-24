package com.concon.accoundservice.api;

import com.concon.accoundservice.entity.Account;
import com.concon.accoundservice.service.AccountService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/*
 *localhost:8080/account
 * ayni adreste ayni http methodunu birdefa kullanabiliriz.
 * bunun icin adres özellikle yazmaya gerek yok. Requestmapping teki ortak adres oluyor
 */
@RestController//birtane instance olusturur ve disdünyaya http kullanarak acar
@RequestMapping("account")
public class AccountApi {

    private final AccountService accountService;

    public AccountApi(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Account> get(@PathVariable("id") String id){
        return ResponseEntity.ok(accountService.get(id));
    }
    @PostMapping
    public ResponseEntity<Account> save(@RequestBody Account account){
        return ResponseEntity.ok(accountService.save(account));
    }
    @PutMapping
    public ResponseEntity<Account> update(Account account){
        return ResponseEntity.ok(accountService.update(account));
    }
    @DeleteMapping
    public void delete(String id){
      accountService.delete(id);
    }
//    public ResponseEntity<Account> pagination(Pageable pageable){
//
//    }
}
