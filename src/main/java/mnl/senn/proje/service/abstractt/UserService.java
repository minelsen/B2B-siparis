package mnl.senn.proje.service.abstractt;
import mnl.senn.proje.model.User;
public interface UserService {

    User save(User user);

    User login(String email, String password);

    User getList(Long id);

}
