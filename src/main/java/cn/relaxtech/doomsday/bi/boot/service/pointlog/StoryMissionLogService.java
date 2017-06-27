package cn.relaxtech.doomsday.bi.boot.service.pointlog;

import cn.relaxtech.doomsday.bi.boot.dao.pointlog.StoryMissionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhoulinghong on 2017/6/24.
 */
@Service
public class StoryMissionLogService {

    @Autowired
    private StoryMissionDao storyMissionMapper;
    public void log()
    {
        storyMissionMapper.insert(null);
    }
}
