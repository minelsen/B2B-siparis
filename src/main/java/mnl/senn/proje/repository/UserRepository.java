package mnl.senn.proje.repository;

import mnl.senn.proje.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User,Long> {
    List<User> findByUserIdEquals(Long UserId);
    List<User> findByEmailAndPassword(String email, String password);


}
