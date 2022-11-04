package mnl.senn.proje.repository;

import mnl.senn.proje.model.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CategoryRepository  extends CrudRepository<Category,Long> {
    List<Category> findByCategoryIdContaining(Long categoryId);
   List<Category> findByCategoryNameContaining(String categoryName);

}
