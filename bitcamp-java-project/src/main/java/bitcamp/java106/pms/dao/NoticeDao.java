package bitcamp.java106.pms.dao;

import java.util.List;
import java.util.Map;

import bitcamp.java106.pms.domain.Notice;

public interface NoticeDao {
    List<Notice> selectList(Map<String,Object> params);
}