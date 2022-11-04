package mnl.senn.proje.service.concrete;

import mnl.senn.proje.model.Category;
import mnl.senn.proje.model.Customer;
import mnl.senn.proje.model.Sale;
import mnl.senn.proje.model.StockCard;
import mnl.senn.proje.repository.SaleRepository;
import mnl.senn.proje.service.abstractt.SaleService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class SaleServiceImpl implements SaleService {

    private final SaleRepository saleRepository;

    public SaleServiceImpl(SaleRepository saleRepository) {
        this.saleRepository = saleRepository;
    }

    @Override
    public Sale save(Sale saleList) {
        return saleRepository.save(saleList);
    }

    @Override
    public void delete(Sale SaleList) {
        saleRepository.delete(SaleList);

    }

    @Override
    public Set<Sale> getList(Category category) {
        Set<Sale>
                setSale = new HashSet<>();
        saleRepository.findByCategoryIsLike(category).iterator().forEachRemaining(setSale :: add);
        return setSale;
    }

    @Override
    public Set<Sale> getList(StockCard stockCard) {
        Set<Sale>
                setSale = new HashSet<>();
        saleRepository.findByStockCardIsLike(stockCard).iterator().forEachRemaining(setSale :: add);
        return setSale;
    }

    @Override
    public Set<Sale> getList() {
        Set<Sale>
                setSale = new HashSet<>();
        saleRepository.findAll().iterator().forEachRemaining(setSale :: add);
        return setSale;
    }

    @Override
    public Set<Sale> getList(Customer customer) {
        Set<Sale>
                setSale = new HashSet<>();
        saleRepository.findByCustomerIsLike(customer).iterator().forEachRemaining(setSale :: add);
        return setSale;
    }
}
