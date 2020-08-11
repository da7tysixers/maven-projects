package com.orubele;

/**
 * Created by Emmanuel Orubele Aug 10/2020
 * Thanks to Tim Buchalka
 */

public class MainApplication {
    public static void main(String[] args) {
        final PolitePerson sam = new PolitePerson("Sam");
        final PolitePerson jane = new PolitePerson("jane");


        new Thread(new Runnable(){
            @Override
            public void run() {
                jane.sayHello(sam);
            }
        }).start();

        new Thread(new Runnable(){
            @Override
            public void run() {
                sam.sayHello(jane);
            }
        }).start();

    }

    static class PolitePerson{
        private final String name;

        public PolitePerson(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public synchronized void  sayHello(PolitePerson person){
            System.out.format("%s: %s " + "has said hello to me! %n", this.name, person.getName() );
            person.sayHelloBack(this);
        }

        public synchronized void sayHelloBack(PolitePerson person){
            System.out.format("%s: %s " + "has said hello back to me! %n", this.name, person.getName());
        }
    }

}
