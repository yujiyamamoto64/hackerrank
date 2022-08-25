package hack30;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionariesMapsD8 {

	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        Map<String, Integer> pb = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            pb.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if (pb.containsKey(s)) {
            	System.out.println(s + "=" + pb.get(s));
            } else {
            	System.out.println("Not found");
            }
        }
        in.close();
    }
}
