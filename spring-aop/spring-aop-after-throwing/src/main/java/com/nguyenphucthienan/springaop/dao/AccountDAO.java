package com.nguyenphucthienan.springaop.dao;

import com.nguyenphucthienan.springaop.model.Account;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountDAO {
    public List<Account> findAccounts(boolean thrownException) {
        if (thrownException) {
            throw new RuntimeException("Exception");
        }

        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account("John", "Silver"));
        accounts.add(new Account("Jane", "Silver"));
        accounts.add(new Account("Josh", "Platinum"));
        return accounts;
    }
}
