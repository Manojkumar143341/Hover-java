public class m{


    String disply;
  m(){
    System.out.println("manoj");
  }

void disply(String disply){
     this.disply = disply;
}

    public static void main(String args[]){
         m t1 = new m();
         t1.disply("kum");
           System.out.println(t1.disply);
    }
}