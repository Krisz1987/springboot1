package hu.chriscoding.springboot1.repository;

import hu.chriscoding.springboot1.domain.Blogger;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BloggerRepository extends CrudRepository<Blogger, Long> {

    List<Blogger> findAll();
}
