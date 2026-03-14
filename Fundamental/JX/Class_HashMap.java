
package java5;

import java.util.HashMap;

class Class_HashMap 
{
    public Class_HashMap() 
    {
        HashMap<String,String> admin = new HashMap<>();
        
        admin.put("Username","Password");
        admin.put("Hritik","void@1234");
        admin.put("Poonam","Icandoit");
        admin.put("Alisha","200247");
        admin.put("tan","sac");
        
        //variable_name.put(key,value);  add key and value in hashmap
        //variable_name.keySet();   give all key 
        //variable_name.get(key);   use to get value of key
        //variable_name.remove(key/value); remove key and value
        //variable_name.clear();     remove all value of Hashmap
        //vaiable_name.size();      give size of the hashmap
        //variable_name.clone();     
        //variable_name.entrySet();
        //variable_name.isEmpty();  check map is empty or not
        //variable_name.values()     give back all values
        //variable_name.containsKey(key);   check to key presemt
        //variable_name.containsValue(value);   check to value present

        for( String i : admin.keySet() )
        {
            System.out.println("\t"+i+"\t"+admin.get(i));
        }
        
    }   
}
