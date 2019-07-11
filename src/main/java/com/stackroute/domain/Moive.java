package com.stackroute.domain;

public class Moive {
    //actor class instantiation
    private Actor actor;
   public Moive(){
    }

    public Moive(Actor actor) {
        this.actor = actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    //display actor details using movie method
public void moiveDisplay(){
    System.out.println("display using movie class");
    actor.display();
}


}
