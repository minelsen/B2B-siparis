package mnl.senn.proje.repository;

import mnl.senn.proje.model.Category;
import mnl.senn.proje.model.Customer;
import mnl.senn.proje.model.Sale;
import mnl.senn.proje.model.StockCard;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SaleRepository extends CrudRepository<Sale,Long> {
    List<Sale> findByStockCardIsLike(StockCard stockCard);
    List<Sale> findByCustomerIsLike(Customer customer);
    List<Sale> findByCategoryIsLike(Category category);
}
