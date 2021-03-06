package com.suyu.api.serviceImpl;


import com.suyu.api.mapper.UserTaskMapper;
import com.suyu.api.service.UserTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Map;

/**
 * @author zwd
 * @date 2018/2/28 16:36
 */
@Service
@Transactional
public class UserTaskServiceImpl implements UserTaskService {
    @Autowired
    private UserTaskMapper userTaskMapper;
    @Override
    public List<Map> selectByDay(String day) {
        return userTaskMapper.selectByDay(day);
    }
}
