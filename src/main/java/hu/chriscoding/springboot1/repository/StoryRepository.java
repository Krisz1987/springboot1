package hu.chriscoding.springboot1.repository;

import hu.chriscoding.springboot1.domain.Story;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StoryRepository extends CrudRepository<Story, Long> {

    // SELECT * FROM story
    List<Story> findAll();

    //SELECT * FROM STORY WHERE posted IN (SELECT max(posted) FROM story) LIMIT 1;
    Story findFirstByOrderByPostedDesc();

    Story findByTitle(String title);
}
