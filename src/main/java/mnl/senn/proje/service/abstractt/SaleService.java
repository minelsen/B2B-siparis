package mnl.senn.proje.service.abstractt;

import mnl.senn.proje.model.Category;
import mnl.senn.proje.model.Customer;
import mnl.senn.proje.model.Sale;
import mnl.senn.proje.model.StockCard;
import mnl.senn.proje.repository.SaleRepository;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface SaleService {

    Sale save(Sale saleList);

    void delete(Sale SaleList);

    Set<Sale> getList(Category category);

    Set<Sale> getList(StockCard stockCard);

    Set<Sale> getList();

    Set<Sale> getList(Customer customer);

}
