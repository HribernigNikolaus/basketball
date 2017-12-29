package at.fh.ima.swengs.bbleague.model;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface StadiumRepository extends PagingAndSortingRepository<Stadium, Long> {

    //This would be exposed under the URL: http://localhost:8080/passengers/search/findByFirstNameAndLastName
    List<Stadium> findByName(@Param("name") String name);
    List<Stadium> findByLandAndCity(@Param("land") String land, @Param("city")String city);

}
