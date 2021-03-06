package com.avdhoot.springmailservice;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class entity {
    
    private String toEmail;
    private String subject;
    private String body;
    private MultipartFile file;
}
