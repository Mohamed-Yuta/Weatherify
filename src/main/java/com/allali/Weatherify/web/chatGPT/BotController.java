package com.allali.Weatherify.web.chatGPT;



import com.allali.Weatherify.dtos.chatGpt.ChatRequest;
import com.allali.Weatherify.dtos.chatGpt.ChatResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/weather/bot")
@Slf4j
public class BotController {

    @Value("${openai.model}")
    private String model;

    @Value(("${openai.api.url}"))
    private String apiURL;

    @Qualifier("openaiRestTemplate")
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private WebClient.Builder webClient ;
    @Value(("${openai.api.key}"))
    private String apiKey;
    /*@GetMapping("chat")
    public Mono<ChatResponse> chat(@RequestParam("prompt") String prompt) {
        log.info("prompt: {}", prompt);
        ChatRequest request = new ChatRequest(model, prompt);
        return webClient.build().post()
                .uri(apiURL)
                .header("Authorization", "Bearer " + apiKey)
                .body(BodyInserters.fromValue(request))
                .retrieve()
                .bodyToMono(ChatResponse.class);
    }

    /*public ChatResponse chat(@RequestParam("prompt") String prompt){
        log.info("prompt: {}", prompt);
        ChatRequest request=new ChatRequest(model, prompt);
        ChatResponse chatGptResponse = template.postForObject(apiURL, request, ChatResponse.class);
        // if you want a short string response
        //return chatGptResponse.getChoices().get(0).getMessage().getContent();
        return chatGptResponse ;
    }
    */
    @GetMapping("/chat")
    public String chat(@RequestParam String prompt) {
        // create a request
        ChatRequest request = new ChatRequest(model, prompt);

        // call the API
        ChatResponse response = restTemplate.postForObject(apiURL, request, ChatResponse.class);

        if (response == null || response.getChoices() == null || response.getChoices().isEmpty()) {
            return "No response";
        }

        // return the first response
        return response.getChoices().get(0).getMessage().getContent();
    }
}