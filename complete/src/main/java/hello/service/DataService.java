package hello.service;

import hello.mapper.UserMapper;
import hello.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by kang on 2017/5/22.
 */
@Service
public class DataService {
    @Autowired
    private UserMapper userMapper;

    public User selectRecentOne() {
        return userMapper.selectRecentOne();
    }

    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    @Transactional(rollbackOn = Exception.class)
    public void insertTransactional(User user) {
        userMapper.insert(user);
    }
}
