package com.thanhdc.services;

import com.thanhdc.model.Province;
import lanaDrahrepus.model.Province;

public interface ProvinceService {
    Iterable<Province> findAll();

    Province findById(Integer id);

    void save(Province province);

    void remove(Integer id);
}
