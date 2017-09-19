public class Character{
  private CharacterClass cClass;
  private CharacterStats stats = new CharacterStats();
  public void becomeClass(CharacterClass c){
    if(c.canBecomeThisClass(stats)){
      System.out.println("Yeah that's ok.");
      cClass = c;
    }
  }
}
