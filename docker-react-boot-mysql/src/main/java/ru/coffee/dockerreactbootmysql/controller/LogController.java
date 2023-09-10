package ru.coffee.dockerreactbootmysql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.coffee.dockerreactbootmysql.Log;
import ru.coffee.dockerreactbootmysql.repository.LogRepository;

import java.util.logging.Logger;

@RestController
@RequestMapping("/log")
public class LogController {

    private final static Logger LOG = Logger.getLogger(LogController.class.getName());

    private final LogRepository repository;

    @Autowired
    public LogController(LogRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public ResponseEntity<Log> log() {
        Log log = repository.save(new Log());
        LOG.info("saved new log: " + log.toString());
        return ResponseEntity.ok(log);
    }
}
