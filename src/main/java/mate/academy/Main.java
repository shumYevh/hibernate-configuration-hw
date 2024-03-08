package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService service = (MovieService) injector.getInstance(MovieService.class);
        Movie sherlock = new Movie();
        sherlock.setTitle("Sherlock");
        sherlock.setDescription("Some description");
        service.add(sherlock);

        Movie tarzan = new Movie();
        tarzan.setTitle("Tarzan");
        tarzan.setDescription("Tarzan movie description");
        service.add(tarzan);

        System.out.println(service.get(2L));
    }
}
