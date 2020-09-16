package com.lp.spring.basics.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentDAO {
    @Autowired
    ComponentJdbcConnection jdbcconnection;

    public ComponentJdbcConnection getComponentJdbcconnection() {
        return jdbcconnection;
    }

    public void setComponentJdbcconnection(ComponentJdbcConnection jdbcconnection) {
        this.jdbcconnection = jdbcconnection;
    }
}