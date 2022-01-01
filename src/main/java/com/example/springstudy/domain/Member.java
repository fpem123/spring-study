package com.example.springstudy.domain;

import javax.persistence.*;

@Entity // 오브젝트 매핑
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // DB가 자동으로 관리
    private long id;
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
