package fumm.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.atomic.AtomicInteger;

///**
@Controller
public class IndexController {

    private static Logger logger = LogManager.getLogger(IndexController.class.getName());

    private static AtomicInteger count = new AtomicInteger(0);

    @RequestMapping(value ="/", method = RequestMethod.GET)
    public String index(Model m){

        if (count.get() == 4) {
            logger.info("index.System.currentTimeMillis(): " + System.currentTimeMillis());
        }

        count.getAndIncrement();
        logger.info("Thread.id: " + Thread.currentThread().getId() + " , count: " + count);
//        synchronized (this) {
//            logger.info("Thread.id: " + Thread.currentThread().getId() + " , count: " + count++);
//        }
        // 뷰 리졸버에 의해 뷰 단 layer 에 출력할
        // jsp 파일 이름 지정

        if (count.get() == 10000) {
            logger.info("index.System.currentTimeMillis(): " + System.currentTimeMillis());
        }
        return "index";
    }
};
//*/

/**
@Controller
public class IndexController {

    private static Logger logger = LogManager.getLogger(IndexController.class.getName());

    private static volatile int count = 0;

    @RequestMapping(value ="/", method = RequestMethod.GET)
    public String index(Model m){

        if (count == 4) {
            logger.info("index.System.currentTimeMillis(): " + System.currentTimeMillis());
        }

        synchronized (this) {
            count++;
        }
        logger.info("Thread.id: " + Thread.currentThread().getId() + " , count: " + count);
        // 뷰 리졸버에 의해 뷰 단 layer 에 출력할
        // jsp 파일 이름 지정

        if (count == 10000) {
            logger.info("index.System.currentTimeMillis(): " + System.currentTimeMillis());
        }
        return "index";
    }
};
//*/
