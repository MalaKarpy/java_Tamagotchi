import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;


public class Tamagotchi {
  private String mName;
  public static final int MAX_VALUE = 10;
  private int mFoodLevel;
  private int mTime;
  private int mEnergy;
  private int mFoodAmount;

  // time goes by, hunger level increases
  // hunger starts at 10, when hunger level = 5, alert pet owner to feed pet

  public void feed() {
    feed(MAX_VALUE);
  }

  public void feed(int foodAmount) {
    mFoodLevel += foodAmount;
  }

  // public void feed(int foodAmount) {
  //   if (mFoodLevel <= 5) {
  //      foodAmount = MAX_VALUE;
  // }

  public Tamagotchi(String name) {
    mName = name;
    mFoodLevel = MAX_VALUE;
    mTime = MAX_VALUE;
    mEnergy = MAX_VALUE;
    mFoodAmount = MAX_VALUE;
  }

  public String getName() {;
    return mName;
   }

  public boolean isAlive() {
    return mEnergy == 10;
  }

  public boolean isHungry() {;
    return mFoodLevel == 0;
    }

  public boolean getEnergyLevel() {;
      return mEnergy == 0;
     }

}
