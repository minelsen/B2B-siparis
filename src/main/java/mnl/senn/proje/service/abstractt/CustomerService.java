package mnl.senn.proje.service.abstractt;

import mnl.senn.proje.model.Customer;

import java.util.Set;

public interface CustomerService {
    Customer save (Customer customerList);

    void delete(Customer customerList);

    Set<Customer> getList();

    Customer getList(Long id);

    Customer login(String email,String password);
}


