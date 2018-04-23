package com.wt.repo;
import org.springframework.data.repository.CrudRepository;

import com.wt.model.Category;



public interface CategoryRepository extends CrudRepository<Category, Long> {

}
