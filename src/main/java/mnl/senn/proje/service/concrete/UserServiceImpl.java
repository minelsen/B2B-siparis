package mnl.senn.proje.service.concrete;

import mnl.senn.proje.model.Customer;
import mnl.senn.proje.model.User;
import mnl.senn.proje.repository.UserRepository;
import mnl.senn.proje.service.abstractt.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User login(String email, String password) {
        List<User>
                login = userRepository.findByEmailAndPassword(email,password);

        if (login.size()==0){
            return new User();
        }


        return login.get(0);

    }

    @Override
    public User getList(Long id) {
        List<User>
                user = userRepository.findByUserIdEquals(id);
        return user.get(0);
    }
}
