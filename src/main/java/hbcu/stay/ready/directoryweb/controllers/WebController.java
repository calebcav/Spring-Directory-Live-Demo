package hbcu.stay.ready.directoryweb.controllers;

import hbcu.stay.ready.directoryweb.domain.DirectoryMsg;
import hbcu.stay.ready.directoryweb.service.DirectoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    DirectoryService directoryService;

    @Autowired
    public WebController(DirectoryService directoryService){
        this.directoryService = directoryService;
    }

    @GetMapping("/")
    public Iterable<DirectoryMsg> data(){
        return directoryService.getMessages();
    }
}
