package ru.coffee.dockerreactbootmysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.coffee.dockerreactbootmysql.Log;

public interface LogRepository extends JpaRepository<Log, Long> {
}
