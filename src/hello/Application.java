package hello;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

public class Application {
	public static void main(String[] args) {
	    ActorSystem system = ActorSystem.create("Hello");
	    ActorRef a = system.actorOf(Props.create(HelloWorld.class), "helloWorld");
	    //system.actorOf(Props.create(Terminator.class, a), "terminator");
	  }

}
