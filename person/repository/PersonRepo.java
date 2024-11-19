package com.xworkz.jdbc.person.repository;

import com.xworkz.jdbc.person.dto.PersonDto;

public interface PersonRepo {

    boolean save(PersonDto dto);
    boolean getListOfDataById(String data);
    boolean getNameAndEmailById(String name,String email);
    boolean ifEmailAndPasswordSameByData(PersonDto dto);
}
