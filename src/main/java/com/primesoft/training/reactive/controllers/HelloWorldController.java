package com.primesoft.training.reactive.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

class Todo {
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Boolean getCompleted() {
    return completed;
  }

  public void setCompleted(Boolean completed) {
    this.completed = completed;
  }

  private Integer userId;
  private Integer id;
  private String title;
  private Boolean completed;
}

@RestController
@RequestMapping(value = "/profiles", produces = MediaType.APPLICATION_JSON_VALUE)
public class HelloWorldController {
  @GetMapping("/{id}")
  public Mono<Todo> getById(@PathVariable("id") String id) {
    Todo todo = new Todo();
    todo.setCompleted(true);
    todo.setId(1);
    todo.setUserId(1);
    todo.setTitle(id);

    return Mono.just(todo);
  }
}
