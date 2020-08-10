package com.orubele;

/**
 * Created by Emmanuel Orubele Aug 10/2020
 * Thanks to Tim Buchalka
 */

public class MainApplication {
    public static void main(String[] args) {
        Politeperson person = new Politeperson("Sam");
        person.sayHello(person);
        person.sayHelloBack(person);
    }

    static class Politeperson{
        private final String name;

        public Politeperson(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public synchronized void  sayHello(Politeperson person){
            System.out.format("%s: %s " + "has said hello to me! %n", this.name, person.getName() );
        }

        public synchronized void sayHelloBack(Politeperson person){
            System.out.format("%s: %s " + "has said hello back to me! %n", this.name, person.getName());
        }
    }

}
