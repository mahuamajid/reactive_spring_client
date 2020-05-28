package com.example.reactive.client.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        /*WebClient client3 = WebClient
                .builder()
                .baseUrl("http://localhost:8090")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();

        WebClient client4 = WebClient
                .builder()
                .baseUrl("http://localhost:8090")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();

        Product product = new Product();
        product.setId(null);
        product.setName("Item-2");
        product.setCategory("Category-2");
        product.setPrice(100.0);

        String response1 = client3
                .post()
                .uri("/v3/products")
                .body(BodyInserters.fromObject(product))
                .retrieve()
                .bodyToMono(String.class)
                .block();

        System.out.println("Create Response: " + response1);

        String response2 = client3
                .get()
                .uri("/v3/products/")
                .retrieve()
                .bodyToMono(String.class)
                .block();
        System.out.println("Gets Response: " + response2);

        String response3 = client3
                .get()
                .uri("/v3/products/5eca27a16bedb334e83ca6fa")
                .retrieve()
                .bodyToMono(String.class)
                .block();
        System.out.println("Get Response: " + response3);

        Product product2 = new Product();
        product2.setId(null);
        product2.setName("Item-2");
        product2.setCategory("Category-3");
        product2.setPrice(150.0);

        String response4 = client3
                .put()
                .uri("/v3/products")
                .body(BodyInserters.fromObject(product2))
                .retrieve()
                .bodyToMono(String.class)
                .block();
        System.out.println("Update Response: " + response4);

        String response5 = client3
                .delete()
                .uri("/v3/products/5eca3481ddc63269a23e817e")
                .retrieve()
                .bodyToMono(String.class)
                .block();
        System.out.println("Delete Response: " + response5);

        Flux<String> response6 = client4
                .get()
                .uri("/v3/products/")
                .retrieve()
                .bodyToFlux(String.class)
                .delaySubscription(Duration.ofSeconds(5))
                .repeat();
        response6.subscribe(System.out::println);*/

    }

}
