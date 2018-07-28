package com.nguyenphucthienan.springaop.dao;

import com.nguyenphucthienan.springaop.model.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
    private String name;
    private String email;

    public void addAccount(Account account, boolean isVip) {
        System.out.println(getClass() + ": Doing my database work: Adding an account");
    }

    public boolean removeAccount() {
        System.out.println(getClass() + ": Doing my database work: Removing an account");
        return true;
    }

    public String getName() {
        System.out.println(getClass() + ": in getName()");
        return name;
    }

    public void setName(String name) {
        System.out.println(getClass() + ": in setName()");
        this.name = name;
    }

    public String getEmail() {
        System.out.println(getClass() + ": in getEmail()");
        return email;
    }

    public void setEmail(String email) {
        System.out.println(getClass() + ": in setEmail()");
        this.email = email;
    }
}
