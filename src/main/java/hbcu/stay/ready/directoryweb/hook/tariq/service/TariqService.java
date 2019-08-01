package hbcu.stay.ready.directoryweb.hook.tariq.service;

import hbcu.stay.ready.directoryweb.domain.DirectoryMsg;
import hbcu.stay.ready.directoryweb.service.DirectoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class TariqService {

    private final Logger logger = LoggerFactory.getLogger(TariqService.class);

    private DirectoryService directoryService;

    @Autowired
    public TariqService(DirectoryService directoryService){
        this.directoryService = directoryService;
    }

    @PostConstruct
    public void init(){
        logger.info("Init");
        DirectoryMsg msg = new DirectoryMsg("Tariq","Code Rhino", 41, "Love Island", "Wutang Clan");
        directoryService.addString(msg);
    }
}
