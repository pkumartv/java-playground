package java8;

import java.util.HashMap;
import java.util.Map;

import com.google.common.collect.ImmutableMap;

public class ImmutableMapTest {


    public static  void mapCheck(){
        Map<String,Object> sourceMap= new HashMap<>();
        Map<String,Object> sourceSubMap= new HashMap<>();
        
        Map<String,String> accountContactMap= new HashMap<>();
        accountContactMap.put("relatedTypes", "ONE");
        //accountContactMap.put("name", "TWO");
        sourceSubMap.put("AccountContact", accountContactMap);

        sourceMap.put("Account", sourceSubMap);

        System.out.println("!!!!!Original Soure "+sourceMap);

        ImmutableMap notModifiable= ImmutableMap.copyOf(sourceMap);
        Map<String,Object> copiedMap= new HashMap<>(notModifiable);

        System.out.println("!!!!!Copied Map "+copiedMap);

        Map<String,Object> accountChild= (Map<String, Object>) copiedMap.get("Account");
        accountChild= new HashMap<>(accountChild);
        Map<String,Object> accoundChildren=( Map<String,Object>) accountChild.get("AccountContact");

        Map<String,Object> accoundChildrenCopy=new HashMap<>(accoundChildren);
        System.out.println(accountChild);
        accoundChildrenCopy.put("newone", new Object());
        //accountChild.put("Account", accoundChildrenCopy);
        copiedMap.put("Account", accoundChildrenCopy);
        System.out.println(accoundChildren);

        System.out.println("Parent "+accountChild);

        System.out.println("\n\n FINAL\n\n");
        System.out.println("Main source "+sourceMap);
        System.out.println("Immutable source "+notModifiable);
        System.out.println("!!!!!Copied Map "+copiedMap);


    }

    public static void main(String[] args) {
        mapCheck();
        // Map<String,Object> mainMap= new HashMap<>();
        // Map<String,Object> subMap= new HashMap<>();
        // Map<String,String> accountContactMap= new HashMap<>();
        // //accountContactMap.put("relatedTypes", "ONE");
        // accountContactMap.put("name", "TWO");
        // subMap.put("AccountContact", accountContactMap);
        // mainMap.put("Account", subMap);

        // System.out.println(mainMap);

        // ImmutableMap notModifiable= ImmutableMap.copyOf(mainMap);
        // Map<String,Object> copiedMap= new HashMap<>(notModifiable);

        // System.out.println(copiedMap);

        // Map<String,Object> accountChild= (Map<String, Object>) copiedMap.get("Account");
        // accountChild= new HashMap<>(accountChild);
        // Map<String,Object> accoundChildren=( Map<String,Object>) accountChild.get("AccountContact");

        // Map<String,Object> accoundChildrenCopy=new HashMap<>(accoundChildren);
        // System.out.println(accountChild);
        // accoundChildrenCopy.put("newone", new Object());
        // accountChild.put("Account", accoundChildrenCopy);
        // System.out.println(accoundChildren);

        // System.out.println("Parent "+accountChild);

        // System.out.println("Main source "+mainMap);
        // System.out.println("Immutable source "+notModifiable);

        
    }
    
}
