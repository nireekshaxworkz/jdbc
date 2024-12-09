package com.xworkz.bankinfo.service;

import com.xworkz.bankinfo.entity.BankInfoEntity;
import com.xworkz.bankinfo.repository.BankInfoRepo;
import com.xworkz.bankinfo.repository.BankInfoRepoImpl;

public class BankInfoServiceImpl implements BankInfoService{
    @Override
    public boolean save(BankInfoEntity entity) {
        System.out.println("running BankInfoServiceImpl");
        return true;
        BankInfoRepo bankInfoRepo=new BankInfoRepoImpl();
        bankInfoRepo.save("entity")
    }
}
