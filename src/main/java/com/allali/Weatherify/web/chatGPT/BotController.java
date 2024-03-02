package com.allali.Weatherify.web.chatGPT;



import com.allali.Weatherify.dtos.chatGpt.ChatRequest;
import com.allali.Weatherify.dtos.chatGpt.ChatResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/weather/bot")
public class BotController {

    @Value("${openai.model}")
    private String model;

    @Value(("${openai.api.url}"))
    private String apiURL;

    @Autowired
    private RestTemplate template;

    @GetMapping("/chat")
    public ChatResponse chat(@RequestParam("prompt") String prompt){
        ChatRequest request=new ChatRequest(model, prompt);
        ChatResponse chatGptResponse = template.postForObject(apiURL, request, ChatResponse.class);
        // if you want a short string response
        //return chatGptResponse.getChoices().get(0).getMessage().getContent();
        return chatGptResponse ;
    }
}