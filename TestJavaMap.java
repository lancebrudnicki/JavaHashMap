import java.util.Set;
import java.util.HashMap;

public class TestJavaMap{
    public static void main(String[] args){
        HashMap<String, String> songMap = new HashMap<String,String>();
        songMap.put("98 Degrees" , "its 98 Degrees");
        songMap.put("SOS" , "send an SOS");
        songMap.put("Crash and Burn" , "asdfasdlfjadjflaskdjf;alsdjkf");
        songMap.put("Deathwish" , "its a deathwish");
        
        System.out.println(songMap.get("SOS"));
        
        Set<String> keys = songMap.keySet();
        for(String key : keys){
        System.out.println(key + ": " + songMap.get(key));
        }

    }
}