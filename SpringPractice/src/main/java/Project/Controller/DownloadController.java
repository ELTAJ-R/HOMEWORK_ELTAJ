package Project.Controller;


import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class DownloadController {
    @GetMapping("/download/*")
    public ResponseEntity<Resource> handle3(){
        Resource resource = new ClassPathResource("login.html");
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION,
                        String.format("attachment; filename=\"%s\"",resource.getFilename()))
                .body(resource);
    }

    @GetMapping("/cookies/*")
    public String handle4(HttpSession session){
        String id = session.getId();
        session.setMaxInactiveInterval(1);
        return id;

    }
}
