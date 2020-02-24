package com.infosys.model;


import java.io.Serializable;
import java.util.Objects;

import javax.persistence.*;

import com.infosys.model.Role;
//things 
@Entity
@Table
public class Role implements Serializable{

@Id
@Column
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int roleid;


@Column
private String role;

public Role(){
    super();
}

    public int getRoleid() {
        return this.roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "{" +
            " roleid='" + getRoleid() + "'" +
            ", role='" + getRole() + "'" +
            "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Role)) {
            return false;
        }
        Role role = (Role) o;
        return roleid == role.roleid && Objects.equals(role, role.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleid, role);
    }

    public Role(int roleid, String role) {
        this.roleid = roleid;
        this.role = role;
    }


}