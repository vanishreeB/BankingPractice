package course.api.springBoot.Topics;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopiController {

	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topics> getTopics(){
		return topicService.getTopics();
		
	}
	
	@RequestMapping("/topics/{id}")
	public Topics getTopics(@PathVariable int id){
		return topicService.getTopicsByid(id);
		
	}

	@RequestMapping(method= RequestMethod.POST, value= "/topics")
	public void addTopics(@RequestBody Topics topic){
		topicService.addTopics(topic);
		
		
		
	}
	
}
