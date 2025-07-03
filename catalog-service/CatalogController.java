@RestController
@RequestMapping("/products")
public class CatalogController {

    @GetMapping
    public List<Product> listProducts() {
        return List.of(
            new Product(1L, "Notebook", 2500.0),
            new Product(2L, "Mouse", 80.0)
        );
    }
}