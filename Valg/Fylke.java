import java.util.HashMap;
public class Fylke{
  public static double arealVekt=1.8;
  public final String navn;
  private double areal;
  private double folketall;
  private HashMap<Parti,Fylkesparti> partier;
  public Fylke(String navn,double areal,double folketall){
    this.navn=navn;
    this.areal = areal;
    this.folketall = folketall;
  }
  @Override
  public int hashCode(){
    return navn.hashCode();
  }
  @Override
  public boolean equals(Object o){
    if(!(o instanceof Fylke)){
      return false;
    }
    Fylke f = (Fylke)o;
    return this.navn.equals(f.navn);
  }
  public double fordelingsTall(){
    return this.areal*arealVekt+this.folketall;
  }
}
