package otter.sherry.ottergift.productv2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepositoryv2 extends JpaRepository<ProductEntityv2, Long> {
    List<ProductEntityv2> findByProductId(Long productId);
}
