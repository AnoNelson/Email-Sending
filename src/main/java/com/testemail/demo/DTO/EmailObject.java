package com.testemail.demo.DTO;

import java.util.Arrays;

public class EmailObject {

    private String email;
    private String[] cC;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String[] getcC() {
        return cC;
    }

    public void setcC(String[] cC) {
        this.cC = cC;
    }

    @Override
    public String toString() {
        return "EmailObject{" +
                "email='" + email + '\'' +
                ", cC=" + Arrays.toString(cC) +
                '}';
    }
}
