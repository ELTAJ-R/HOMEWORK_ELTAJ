package Project.Controller;



import lombok.SneakyThrows;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/file/*")
public class UploadController {

    @GetMapping("/login/*")
    public String handle1(){
        return "login";

    }
@SneakyThrows
    @PostMapping("/*")
    public void handle2(@RequestParam("file")MultipartFile file){
        byte[] bytes = file.getBytes();
        String s = new String(bytes);
    System.out.printf("%sfile name file content  %s  ",file.getOriginalFilename(),s);
    }
    @GetMapping("/*")
    public String handle(){
        return "file";
    }

}
