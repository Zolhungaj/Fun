public abstract class Stats{
  protected double[] stats;
  protected static int totalStats;
  public double[] getStats(){
    return stats;
  }
  public Stats(){

  }
  public boolean eclipse(Stats s){
    //tells wether this Stats is larger or equal to s in all stats
    double[] other = s.getStats();
    for(int i=0;i<totalStats;i++){
      if(stats[i]<other[i]){
        return false;
      }
    }
    return true;
  }
}
class CharacterStats extends Stats{
    private double hp = 0.0;
    private double mp = 0.0;
    private double ap = 0.0;
    private double agility = 0.0;
    private double strength = 0.0;
    protected double[] stats;
    protected static int totalStats = 5;
    public CharacterStats(){
      setStats();
    }
    public CharacterStats(double hp, double mp, double ap, double agility, double strength){
      this.hp = hp;
      this.mp = mp;
      this.ap = ap;
      this.agility = agility;
      this.strength = strength;
      setStats();
    }
    private void setStats(){
      stats = new double[totalStats];
      stats[0]=hp;
      stats[1]=mp;
      stats[2]=ap;
      stats[3]=agility;
      stats[4]=strength;
    }
    public boolean eclipse(Stats s){
      if(s instanceof CharacterStats){
        return super.eclipse(s);
      }else{
        return false;
      }
    }
}
class WeaponStats extends Stats{
  private double durability;
  public boolean eclipse(Stats s){
    if(s instanceof WeaponStats){
      return super.eclipse(s);
    }else{
      return false;
    }
  }
}
