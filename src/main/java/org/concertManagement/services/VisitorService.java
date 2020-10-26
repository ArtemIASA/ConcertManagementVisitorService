package org.concertManagement.services;

import org.concertManagement.entities.Visitor;
import org.concertManagement.repo.VisitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
public class VisitorService {
    private final VisitorRepository visitorRepository;

    @Autowired
    public VisitorService(VisitorRepository visitorRepository) {
        this.visitorRepository = visitorRepository;
    }

    @Transactional
    public void addVisitor(Visitor visitor){
         visitorRepository.save(visitor);
    }

    @Transactional
    public void deleteVisitor(Visitor visitor){
        visitorRepository.delete(visitor);
    }

    @Transactional
    public void deleteVisitor(UUID visitor_id) {
        visitorRepository.deleteById(visitor_id);
    }

    @Transactional
    public List<Visitor> getAllVisitors(){
        return visitorRepository.findAll();
    }
}
