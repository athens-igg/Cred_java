import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String args[]){
    ArrayList<String> arr1=new ArrayList<String>();
    arr1.add("A");
    arr1.add("B");
    for (int i=0;i<arr1.size();i++){
        System.out.println(arr1.get(i));
    }
    arr1.add(1,"AA");   //ADDED AA
     for (int i=0;i<arr1.size();i++){
        System.out.println("*"+arr1.get(i));
    }
    arr1.set(2,"C");    //OVERRIDE, USING C
     for (int i=0;i<arr1.size();i++){
        System.out.println("-"+arr1.get(i));
    }

    arr1.remove(1); //index 1
     for (int i=0;i<arr1.size();i++){
        System.out.println("#"+arr1.get(i));
    }

    arr1.remove("C");    //REMOVE ELEMENT
     for (int i=0;i<arr1.size();i++){
        System.out.println("~"+arr1.get(i));
    }
    System.out.println("----------------------------------------------------");
    arr1.clear();
     for (int i=0;i<arr1.size();i++){
        System.out.println("."+arr1.get(i));
    }
}}
