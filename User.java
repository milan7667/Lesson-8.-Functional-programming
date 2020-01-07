package functional_programming.task2_filtering_users;

import java.time.LocalDate;

public class User {
    private String email;
    private LocalDate loginDate;
    private char team;

    public User(String email, LocalDate loginDate, char team) {
        this.email = email;
        this.loginDate = loginDate;
        this.team = team;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getLoginDate() {
        return this.loginDate;
    }

    public void setLoginDate(LocalDate loginDate) {
        this.loginDate = loginDate;
    }

    public char getTeam() {
        return this.team;
    }

    public void setTeam(char team) {
        this.team = team;
    }
}