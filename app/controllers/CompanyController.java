package controllers;

import play.mvc.Controller;

@Security.Authenticated(NeedRoleAccounting.class)
public class CompanyController extends Controller {

}
