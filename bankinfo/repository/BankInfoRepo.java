package com.xworkz.bankinfo.repository;

import com.xworkz.bankinfo.entity.BankInfoEntity;

public interface BankInfoRepo {
    boolean save(BankInfoEntity entity);
}
