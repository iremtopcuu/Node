import java.net.StandardSocketOptions;

public class Main {
    public static void main(String[] args){

 CreateNode A= new CreateNode() ;     // bellekte düğüm oluşturduk
 CreateNode B= new CreateNode() ;
 CreateNode C= new CreateNode() ;

 A.data=1;
 B.data=2;    // düğümlere değerlerini atadık
 C.data=3;


 A.next=B;
 B.next=C;   // düğümleri birbirine bağladık
 C.next=null;


 CreateNode temp=A;

 while (temp!= null){                      //traver: düğümlerin üzerinde dolaştık
     System.out.println(temp.data);
     temp=temp.next;

 }








    }

}