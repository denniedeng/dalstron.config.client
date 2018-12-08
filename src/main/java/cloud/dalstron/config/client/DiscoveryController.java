package cloud.dalstron.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RefreshScope
@RestController
@RequestMapping("/config")
public class DiscoveryController {
	
	@Value("${from}")
    private String from;
	
	@RequestMapping(value = "/from" ,method = RequestMethod.GET)
    public String add() {
		return this.from;
    }
}
