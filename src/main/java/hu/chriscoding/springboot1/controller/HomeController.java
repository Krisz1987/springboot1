package hu.chriscoding.springboot1.controller;



import hu.chriscoding.springboot1.domain.Story;
import hu.chriscoding.springboot1.repository.StoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    StoryRepository storyRepo;


    @RequestMapping("/")
    public String stories(Model model) {
        model.addAttribute("pageTitle", "Minden napra egy sztori!");
        model.addAttribute("stories", getStories());
        return "stories";
    }

    private List<Story> getStories() {

        List<Story> stories = storyRepo.findAll();

        return stories;

//        ArrayList<Story> stories = new ArrayList<>();

/*        Story story1 = new Story();
        story1.setTitle("Első sztorim");
        story1.setPosted(new Date());
        story1.setAuthor("Krisz");
        story1.setContent("<p>Na ez az adat már generálva megy most először!</p>");

        Story story2 = new Story();
        story2.setTitle("Második sztorim");
        story2.setPosted(new Date());
        story2.setAuthor("Peti");
        story2.setContent("<p>Peti története senkit sem érdekel!</p>");

        stories.add(story1);
        stories.add(story2);*/

        //return stories;
    }
}
