package eiffage.repository;


import eiffage.domain.Employe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeRepository extends CrudRepository<Employe,Integer> {


}
