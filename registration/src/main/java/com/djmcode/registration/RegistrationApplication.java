package com.djmcode.registration;

import com.djmcode.registration.entitie.Role;
import com.djmcode.registration.repo.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.cloud.netflix.eureka.*;

@SpringBootApplication
@EnableJpaAuditing
@EnableAsync
//@EnableEurekaClient
public class RegistrationApplication
{

  public static void main(String[] args)
  {
    SpringApplication.run(RegistrationApplication.class, args);
  }

  @Bean
  CommandLineRunner runner(RoleRepository roleRepository)
  {
    return args -> {
      if (roleRepository.findByName("USER").isEmpty())
      {
        Role role = Role.builder().name("USER").build();
        roleRepository.save(role);
      }

    };
  }
}
