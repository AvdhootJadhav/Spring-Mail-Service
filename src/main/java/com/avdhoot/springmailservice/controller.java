package com.avdhoot.springmailservice;

import java.io.IOException;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sendmail")
public class controller {
    
    @Autowired
    private EmailSenderService service;

    @PostMapping("/simple")
    public String simplemail(@RequestBody entity en){
        service.sendSimpleMail(en.getToEmail(), en.getBody(), en.getSubject());
        return "Simple Mail send";
    }

    @PostMapping("/advance")
    public String advancemail(@ModelAttribute entity en) throws MessagingException, IOException{
        service.mailWithAttachments(en.getToEmail(), en.getBody(), en.getSubject(), en.getFile());
        return "Attachment Mail send";
    }

}
