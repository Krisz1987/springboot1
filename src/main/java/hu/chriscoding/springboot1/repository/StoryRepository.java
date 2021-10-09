package hu.chriscoding.springboot1.repository;

import hu.chriscoding.springboot1.domain.Story;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StoryRepository extends CrudRepository<Story, Long> {

    List<Story> findAll();
}
