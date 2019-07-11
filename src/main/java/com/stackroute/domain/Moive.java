package com.stackroute.domain;

public class Moive {
    //actor class instantiation
    Actor actor;
    public void setActor(Actor actor) {
        this.actor = actor;
    }
    //display actor details using movie method
public void moiveDisplay(){
    System.out.println("display using movie class");
    actor.display();
}


}
