package com.shamalweerasooriya.reviewverine_auth.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing
public class JpaConfig {
    // This configuration enables JPA auditing for automatic timestamping
}
