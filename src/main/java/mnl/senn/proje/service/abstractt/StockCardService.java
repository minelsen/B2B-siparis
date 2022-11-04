package mnl.senn.proje.service.abstractt;

import mnl.senn.proje.model.Category;
import mnl.senn.proje.model.StockCard;

import java.util.Set;

public interface StockCardService {

    StockCard save(StockCard stockCardList);

    void delete(StockCard stockCardList);

    Set<StockCard> getList(Category category);

    StockCard getListByStockId(Integer stockId);

    Set<StockCard> getList();

    Set<StockCard> getList(Integer stockCode);

    StockCard getListByStockCode(Integer stockCode);




}
