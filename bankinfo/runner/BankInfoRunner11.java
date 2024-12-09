package com.xworkz.bankinfo.runner;

import com.xworkz.bankinfo.service.BankInfoService;
import com.xworkz.bankinfo.service.BankInfoServiceImpl;

import javax.persistence.*;

public class BankInfoRunner11 {
    public static void main(String[] args) {

        BankInfoService bankInfoService=new BankInfoServiceImpl();
        bankInfoService.save(entity);

    }
}
