package at.refuggescod.amazinghelloworld.helloworld;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {

    private Hello hello;
    private World world;

    public HelloWorld(Hello hello, World world) {
        this.hello = hello;
        this.world = world;
    }

    public String sayhelloworld(){

        String sayhello = hello.sayhello();
        String sayworld = world.sayworld();

        return  sayhello + " " + sayworld;
    }
}
