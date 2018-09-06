package course.api.springBoot.Topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topics> topics = new ArrayList<>( Arrays.asList(				
			new Topics(1, "Java", "learning java"),
			new Topics(2, "Kofax", "learning Kofax"),
			new Topics(3, "Informatica", "learning Informatica")
			));
	
	public List<Topics> getTopics(){
		return topics;
		
	}
	
	public void addTopics(Topics topic) {
		topics.add(topic);
		
	}

	public Topics getTopicsByid(int id) {
		Topics top = new Topics();
		for(Topics to: topics){
			if(to.getId()==id){
				top =to;
			}
		}
		return top;
			}
}
