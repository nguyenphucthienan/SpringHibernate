package com.nguyenphucthienan.springaop;

import com.nguyenphucthienan.springaop.config.JavaConfig;
import com.nguyenphucthienan.springaop.dao.AccountDAO;
import com.nguyenphucthienan.springaop.dao.MembershipDAO;
import com.nguyenphucthienan.springaop.model.Account;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
        MembershipDAO membershipDAO = context.getBean("membershipDAO", MembershipDAO.class);

        accountDAO.addAccount(new Account(), true);
        accountDAO.removeAccount();

        membershipDAO.addAccount();
        membershipDAO.removeAccount();

        context.close();
    }
}
