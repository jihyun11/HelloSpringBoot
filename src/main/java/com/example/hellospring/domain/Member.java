package com.example.hellospring.domain;

import jakarta.persistence.*;
import org.hibernate.annotations.Generated;

@Entity
public class Member {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) //DB가 알아서 생성해주는 아이덴티티 전략
    private Long id;

    private String name;

    private int money;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
