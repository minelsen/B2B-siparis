package mnl.senn.proje.service.concrete;

import mnl.senn.proje.model.Category;
import mnl.senn.proje.model.StockCard;
import mnl.senn.proje.repository.StockCardRepository;
import mnl.senn.proje.service.abstractt.StockCardService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

@Service
public class StockCardServiceImpl implements StockCardService {

    private final StockCardRepository stockCardRepository;

    public StockCardServiceImpl(StockCardRepository stockCardRepository) {
        this.stockCardRepository = stockCardRepository;
    }

    @Override
    public StockCard save(StockCard stockCardList) {
        return stockCardRepository.save(stockCardList);
    }

    @Override
    public void delete(StockCard stockCardList) {
        stockCardRepository.delete(stockCardList);
    }

    @Override
    public Set<StockCard> getList(Category category) {

        Set<StockCard>
                setStockCard = new HashSet<>();
        stockCardRepository.findByCategoryIsLike(category).iterator().forEachRemaining(setStockCard::add);
        return setStockCard;
    }


    @Override
    public Set<StockCard> getList(Integer stockCode) {
        Set<StockCard>
                setStockCard = new HashSet<>();
        stockCardRepository.findByStockIdEquals(stockCode).iterator().forEachRemaining(setStockCard::add);
        return setStockCard;
    }

    @Override
    public StockCard getListByStockCode(Integer stockCode) {
        List<StockCard>
                stockCard = stockCardRepository.findByStockIdEquals(stockCode);
        return stockCard.get(0);
    }


    @Override
    public StockCard getListByStockId(Integer stockId) {
        List<StockCard>
                stockCard = stockCardRepository.findByStockIdEquals(stockId);
        return stockCard.get(0);
    }

    @Override
    public Set<StockCard> getList() {
        Set<StockCard>
                stockCardSet = new HashSet<>();
        stockCardRepository.findAll().iterator().forEachRemaining((Consumer<? super StockCard>) stockCardSet);
        return stockCardSet;
    }

}
