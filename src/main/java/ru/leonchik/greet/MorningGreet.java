package ru.leonchik.greet;

import ru.leonchik.net.Greetable;

public class MorningGreet extends Greetable {
    @Override
    public String buildResponse(String userName) {
        return "Good morning " + userName;
    }
}
