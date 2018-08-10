package bitcamp.java106.pms.domain;

import java.io.Serializable;
import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Notice implements Serializable {
    private static final long serialVersionUID = 1L;

    private int no;
    private String title;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date createdDate;
    private int hits;
    private String name;
    private String down;
    @Override
    public String toString() {
        return "Notice [no=" + no + ", title=" + title + ", createdDate=" + createdDate + ", hits=" + hits + ", name="
                + name + ", down=" + down + "]";
    }
    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Date getCreatedDate() {
        return createdDate;
    }
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    public int getHits() {
        return hits;
    }
    public void setHits(int hits) {
        this.hits = hits;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDown() {
        return down;
    }
    public void setDown(String down) {
        this.down = down;
    }
    
    // 개발하는 동안 객체의 내용을 확인하기 위해서 toString()을 오버라이딩 한다.
    
    
    
    
    
    
}

//ver 31 - 생성자 제거 및 count 변수 제거
//ver 27 - java.io.Serializable 인터페이스 구현
//ver 24 - setNo() 변경
//ver 18 - 게시물 객체의 고유 번호(no)를 static 변수(count)를 이용하여 자동 설정한다. 
// ver 16 - 캡슐화 적용. 겟터, 셋터 추가.
// ver 13 - 등록일의 데이터 타입을 String에서 Date으로 변경






