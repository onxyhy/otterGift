package otter.sherry.ottergift.cs;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CSRepository extends JpaRepository<CSEntity, Long> {
}
