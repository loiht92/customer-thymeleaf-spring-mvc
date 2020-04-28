package com.codegym.service;

import com.codegym.model.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> findAll(); //Lay ra danh sach khach hang

    Customer findById(int id); //Tim khach hang theo id

    void save(Customer customer); //Them moi khach hang

    void update( int id, Customer customer); //Cap nhat danh sach theo id

    void delete(int id); //Xoa khach hang theo id
}
