package functional_programming;

import functional_programming.task2_filtering_users.BuildingListOfUsers;
import functional_programming.task3_Movies.MoviesProcessing;

public class Main {
    public static void main(String[] args) {
        BuildingListOfUsers.makeUsersList();
        MoviesProcessing.buildMovieList();
    }
}
