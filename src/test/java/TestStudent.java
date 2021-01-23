import com.example.demo.comm.ExportExcelUtil;
import com.example.demo.comm.ExportExcelUtil2;
import com.example.demo.mapper.Student;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestStudent {

    @Test
    void testExcel() throws FileNotFoundException {
        List<Student> list = new ArrayList(){{
            add(new Student("张三1","18",10));
            add(new Student("张三1","18",20));
            add(new Student("李四","18",20));
        }};
          ExportExcelUtil2<Student> ex =new ExportExcelUtil2<>();
        FileOutputStream outputStream = new FileOutputStream(System.getProperty("user.dir")+ File.separator+"testdata"+File.separator+"db.xlsx");
        ex.exportExcel("student",list,outputStream,"1");

    }
    @Test
    void testList() {
        List<Student> list = new ArrayList(){{
            add(new Student("张三","18",10));
            add(new Student("张三","18",20));
            add(new Student("李四","18",20));
        }};

        List<Student> studentList = new ArrayList<>();
        list.parallelStream().collect(Collectors.groupingBy(s->s.getName())).forEach((id,transfer)->{
            transfer.stream().reduce((a,b)->new Student(a.getName(),a.getAge(),a.getScore()+b.getScore())).ifPresent(studentList::add);
        });
    }
}
