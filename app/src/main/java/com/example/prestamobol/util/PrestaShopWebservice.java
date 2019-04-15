package com.example.prestamobol.util;

import org.springframework.web.client.RestTemplate;

public class PrestaShopWebservice {
    private String url;
    private String key;
    private boolean debug;
    private String version;
    private static final String key_final = "LLCL33SVQQ2AU4TH676DMHEJBSKHZ72R";
    private static final String url_final="https://profelec.net/";

    public PrestaShopWebservice(String url, String key, boolean debug, String version) {
        this.url = url;
        this.key = key;
        this.debug = debug;
        this.version = version;
    }

    public PrestaShopWebservice() {
    }
/*private Object execute(Object object){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForEntity(url,)
    }*/
}
