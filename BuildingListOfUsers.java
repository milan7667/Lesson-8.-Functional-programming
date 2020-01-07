package functional_programming.task2_filtering_users;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BuildingListOfUsers {

    public static void makeUsersList() {
        List<User> users = new ArrayList();
        users.add(new User("emailA", LocalDate.of(2020, 1, 7), 'A'));
        users.add(new User("emailB", LocalDate.of(2019, 12, 29), 'B'));
        users.add(new User("emailC", LocalDate.of(2019, 12, 27), 'B'));
        users.add(new User("emailD", LocalDate.of(2019, 12, 11), 'A'));

        Map<Character, List<User>> filteredUsers = users.stream()
                .filter(user -> user.getLoginDate().isAfter(LocalDate.now().minusDays(7)))
                .collect(Collectors.groupingBy(User::getTeam, Collectors.toList()));
        System.out.println(filteredUsers);
    }
}

