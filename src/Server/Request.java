package Server;

import User.User;

public class Request<T> {
    public User requesterId;

    public T request;

    public String payload;
}
