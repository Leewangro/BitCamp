// 디렉토리에 들어있는 파일(디렉토리) 목록을 꺼낼 때 필터 적용하기
package step16.ex1;

import java.io.File;
import java.io.FilenameFilter;

public class Exam06_1{

    static class javaFilter implements FilenameFilter {
        public boolean accept(File dir, String name) {
            if (name.endsWith(".java"))
                return true;
            return false;
                
        }
    }
    
    public static void main(String[] args) throws Exception {
        File dir = new File(".");
        
        // 1) 필터 준비
        String[] names = dir.list();
        
        for(String name: names) {
            System.out.println(name);
        }
        
    }


}