package net.mateusgabi.AppPippo;

import ro.pippo.core.Pippo;

/**
 * @author Mateus Gabi Moreira <mateusgabimoreira@gmail.com>
 *         on 14/09/2017.
 */
public class BasicDemo {

    public static void main(String[] args) {
        Pippo pippo = new Pippo(new AppExample());
        pippo.getServer().setPort(0);
        pippo.start();

        System.out.println("Deployed on: https://localhost:" + args[0]);
    }

}
