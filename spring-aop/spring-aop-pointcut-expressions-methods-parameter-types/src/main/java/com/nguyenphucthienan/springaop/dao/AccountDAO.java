package com.nguyenphucthienan.springaop.dao;

import com.nguyenphucthienan.springaop.model.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
    public void addAccount(Account account, boolean isVip) {
        System.out.println(getClass() + ": Doing my database work: Adding an account");
    }

    public boolean removeAccount() {
        System.out.println(getClass() + ": Doing my database work: Removing an account");
        return true;
    }
}
