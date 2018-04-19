public class forfun{
  public static void main(String[] args){
    int n=0;
    while(n<1500){
      System.out.printf("fizzbuzz, %d, %d, fizz, %d, buzz, fizz, %d, %d, fizz, buzz, %d, fizz, %d, %d, ",++n,++n,n+=2,n+=3,++n,n+=3,n+=2,++n);
      n++;
    }
  }
}
