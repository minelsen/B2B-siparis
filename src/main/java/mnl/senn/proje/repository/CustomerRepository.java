package mnl.senn.proje.repository;

import mnl.senn.proje.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer,Long> {
    List<Customer> findByCustomerIdEquals(Long customerId);
    List<Customer> findByEmailAndPassword(String email, String password);


}
