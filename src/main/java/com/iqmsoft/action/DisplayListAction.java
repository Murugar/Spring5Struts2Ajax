package com.iqmsoft.action;

import com.iqmsoft.dto.TrucDto;
import com.iqmsoft.service.StoreService;
import com.opensymphony.xwork2.ActionSupport;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DisplayListAction
        extends ActionSupport {

    @Autowired
    private StoreService storeService;

    private List<TrucDto> listItems;

    public List<TrucDto> getListItems() {
        return listItems;
    }

    @Override
    public String execute() throws Exception {
        listItems = storeService.getListItems();

        return SUCCESS;
    }

}

