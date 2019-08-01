# Directory Demo

### Step 1 - Fork this repo !!!
### Step 2 - Clone this repo !!!!
### Step 3 - Create a branch
In terminal do the following

```
git branch feature/{insert-your-name}
```

### Step 4 - Create your own Service 

1. Create a package inside of the ```hbcu.stay.ready.directoryweb```
2. Give the package a unique name like ```hook.tariq.service```
3. Create a Class like the bellow example: ```YourFirstNameService```

Here is an example

```
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
```

### Step 5 - Run the program

Once the program is running open your browser and go to [here](http://localhost:8080/)

### Step 6 - Create a Pull Request on Github