public abstract class CharacterClass{
  /*A character class, includes requirement to be said class and
  abilities specific to that class
  if a requirement is not defined in a subclass it defaults to zero
  */
  public final static CharacterStats statRequirement = new CharacterStats();

  public boolean canBecomeThisClass(Stats s){
    if(s.eclipse(this.statRequirement)){
      return true;
    }else{
      return false;
    }
  }





}
class Peasant extends CharacterClass{
  
}
