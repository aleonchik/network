package ru.leonchik.greet;

import ru.leonchik.net.Greetable;

public class EveningGreet extends Greetable {
    @Override
    public String buildResponse(String userName) {
        return "Good evening " + userName;
    }
}
