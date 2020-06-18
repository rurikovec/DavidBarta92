package aircraft;

public class F35 extends Aircraft {
  public F35() {
    super();
    this.maxAmmo = 12;
    this.baseDamage = 50;
    this.type = "F16";
  }

  @Override
  boolean isPriority() {
    return true;
  }
}
