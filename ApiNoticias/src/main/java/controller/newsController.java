package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import services.NewsApiService;

@RestController
public class newsController {

    @Autowired
    private NewsApiService newsAPIService;

    @GetMapping("/news")
    public String getNews() {
        return newsAPIService.getNews();
    }
}