package com.nguyenphucthienan.springaop.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
    public void addAccount() {
        System.out.println(getClass() + ": Doing my database work: Adding an account");
    }
}
