package net.mateusgabi.AppExamplePippo;

import ro.pippo.core.Application;

/**
 * @author Mateus Gabi Moreira <mateusgabimoreira@gmail.com>
 *         on 14/09/2017.
 */
public class AppExample extends Application {

    @Override
    protected void onInit() {

        GET("/", routeContext -> routeContext.send("Hello World"));

    }
}
