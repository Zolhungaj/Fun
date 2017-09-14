import java.util.HashMap;
public class Parti{
  public final String navn;
  protected double antallStemmer;
  protected int antallMandater;
  private HashMap<Fylke,Fylkesparti> lokal;
  public Parti(String navn){
    this.navn = navn;
  }
  public double antallStemmer(){
    double antall = 0;
    for(Fylkesparti p:lokal.values()){
      antall+=p.antallStemmer();
    }
    return antall;
  }
  @Override
  public int hashCode(){
    return navn.hashCode();
  }
  @Override
  public boolean equals(Object o){
    if(!(o instanceof Parti)){
      return false;
    }
    Parti p = (Parti)o;
    return this.navn.equals(p.navn);
  }
}

class Fylkesparti extends Parti{
  public Fylkesparti(String navn){
    super(navn);
  }
  private Fylke hjem;
  //private Parti mor;
  @Override
  public double antallStemmer(){
    return antallStemmer;
  }
  @Override
  public int hashCode(){
    return super.hashCode()+hjem.hashCode();
  }
  @Override
  public boolean equals(Object o){
    if(!(o instanceof Fylkesparti)){
      return false;
    }
    Fylkesparti p = (Fylkesparti)o;
    return this.navn.equals(p.navn)&&this.hjem.equals(p.hjem);
  }
}
