package by.alfabank.test.service;

import by.alfabank.test.entity.Rate;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//api/historical/2022-05-30.json?app_id=dca56f09a84449638f54f2acc2a6eaf4&base=USD&&symbols=
@Component
@FeignClient(name = "usdToSmth",url = "${rate.url}")
public interface ServiceRate {

    @GetMapping("/api/historical/{date}.json?app_id={app_id}&base={base}&symbols={code}")
    public Rate getRate(@PathVariable String date,@PathVariable  String app_id,@PathVariable String base,@PathVariable  String code);



}
