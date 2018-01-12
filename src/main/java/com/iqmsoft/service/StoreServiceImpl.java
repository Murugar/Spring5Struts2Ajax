package com.iqmsoft.service;

import org.springframework.stereotype.Service;

import com.iqmsoft.dto.TrucDto;

import java.util.ArrayList;
import java.util.List;

@Service
public class StoreServiceImpl
        implements StoreService {

    private static List<TrucDto> trucDtos;

    static {
        trucDtos = new ArrayList<>();
        trucDtos.add(new TrucDto(1, "Test1", "test1@test1.com"));
        trucDtos.add(new TrucDto(2, "Test2", "test2@test2.com"));
        trucDtos.add(new TrucDto(3, "Test3", "test3@test3.com"));
        trucDtos.add(new TrucDto(4, "Test4", "test4@test4.com"));
        trucDtos.add(new TrucDto(5, "Test5", "test5@test5.com"));
    }

    @Override
    public List<TrucDto> getListItems() {
        return trucDtos;
    }

}
