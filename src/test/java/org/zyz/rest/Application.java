package org.zyz.rest;

import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by fin_tech_2014 on 06/06/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class Application {

    RestTemplate restTemplate = new RestTemplate();

    @Test
    public void case1() {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "luozuyu");
        map.put("age", 18);
        restTemplate.postForObject("http://localhost:9090/test", map, String.class);
    }

}
