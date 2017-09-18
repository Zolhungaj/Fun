import java.util.HashMap;
public class Land{
  public static double saintelagueMetode(double stemmer, int mandater){
    //stemmer er totalt antall stemmer, mandater er antall faatt saa langt
    return stemmer/(mandater*2+1);
  }
  public static double slmconst=1.4;
  public static double saintelagueModifiserteMetode(double stemmer, int mandater){
    if(mandater==0){
      return stemmer/slmconst;
    }else{
      return saintelagueMetode(stemmer,mandater);
    }
  }
  private HashMap<String,Parti> partier;
}
