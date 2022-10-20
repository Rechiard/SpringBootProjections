package sboot.model;

import lombok.Data;

import java.util.Date;

@Data
public class Person {
    private int pid;
    private String pname;
    private String addr;
    private int gender;
    private Date birth;
}

