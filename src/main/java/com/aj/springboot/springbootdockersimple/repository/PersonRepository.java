package com.aj.springboot.springbootdockersimple.repository;

import com.aj.springboot.springbootdockersimple.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
