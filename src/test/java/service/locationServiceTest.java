package service;

import entity.Film;
import entity.location;
import entity.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.DataUtils;

import java.util.Date;

public class locationServiceTest {
    @Test
    public void test() {

        locationService service = new locationService();
        User user = new User("Guilherme Rocha");
        Film film = new Film("Spider-Man", 2, 5.0);


        location location = service.rentMovie(user, film);

        Assertions.assertTrue(location.getValor() == 5.0);
        Assertions.assertTrue(DataUtils.isSameDate(location.getDataLocacao(), new Date()));
        Assertions.assertTrue(DataUtils.isSameDate(location.getDataRetorno(), DataUtils.getDateWithDifferenceDays(1)));
    }
}
