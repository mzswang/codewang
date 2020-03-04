package wzs.wzstest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class usercontroller {

 /*
	@Value("${com.dudu.name}")
    private  String name;
    @Value("${com.dudu.want}")
    private  String want;

    @RequestMapping("/")
    public String hexo(){
        return name+","+want;
 */
	 public String hexo(){
	        return "123";
	
    }
}