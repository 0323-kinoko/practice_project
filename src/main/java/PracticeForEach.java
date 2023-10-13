import java.util.ArrayList;
import java.util.List;

public class PracticeForEach {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("木下");
        list.add("松本");
        list.add("美麗");
        list.add("澤幡");
        list.add("大岩");
        list.add("畠岡");
        list.add("立道");
        list.add("田原");
        list.add("犬山");
        list.add("渡邉");

        for (String employee : list) {
            System.out.println(employee);
        }
    }
}