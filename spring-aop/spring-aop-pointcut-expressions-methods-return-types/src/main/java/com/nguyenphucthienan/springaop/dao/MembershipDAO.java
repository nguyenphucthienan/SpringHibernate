package com.nguyenphucthienan.springaop.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
    public boolean addAccount() {
        System.out.println(getClass() + ": Doing my database work: Adding a membership account");
        return true;
    }
}
