package controllers;

import play.*;
import play.mvc.*;
import play.data.validation.*;

import java.util.*;

import models.*;

public class Application extends Controller {

	public static void index() {
		render();
	}

	public static void enterDemo(@Required String user) {
		if (validation.hasErrors()) {
			flash.error("Please choose a nick name and the demonstration type…");
			index();
		}
		WebSocket.room(user);
	}

}