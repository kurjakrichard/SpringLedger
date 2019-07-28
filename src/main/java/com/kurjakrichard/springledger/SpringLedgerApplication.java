/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kurjakrichard.springledger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

/**
 *
 * @author balza
 */
@SpringBootApplication
@EnableConfigurationProperties
public class SpringLedgerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringLedgerApplication.class, args);
    }
}
