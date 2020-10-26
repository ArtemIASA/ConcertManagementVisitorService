package org.concertManagement.controllers;

import org.concertManagement.entities.Visitor;
import org.concertManagement.entities.dto.VisitorsDTO;
import org.concertManagement.services.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("services/visitors")
public class VisitorController {
    private final VisitorService visitorService;

    @Autowired
    public VisitorController(VisitorService visitorService) {
        this.visitorService = visitorService;
    }

    @PostMapping
    public ResponseEntity<Void> addVisitor(@RequestBody Visitor visitor){
        visitorService.addVisitor(visitor);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping(params = {"visitor"})
    public ResponseEntity<Void> deleteVisitor(@RequestBody Visitor visitor){
        visitorService.deleteVisitor(visitor);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping(params = {"visitor_id"})
    public ResponseEntity<Void> deleteVisitor(@RequestBody UUID visitor_id){
        visitorService.deleteVisitor(visitor_id);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public @ResponseBody
    VisitorsDTO getAllVisitors(){
        VisitorsDTO visitorsDTO = new VisitorsDTO();
        visitorsDTO.setVisitors(visitorService.getAllVisitors());
        return visitorsDTO;
    }

}
