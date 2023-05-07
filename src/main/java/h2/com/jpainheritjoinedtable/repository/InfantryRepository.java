package h2.com.jpainheritjoinedtable.repository;

import h2.com.jpainheritjoinedtable.model.Infantry;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface InfantryRepository extends CrudRepository<Infantry, Long> {

}
