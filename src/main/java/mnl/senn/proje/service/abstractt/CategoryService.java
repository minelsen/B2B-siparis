package mnl.senn.proje.service.abstractt;

import mnl.senn.proje.model.Category;

import java.util.Set;


public interface CategoryService {

    Category save (Category CategoryList);

    void delete(Category CategoryList);

    Set<Category> getList(String name);

    Set<Category> getList(Long id);

    Set<Category> getList();
}



