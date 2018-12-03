package io.codementor.gtommee.rest_tutorial.models;

import org.springframework.data.annotation.Id;

public class User{
    @Id
    public Integer _id;
    public String name;
    public String account;

    public User(Integer _id, String name, String account) {
        this._id = _id;
        this.name = name;
        this.account = account;
    }
    public User(){

    }
    public Integer get_id() {
        return _id;
    }

    public void set_id(Integer _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
