package com.example.dummyjson.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

/**
 * Configuração do ValidatorConfig para validação dos objetos
 */
@Configuration
public class ValidatorConfig {

	/**
     * Configura e fornece uma instância de Validator para validação dos beans
     * @return Validator
     */
    @Bean
    public Validator validator() {
        return new LocalValidatorFactoryBean();
    }
}
