package mnl.senn.proje.service.concrete;

import mnl.senn.proje.model.Category;
import mnl.senn.proje.repository.CategoryRepository;
import mnl.senn.proje.service.abstractt.CategoryService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Category save(Category CategoryList) {
        return categoryRepository.save(CategoryList);
    }

    @Override
    public void delete(Category categoryList) {
        categoryRepository.delete(categoryList);
    }

    @Override
    public Set<Category> getList(String name) {
        Set<Category> SetCategory = new HashSet<>();
        categoryRepository.findByCategoryNameContaining(name).iterator().forEachRemaining(SetCategory ::add);
    return SetCategory;
    }

    @Override
    public Set<Category> getList(Long id) {
        Set<Category>
                SetCategory = new HashSet<>();
        categoryRepository.findByCategoryIdContaining(id).iterator().forEachRemaining(SetCategory ::add);
        return SetCategory;
    }


    @Override
    public Set<Category> getList(){

        Set<Category>
                SetCategory = new HashSet<>();
        categoryRepository.findAll().iterator().forEachRemaining(SetCategory :: add);
        return SetCategory;
    }
}
