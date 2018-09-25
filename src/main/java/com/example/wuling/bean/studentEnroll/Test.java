package com.example.wuling.bean.studentEnroll;

import javax.validation.constraints.NotEmpty;

public class Test {
    @NotEmpty
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
