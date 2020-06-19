package fumm.spring.mvc;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BoardController {

    // 게시판 - 목록list 출력
    @RequestMapping(value = "board/list", method = RequestMethod.GET)
    public String list(Model m) {

        return "board/list";

    }
}