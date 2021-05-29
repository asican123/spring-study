import java.util.ArrayList;

/**
 *
 */
public class Hello {
    /**
    *
    */
    private int i;
    /**
    *df
    */
    private String s;
    
    
    
    public void testUpdate() {
        /**
        *df
        */
        
    }
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("");
        System.out.println();
        ArrayList<String> o = new ArrayList<String>();
        o.add("Lili");
        o.add("GiGi");
//        for (int i = 0; i < o.size(); i++) {
//            System.out.println(o.get(i));
//        }
        for (String s : o) {
            System.out.println(s);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(123);
        arrayList.add(456);
        arrayList.add(789);
        for (Object o1 : arrayList) {

        }
        for (int i = 0; i < arrayList.size(); i++) {

        }
        for (int i = arrayList.size() - 1; i >= 0; i--) {

        }

    }


    public void method() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(123);
        arrayList.add(456);
        arrayList.add(789);

        if (arrayList == null) {

        }
        if (arrayList != null) {

        }
        if (arrayList == null) {

        }
        if (arrayList != null) {

        }

    }
}
