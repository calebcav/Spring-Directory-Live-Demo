package hbcu.stay.ready.directoryweb.service;

import hbcu.stay.ready.directoryweb.domain.DirectoryMsg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@Order(1)
public class DirectoryService {
    private final Logger logger = LoggerFactory.getLogger(DirectoryService.class);

    private ArrayList<DirectoryMsg> directoryMsgs = new ArrayList<>();

    public DirectoryService(){
        this.directoryMsgs = new ArrayList<>();
    }

    public ArrayList<DirectoryMsg> getMessages(){
        return directoryMsgs;
    }

    public void addString(DirectoryMsg msg){
        logger.info("Adding {} to message from ", msg.getFirstName());
        directoryMsgs.add(msg);
    }
}
