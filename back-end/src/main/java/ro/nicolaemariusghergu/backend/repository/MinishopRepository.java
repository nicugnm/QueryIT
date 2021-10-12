package ro.nicolaemariusghergu.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;
import ro.nicolaemariusghergu.backend.model.Minishop;
import ro.nicolaemariusghergu.backend.model.data.Product;
import ro.nicolaemariusghergu.backend.model.data.MinishopCategory;

import java.util.List;
import java.util.Optional;

@Repository
public interface MinishopRepository extends JpaRepository<Minishop, Long> {

    @NonNull
    @Override
    Optional<Minishop> findById(@NonNull Long id);

    List<Minishop> findAllByMinishopCategory(MinishopCategory minishopCategory);

    List<Minishop> findAllByProduct(Product product);
}
