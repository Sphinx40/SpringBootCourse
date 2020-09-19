package sphinx.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sphinx.demo.domain.Capability;

@Repository
public interface CapabilityRepository extends JpaRepository<Capability, Long> {

}