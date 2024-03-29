// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAuthenticatedUserController AuthenticatedUserController = new controllers.ReverseAuthenticatedUserController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseContentController ContentController = new controllers.ReverseContentController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseUserController UserController = new controllers.ReverseUserController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeControllerSTOF HomeControllerSTOF = new controllers.ReverseHomeControllerSTOF(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAuthenticatedUserController AuthenticatedUserController = new controllers.javascript.ReverseAuthenticatedUserController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseContentController ContentController = new controllers.javascript.ReverseContentController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseUserController UserController = new controllers.javascript.ReverseUserController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeControllerSTOF HomeControllerSTOF = new controllers.javascript.ReverseHomeControllerSTOF(RoutesPrefix.byNamePrefix());
  }

}
