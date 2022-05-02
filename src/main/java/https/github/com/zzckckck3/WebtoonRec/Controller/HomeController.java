package https.github.com.zzckckck3.WebtoonRec.Controller;

import https.github.com.zzckckck3.WebtoonRec.Domain.TestDB;
import https.github.com.zzckckck3.WebtoonRec.Dto.BoardDto;
import https.github.com.zzckckck3.WebtoonRec.Service.BoardService;
import https.github.com.zzckckck3.WebtoonRec.Service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@Controller
public class HomeController {
    private final TestService service;
    @GetMapping("/")
    public String home(){
        return "/fragments/public/home";
    }

    @GetMapping("/test1")
    public Long saveNewTest(@RequestBody TestDB db) {
        return service.TestDB(db);
    }

}