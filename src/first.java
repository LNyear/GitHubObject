import java.util.HashMap;
import java.util.Map;
import java.util.Map;

public class first {
    public static void main(String[] args) {
        String content = "�й�aadf��111��bbb�Ƶ�zz����";
        HashMap map = new HashMap();
        for(int i=0;i<content.length();i++)
        {
            char c = content.charAt(i);
            Integer num = (Integer) map.get(c);
            if(num == null)
                num = 1;
            else
                num = num + 1;
            map.put(c,num);
        }
        System.out.println(map);
    }
}
