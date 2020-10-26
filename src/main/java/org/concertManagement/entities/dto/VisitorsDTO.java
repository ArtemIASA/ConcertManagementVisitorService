package org.concertManagement.entities.dto;

import org.concertManagement.entities.Visitor;

import java.util.List;

public class VisitorsDTO {
    private List<Visitor> visitors;

    public List<Visitor> getVisitors() {
        return visitors;
    }

    public void setVisitors(List<Visitor> visitors) {
        this.visitors = visitors;
    }
}
