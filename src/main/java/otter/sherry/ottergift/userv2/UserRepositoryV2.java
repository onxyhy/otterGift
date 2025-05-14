package otter.sherry.ottergift.userv2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepositoryV2 extends JpaRepository<UserEntityV2, Long> {
    List<UserEntityV2> id(String id);
}
