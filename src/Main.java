import redis.clients.jedis.Jedis;

import java.util.Iterator;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Jedis jedis = new Jedis("127.0.0.1");
        while(true) {

            //System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.print("\033[H\033[2J");
            Set<String> names = jedis.keys("*");
            Iterator<String> it = names.iterator();

            while (it.hasNext()) {
                String s = it.next();
                String ans = jedis.get(s);
                if(ans.equals("testing")) {
                  ans = ans + " - CORRECT!!";
                } else {
                  ans = ans + " - WRONG!";
                }
                System.out.println(s + ": " + ans);
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.exit(0);
            }
        }
    }
}
