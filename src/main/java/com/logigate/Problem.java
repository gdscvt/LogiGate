package com.logigate;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Problem {
    // JPA annotations indicate it is the primary key & is automatically populated
    // by the JPA provider
    private @Id @GeneratedValue Long id;
    private String name;
    private int number;
    @Column(length = 1000)
    private String content; // Allow to store up to 1000 chars in database
    private String slug;

    /**
     * Default constructor
     */
    public Problem() {
    }

    public Problem(String name, int number) {
        this.name = name;
        this.number = number;
        this.content = "Sorry, no content for this question";
        this.slug = "pr-" + this.name.replace(" ", "-").toLowerCase();
    }

    public Problem(String name, int number, String content) {
        this(name, number);
        this.content = content;
        this.slug = "pr-" + this.name.replace(" ", "-").toLowerCase();
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getContent() {
        return this.content;
    }

    public int getNumber() {
        return this.number;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Problem))
            return false;
        Problem Problem = (Problem) o;
        return Objects.equals(this.id, Problem.id) && Objects.equals(this.name, Problem.name)
                && Objects.equals(this.content, Problem.content) && Objects.equals(this.number, Problem.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.content);
    }

    @Override
    public String toString() {
        return "Problem{" + "id=" + this.id + ", name='" + this.name + '\'' + ", content='" + this.content + '\'' + '}';
    }
}