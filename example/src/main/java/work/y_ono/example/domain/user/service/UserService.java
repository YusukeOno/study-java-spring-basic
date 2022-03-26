package work.y_ono.example.domain.user.service;

import java.util.List;

import work.y_ono.example.domain.user.model.MUser;

public interface UserService {
    // ユーザー登録
    public void signup(MUser user);

    // ユーザー取得
    public List<MUser> getUsers();
}
