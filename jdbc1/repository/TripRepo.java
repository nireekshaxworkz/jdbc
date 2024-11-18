package com.xworkz.jdbc1.repository;

import com.xworkz.jdbc1.dto.TripDto;

public interface TripRepo {
    boolean save(TripDto dto);
}
