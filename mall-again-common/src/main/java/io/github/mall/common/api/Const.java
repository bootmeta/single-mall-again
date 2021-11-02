package io.github.mall.common.api;

public enum Const {
    USER_AGENT("user-agent"),UTF8("utf-8"),
    APP_JSON("application/json"),SYS_ADMIN("admin"),
    LOGIN_NAME("loginName");

    private String name;

    private Const(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
