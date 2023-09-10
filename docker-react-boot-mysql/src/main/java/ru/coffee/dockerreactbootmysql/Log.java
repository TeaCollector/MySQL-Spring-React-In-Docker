package ru.coffee.dockerreactbootmysql;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "request_log")
public class Log implements Serializable {

    private Long id;
    private LocalDateTime created;

    public Log() {
    }

    public Log(Long id, LocalDateTime created) {
        this.id = id;
        this.created = created;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }
}
