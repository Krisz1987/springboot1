package hu.chriscoding.springboot1.service;

import hu.chriscoding.springboot1.domain.Blogger;
import hu.chriscoding.springboot1.domain.Story;
import hu.chriscoding.springboot1.repository.BloggerRepository;
import hu.chriscoding.springboot1.repository.StoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Date;
import java.util.List;

@Service
public class StoryService {

    private StoryRepository storyRepo;
    private BloggerRepository bloggerRepo;

    @Autowired
    public void setStoryRepo(StoryRepository storyRepo) {
        this.storyRepo = storyRepo;
    }

    @Autowired
    public void setBloggerRepo(BloggerRepository bloggerRepo) {
        this.bloggerRepo = bloggerRepo;
    }

    public List<Story> getStories() {
        return storyRepo.findAll();
    }

    public Story getStory() {
        return storyRepo.findFirstByOrderByPostedDesc();
    }

    public Story getSpecificStory(String title) {
        return storyRepo.findByTitle(title);
    }

/*
így tudok belerakni az adatbázisba Java kódból!

@PostConstruct
    public void init() {
        Blogger blogger = new Blogger("Kata", 19);
        bloggerRepo.save(blogger);

        Story story = new Story("Belső cím", "Belső tartalom", new Date(), blogger);
        storyRepo.save(story);
    }*/

}
