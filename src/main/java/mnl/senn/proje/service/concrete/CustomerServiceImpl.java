package mnl.senn.proje.service.concrete;

import mnl.senn.proje.model.Customer;
import mnl.senn.proje.repository.CustomerRepository;
import mnl.senn.proje.service.abstractt.CustomerService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer save(Customer customerList) {
        return customerRepository.save(customerList);
    }

    @Override
    public void delete(Customer customerList) {
        customerRepository.delete(customerList);
    }

    @Override
    public Set<Customer> getList() {
        Set<Customer>
                setCustomer= new HashSet<>();
        customerRepository.findAll().iterator().forEachRemaining(setCustomer :: add);
        return setCustomer;
    }

    @Override
    public Customer getList(Long id) {
        List<Customer>
                customer = customerRepository.findByCustomerIdEquals(id);
        return customer.get(0);
    }

    @Override
    public Customer login(String email, String password) {
            List<Customer>
                   login =  customerRepository.findByEmailAndPassword(email,password);
            if (login.size()==0)
            {
                return new Customer();
            }
            return login.get(0);
    }
}
