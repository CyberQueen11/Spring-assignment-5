package com.yrgo.services.customers;

import com.yrgo.dataaccess.CustomerDao;
import com.yrgo.domain.Call;
import com.yrgo.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component("customerService")
@Transactional(rollbackFor = {CustomerNotFoundException.class})
public class CustomerManagementServiceProductionImpl implements CustomerManagementService {

    @Autowired
    private CustomerDao dao;

    @Override
    public void newCustomer(Customer newCustomer) {

    }

    @Override
    public void updateCustomer(Customer changedCustomer) {

    }

    @Override
    public void deleteCustomer(Customer oldCustomer) {
    }

    @Override
    public Customer findCustomerById(String customerId) throws CustomerNotFoundException {
        return null;
    }

    @Override
    public List<Customer> findCustomersByName(String name) {
        return null;
    }

    @Override
    public List<Customer> getAllCustomers() {
        return null;
    }

    @Override
    public Customer getFullCustomerDetail(String customerId) throws CustomerNotFoundException {
        return null;
    }

    @Override
    public void recordCall(String customerId, Call callDetails) throws CustomerNotFoundException {

    }
}
