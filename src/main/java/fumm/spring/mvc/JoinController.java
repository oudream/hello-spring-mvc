package fumm.spring.mvc;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JoinController {

    @RequestMapping(value = "join/agree", method = RequestMethod.GET)
    public String agree(Model m) {

        return "join/agree";

    }
    @RequestMapping(value = "join/checkme", method = RequestMethod.GET)
    public String checkme(Model m) {

        // 뷰 리졸버에 의해 뷰 단layer에
        // 출력할 jsp파일 이름 지정
        return "join/checkme";
    }

    @RequestMapping(value = "join/joinme", method = RequestMethod.GET)
    public String joinme(Model m) {

        // 뷰 리졸버에 의해 뷰 단layer에
        // 출력할 jsp파일 이름 지정
        return "join/joinme";
    }

    @RequestMapping(value = "join/joinok", method = RequestMethod.GET)
    public String joinok(Model m) {

        // 뷰 리졸버에 의해 뷰 단layer에
        // 출력할 jsp파일 이름 지정
        return "join/joinok";
    }

}