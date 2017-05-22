package hello.mapper;

import hello.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by kang on 2017/5/22.
 */
@Mapper
public interface UserMapper {
    User selectRecentOne();
    boolean insert(User user);
    List<User> selectAll();
}
