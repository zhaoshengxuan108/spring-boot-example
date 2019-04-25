package com.egbert.elasticsearch.service;

import com.egbert.elasticsearch.model.Customer;

import java.util.List;

public interface CustomersInterface {

    public List<Customer> searchCity(Integer pageNumber, Integer pageSize, String searchContent);


}
