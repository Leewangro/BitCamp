package bitcamp.java106.pms.web.json;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import bitcamp.java106.pms.domain.Notice;
import bitcamp.java106.pms.service.NoticeService;

@RestController
@RequestMapping("/notice")
public class NoticeController {
    
    NoticeService noticeService;
    
    public NoticeController(NoticeService noticeService) {
        this.noticeService = noticeService;
    }

    @ResponseStatus(HttpStatus.CREATED)
    
    
    @RequestMapping("list{page}")
    public Object list(
            @MatrixVariable(defaultValue="1") int pageNo,
            @MatrixVariable(defaultValue="3") int pageSize) {        
        return noticeService.list(pageNo, pageSize);
    }
    
   
}

//ver 55 - JSON 데이터를 출력하는 페이지 컨트롤러 생성

