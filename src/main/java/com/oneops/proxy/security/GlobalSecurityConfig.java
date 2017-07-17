/*******************************************************************************
 *
 *   Copyright 2017 Walmart, Inc.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *******************************************************************************/
package com.oneops.proxy.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

import static org.springframework.core.Ordered.HIGHEST_PRECEDENCE;

/**
 * A Global authentication manager(AM) config for the application.
 *
 * @author Suresh
 */
@Configuration
@Order(HIGHEST_PRECEDENCE)
@EnableGlobalMethodSecurity(securedEnabled = true)
public class GlobalSecurityConfig extends GlobalAuthenticationConfigurerAdapter {

    private static final Logger log = LoggerFactory.getLogger(GlobalSecurityConfig.class);

    @Override
    public void init(AuthenticationManagerBuilder auth) throws Exception {
        log.info("Enabling global security config.");
        // @formatter:off
        auth.inMemoryAuthentication()
                .withUser("ooadmin")
                .password("ooadmin") // For testing only.
                .roles("USER", "ADMIN")
            .and()
                .withUser("oouser")
                .password("oouser")
                .roles("USER");
         // @formatter:on
    }
}