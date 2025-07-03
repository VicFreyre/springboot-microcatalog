@RestController
@RequestMapping("/orders")
public class OrderController {

    private final RestTemplate restTemplate;

    public OrderController(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }

    @GetMapping("/simulate")
    public String simulateOrder() {
        String catalogUrl = "http://catalog-service/products";
        ResponseEntity<Product[]> response = restTemplate.getForEntity(catalogUrl, Product[].class);
        Product[] products = response.getBody();

        return "Pedido simulado com os produtos: " + Arrays.toString(products);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }
}
