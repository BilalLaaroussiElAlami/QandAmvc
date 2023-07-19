// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAuthenticatedUserController AuthenticatedUserController = new controllers.ReverseAuthenticatedUserController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseUserController UserController = new controllers.ReverseUserController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReversePostControllerSTOF PostControllerSTOF = new controllers.ReversePostControllerSTOF(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseContactPageController ContactPageController = new controllers.ReverseContactPageController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseLandingPageController LandingPageController = new controllers.ReverseLandingPageController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeControllerSTOF HomeControllerSTOF = new controllers.ReverseHomeControllerSTOF(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAuthenticatedUserController AuthenticatedUserController = new controllers.javascript.ReverseAuthenticatedUserController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseUserController UserController = new controllers.javascript.ReverseUserController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReversePostControllerSTOF PostControllerSTOF = new controllers.javascript.ReversePostControllerSTOF(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseContactPageController ContactPageController = new controllers.javascript.ReverseContactPageController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseLandingPageController LandingPageController = new controllers.javascript.ReverseLandingPageController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeControllerSTOF HomeControllerSTOF = new controllers.javascript.ReverseHomeControllerSTOF(RoutesPrefix.byNamePrefix());
  }

}