package com.iqmsoft.service;

import org.springframework.stereotype.Service;

import com.iqmsoft.dto.TrucDto;

import java.util.List;

public interface StoreService {

    List<TrucDto> getListItems();

}
