package cn.tx.model;

import lombok.Data;

import java.util.Date;

@Data
public class Emp {

    private int pid;

    private String username;

    private String password;

    private int gender;

    private Date birth;

    private  String pAddr;


}
