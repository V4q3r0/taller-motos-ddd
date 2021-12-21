package co.com.sofka.generico;

import java.time.Instant;
import java.util.Objects;

public abstract class DomainEvent {
    private String type;
    private Instant date;
    private Id aggregateId;

    protected DomainEvent(String type){
        this.type = Objects.requireNonNull(type);
        this.date = Instant.now();
    }

    public Instant getDate(){
        return date;
    }

    public String getType(){
        return type;
    }

    public Id getAggregateId() {
        return aggregateId;
    }

    public void setAggregateId(Id aggregateId){
        this.aggregateId = aggregateId;
    }
}
