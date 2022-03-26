package work.y_ono.example.repository;

import org.apache.ibatis.annotations.Mapper;

import work.y_ono.example.domain.user.model.MUser;

@Mapper
public interface UserMapper {
    // ユーザー登録
    public int insertOne(MUser user);
}
