package gift.Controller;

import gift.DTO.CategoryDto;
import gift.Service.CategoryService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/categories")
public class CategoryController {
  private final CategoryService categoryService;

  public CategoryController(CategoryService categoryService){
    this.categoryService=categoryService;
  }

  @GetMapping
  public ResponseEntity<List<CategoryDto>> getAllCategories(){
    List<CategoryDto> categoryDtos = categoryService.getAllCategories();
    return ResponseEntity.ok(categoryDtos);
  }
}
