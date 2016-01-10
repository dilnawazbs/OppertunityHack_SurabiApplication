package com.surabhi.domain;

import org.springframework.data.annotation.Id;

public abstract class AbstractDBRecord implements UniqueId {

    @Id
    protected String id;

    /**
     * Zero argument constructor.
     */
    public AbstractDBRecord() {
        super();
    }

    /**
     * All argument constructor.
     * 
     * @param id the primary key
     */
    public AbstractDBRecord(String id) {
        super();
        this.id = id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getId() {
        return id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setId(String i) {
        this.id = i;
    }
}
