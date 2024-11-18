package com.xworkz.jdbc.repository;

import com.xworkz.jdbc.dto.BusTicketDto;

public interface BusTicketRepo {
    boolean save(BusTicketDto dto);
}
