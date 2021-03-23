package com.etech.poc.voitures.config.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.GlobalMethodSecurityConfiguration;

/**
 *
 * @author a.safidy
 */
@Configuration
@EnableGlobalMethodSecurity(
		prePostEnabled = true,
		securedEnabled = true,
		jsr250Enabled = true)
public class MethodSecurityConfig
		extends GlobalMethodSecurityConfiguration {
}
