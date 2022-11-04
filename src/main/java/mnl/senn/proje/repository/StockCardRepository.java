package mnl.senn.proje.repository;

import mnl.senn.proje.model.Category;
import mnl.senn.proje.model.StockCard;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StockCardRepository extends CrudRepository<StockCard,Long> {
    List<StockCard> findByStockIdEquals(Integer stockId);
    List<StockCard> findByCategoryIsLike(Category category);
    List<StockCard> findByStockCodeEquals(Integer stockCode);
}
