package edu.cdtc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

/**
 * @author zero
 * @email qianmeng6879@163.com
 * @since 2022/12/6
 */
@Controller
public class UploadController {
    @GetMapping("/upload")
    public String upload(){
        return "upload";
    }
    @ResponseBody
    @PostMapping("/upload/file")
    public Object uploadFile(MultipartFile file){

        String originalFilename = file.getOriginalFilename();
        return Map.of("filename", originalFilename);
    }
}
