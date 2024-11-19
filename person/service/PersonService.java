package com.xworkz.jdbc.person.service;

import com.xworkz.jdbc.person.dto.PersonDto;

public interface PersonService {
    boolean save(PersonDto dto);
    boolean getListOfDataById(String data);
    boolean getNameAndEmailById(String name,String email);
    boolean ifEmailAndPasswordSameByData(PersonDto dto);
}
