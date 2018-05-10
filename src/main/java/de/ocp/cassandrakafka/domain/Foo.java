package de.ocp.cassandrakafka.domain;

import com.datastax.driver.mapping.annotations.*;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

/**
 * A Foo.
 */
@Table(name = "foo")
public class Foo implements Serializable {

    private static final long serialVersionUID = 1L;

    @PartitionKey
    private UUID id;

    private String foo;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFoo() {
        return foo;
    }

    public Foo foo(String foo) {
        this.foo = foo;
        return this;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Foo foo = (Foo) o;
        if (foo.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), foo.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Foo{" +
            "id=" + getId() +
            ", foo='" + getFoo() + "'" +
            "}";
    }
}
