
import java.util.logging.Level;
import java.util.logging.Logger;




public class NewClass  {
    
    public static void main(String args[]){
        Thread t1 = new Thread(new thread());
        t1.start();
        try {
            t1.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        }
//        try {
//            Thread.currentThread().join();
//        } catch (InterruptedException ex) {
//            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
//        }
        System.out.println("main");
      //  t.run();
//        String n="96";
//        //parseInt();
//        int n1;
//        n1 = Integer.parseInt(n);
//        System.out.println(n1);
//        Character c='a';
//        char d = 'G';
//        //c.isLetter(0);
//     
//        //parseFloat();
//        float f = 0;
//        try{
//        f=Float.parseFloat("sndhfuhdsf");
//        System.out.print(f);}
//        catch (NumberFormatException x){
//            System.out.println(x.getMessage());
//        }
//        System.out.println(Character.isLetter(678));
//        System.out.println(Character.isDigit(d));
//        String s= "123 ss";
//        int ceo [];
//        ceo = count(s);
//        for (int i = 0; i < 3; i++) {
//            System.out.println(ceo[i]);
//        }
//    }
//
//     public static int [] count(String s){
//         int c1 = 0;
//        int c2 = 0;
//        int c3 = 0;
//        char [] ch = s.toCharArray();
//        for(char c5: ch){
//            if(Character.isLetter(c5)){
//                c1++;
//            }
//            else if(Character.isDigit(c5))
//                c2++;
//            else
//                c3++;
//        } int a[] = {c1, c2, c3};
//        return a;
     }
}
