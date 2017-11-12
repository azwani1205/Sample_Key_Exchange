/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activity;

/**
 *
 * @author ZAMRI
 */
public class Main {

    public static void main(final String[] args) throws Exception {
        //To show the application is started
        System.out.println("The application is started");
        new Main().init();
    }

    private void init() {
        
        final Person alice = new Person();
        final Person bob   = new Person();

        alice.generateKeys();
        bob.generateKeys();

        alice.receivePublicKeyFrom(bob);
        bob.receivePublicKeyFrom(alice);

        alice.generateCommonSecretKey();
        bob.generateCommonSecretKey();

        alice.encryptAndSendMessage("Bob! Guess Who I am.", bob);

        bob.whisperTheSecretMessage();

    }
}

