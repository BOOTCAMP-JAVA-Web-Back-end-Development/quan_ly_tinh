package com.thanhdc.repository;


import com.thanhdc.model.Customer;
import com.thanhdc.model.Province;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerRepo extends PagingAndSortingRepository<Customer,Integer> {
    Iterable<Customer> findAllByProvince(Province province);
}
