package com.luohw.springmvc.vo.user;

import java.util.Date;

//用户对象
public class UserVO {
    private String userName;    //用户名称
    private Integer state;  //状态
	private Date registerTime;	//注册时间
	private Integer roleId;     //角色

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}
