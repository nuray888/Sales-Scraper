package com.example.salesscraper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ScraperService {
    @Scheduled(fixedDelay = 1000)
    public void getArzumbeauty() throws IOException {
        Document doc=Jsoup.connect("https://arzumbeauty.com/").get();
        Elements elementsByClass = doc.getElementsByClass("product");
        for(Element e:elementsByClass){
            Elements productName = e.getElementsByClass("product-holder__info__title");
            System.out.println(productName.text());

            Elements href = e.getElementsByAttribute("href");
            String links=href.attr("abs:href");

            Document doc2=Jsoup.connect(links).get();
            Element priceInfo = doc2.getElementsByClass("product-detail__content__price").get(0);
            Element previousPrice = priceInfo.getElementsByTag("span").get(0);
            Element currentPrice = priceInfo.getElementsByClass("price").get(0);
            System.out.println("Previous price : "+previousPrice.text());
            System.out.println("Current price : "+currentPrice.text());



            Elements productInfo = doc2.getElementsByClass("product-detail__content__about");
            System.out.println("Product "+productInfo.text()+"\n for getting product you can visit: "+links+"\n"+"*********************************************");

        }
    }
}
