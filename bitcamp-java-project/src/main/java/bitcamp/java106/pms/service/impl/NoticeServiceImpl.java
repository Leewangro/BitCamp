// 업무로직 구현체 - 고객사 마다 다른 구현을 할 수 있다.
package bitcamp.java106.pms.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import bitcamp.java106.pms.dao.NoticeDao;
import bitcamp.java106.pms.domain.Notice;
import bitcamp.java106.pms.service.NoticeService;
@Service
public class NoticeServiceImpl implements NoticeService {

    NoticeDao noticeDao;

    public NoticeServiceImpl(NoticeDao noticeDao) {
        this.noticeDao = noticeDao;
    }

    @Override
    public List<Notice> list(int pageNo, int pageSize) {
        HashMap<String,Object> params = new HashMap<>();
        params.put("startRowNo", (pageNo - 1) * pageSize);
        params.put("pageSize", pageSize);

        return noticeDao.selectList(params);
    }
    
   
   
}
