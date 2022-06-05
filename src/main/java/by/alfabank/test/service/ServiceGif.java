package by.alfabank.test.service;

import by.alfabank.test.entity.Gif;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name = "smthGif",url = "${gif.url}")
public interface ServiceGif {

    @GetMapping("/v1/gifs/search?api_key={api_key}&q={q}&limit=1&offset={offset}&rating=pg&lang=en")
    public Gif getGif(@PathVariable String api_key,@PathVariable  String q,@PathVariable  String offset);
}
