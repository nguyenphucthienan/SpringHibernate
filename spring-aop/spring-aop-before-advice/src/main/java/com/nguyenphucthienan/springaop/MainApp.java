package com.nguyenphucthienan.springaop;

import com.nguyenphucthienan.springaop.config.JavaConfig;
import com.nguyenphucthienan.springaop.dao.AccountDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);

        accountDAO.addAccount();

        context.close();
    }
}
