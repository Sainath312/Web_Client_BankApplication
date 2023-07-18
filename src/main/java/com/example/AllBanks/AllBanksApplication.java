package com.example.AllBanks;

import com.example.AllBanks.Entity.AccountEntity;
import com.example.AllBanks.Entity.UserEntity;
import com.fasterxml.jackson.databind.JsonNode;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@SpringBootApplication
@RestController
public class AllBanksApplication {

	WebClient webClient;

	@PostConstruct
	public void init(){
		webClient= WebClient.builder().baseUrl("http://localhost:8080/api/bank").
				defaultHeader(HttpHeaders.CONTENT_TYPE,MediaType.APPLICATION_JSON_VALUE).build();}
	@PostMapping("/newAccount")
	public Mono<JsonNode> createAccount(@RequestBody UserEntity user){
		return webClient.post().uri("/createAccount").bodyValue(user).retrieve().bodyToMono(JsonNode.class);
	}
	@GetMapping("/getBalance/{id}")
	public Mono<JsonNode> getAccountBalance(@PathVariable int id){
		return webClient.get().uri("/getBalance/"+id).retrieve().bodyToMono(JsonNode.class);
	}
	@PutMapping("/addBalanceToAccount")
	public Mono<JsonNode> addBalance(@RequestBody AccountEntity account){
		return webClient.put().uri("/addBalance").bodyValue(account).retrieve().bodyToMono(JsonNode.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(AllBanksApplication.class, args);
	}

}
