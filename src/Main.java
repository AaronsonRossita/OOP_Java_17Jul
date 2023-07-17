import devs.*;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        Adam adam = new Adam("devs.Adam",1);
        Tom tom = new Tom("devs.Tom",2);
        Mary mary = new Mary("devs.Mary",3);
//
//        dev(adam);
//        dev(tom);
//        dev(mary);
//
//        fs(adam);
//        fs(tom);
        //fs(mary);

//        qa(adam);
        //qa(tom);
//        qa(mary);
        int[] arrInt = {1,2,3,4,5};
        Developer[] arrDevs = {adam,tom,mary};
        arrDevs[1] = null;
//        System.out.println(arrDevs.length);

        ArrayList<Object> list = new ArrayList();
        list.add(18);
        list.add("");
        list.add(true);
        list.add(tom);


        ArrayList<Developer> devs = new ArrayList();
        devs.add(adam);
        devs.add(0,tom);
        devs.add(mary);

//        System.out.println(devs);

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(6);

//        System.out.println(devs.size());
//        System.out.println(devs);
//        devs.remove(1);
//        System.out.println(devs);

//        for (int i = 0; i < devs.size(); i++) {
//            System.out.println(devs.get(i).getName());
//        }
//
//        Iterator<Developer> iterator = devs.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next().getName());
//        }
        int[] a = {1,2,3};
        int[] b = {3,2,1};

        ArrayList<String> listA = new ArrayList<>();
        listA.add("Red");
        listA.add("Green");
        listA.add("Black");
        listA.add("White");
        listA.add("Pink");

        ArrayList<String> listB = new ArrayList<>();
        listB.add("Red");
        listB.add("Green");
        listB.add("Black");
        listB.add("Pink");
        listB.add("White");

        //System.out.println(compareTwoCollections(listA,listB));

        // 1 = one, 2 = two....10 = ten;

        HashMap<Integer,String> numbers = new HashMap<>();
        numbers.put(1,"one");
        numbers.put(2,"four");
        numbers.put(3,"three");
        numbers.put(4,"four");
        numbers.put(4,"five");

        System.out.println(numbers.get(4));
        System.out.println(numbers.containsKey(5));
        System.out.println(numbers.containsValue("three"));
        System.out.println(numbers.replace(4,"four"));
        System.out.println(numbers.get(4));
        System.out.println(numbers.replace(40,"four"));


    }

        static ArrayList<Boolean> compareTwoCollections(ArrayList<String> a, ArrayList<String> b){
            ArrayList<Boolean> result = new ArrayList<>();
            for (int i = 0; i < a.size(); i++) {
//                if (b.contains(a.get(i))){
//                    result.add(true);
//                }else{
//                    result.add(false);
//                }
                result.add(b.contains(a.get(i)));
            }
            return result;
        }
        static Boolean[] compareTwoArrays(String[] a, String[] b){
            Boolean[] result = new Boolean[a.length];
            if (a.length == b.length){
                for (int i = 0; i < a.length; i++) {
                    result[i] = a[i] == b[i];
                }
                return result;
            }else{
                return result;
            }
        }

        static String arrayToString(Object[] arr){
            String result = "{";
            for (int i = 0; i < arr.length; i++) {
                if(i == arr.length-1){
                    result += arr[i] + "}";
                }else{
                    result += arr[i] + ", ";
                }
            }
            return result;
        }

        static void fs(Fullstack f){
            f.writeFullStackCode();
        }

        static void qa(QA q){
            q.writeAutomationQA();
        }

        static void dev(Developer d){
            d.writeAnyCode();
        }

}