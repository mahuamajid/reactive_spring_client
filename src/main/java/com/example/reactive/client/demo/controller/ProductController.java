package com.example.reactive.client.demo.controller;

import com.example.reactive.client.demo.model.Product;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import java.time.Duration;

@RestController
@RequestMapping("flux")
public class ProductController {

    @GetMapping("/products")
    public Flux<Product> getProducts() {
        WebClient client3 = createWebClient();
        return client3
                .get()
                .uri("/v3/products/")
                .retrieve()
                .bodyToFlux(Product.class);
    }

    @GetMapping(value = "/products/stream", produces = {MediaType.TEXT_EVENT_STREAM_VALUE})
    public Flux<Product> getProductsAsStream() {
        WebClient client3 = createWebClient();
        Flux<Product> products = client3
                .get()
                .uri("/v3/products/")
                .retrieve()
                .bodyToFlux(Product.class)
                .delayElements(Duration.ofMillis(5))
                .repeat();
        products.subscribe(product -> System.out.println(product.getName()));
        return products;
    }

    @GetMapping("/products/{id}")
    public Flux<Product> getProduct(@PathVariable("id") String id) {
        WebClient client3 = createWebClient();
        return client3
                .get()
                .uri("/v3/products/" + id)
                .retrieve()
                .bodyToFlux(Product.class);

    }

    @PostMapping(value = "/products")
    public Flux<Product> save(@RequestBody Product product) {
        WebClient client3 = createWebClient();
        return client3
                .post()
                .uri("/v3/products")
                .body(BodyInserters.fromObject(product))
                .retrieve()
                .bodyToFlux(Product.class);
    }

    @PutMapping("/products")
    public Flux<Product> update(@RequestBody Product product) {
        WebClient client3 = createWebClient();
        return client3
                .put()
                .uri("/v3/products")
                .body(BodyInserters.fromObject(product))
                .retrieve()
                .bodyToFlux(Product.class);
    }

    @DeleteMapping("/products/{id}")
    public Flux<Product> delete(@PathVariable("id") String id) {
        WebClient client3 = createWebClient();
        return client3
                .delete()
                .uri("/v3/products/" + id)
                .retrieve()
                .bodyToFlux(Product.class);
    }

    private WebClient createWebClient() {
        return WebClient
                .builder()
                .baseUrl("http://localhost:8090")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();
    }
}
