package work.y_ono.example.domain.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import work.y_ono.example.domain.user.model.MUser;
import work.y_ono.example.domain.user.service.UserService;
import work.y_ono.example.repository.UserMapper;

@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserMapper mapper;

    // ユーザー登録
    public void signup(MUser user) {
        user.setDepartmentId(1); // 部署
        user.setRole("ROLE_GENERAL"); // ロール
        mapper.insertOne(user);
    }
}
