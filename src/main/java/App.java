import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";
 //
    get("/", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();

      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/pet", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      String petName = request.queryParams("petName");
      Tamagotchi newPet = new Tamagotchi(petName);

      request.session().attribute("myPet", newPet);

      model.put("myPet", newPet);
      model.put("template", "templates/pet.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/feed_pet", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();

      Tamagotchi myPet = request.session().attribute("feedPet");
      myPet.feed();

      model.put("myPet", myPet);
      model.put("template", "templates/feed_pet.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
