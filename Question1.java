public class Question1 {
    public static void main(String[] ar){
        int a=45;
        int b = 13;
        int c = 19;
        int d = 10;
        if(a>b){
            if(a>c)
            {
                if(a>d){
                    System.out.println(a);
                }else{
                    System.out.println(d);
                }
            }else{if(c>d)
                System.out.println(c);
                else
                System.out.println(d);
            }
        } // hii
          else{
            if(b>c){
                if(b>d){
                System.out.println(b);
                }
                else{
                System.out.println(d);
                 }

            }
              else{if(c>d)
                System.out.println(c);
                else
                System.out.println(d);
            }
        }

    }
    
}
