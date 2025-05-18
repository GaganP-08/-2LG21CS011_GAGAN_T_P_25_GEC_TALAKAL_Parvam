package com.example.JoyToyFactroy.Controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.JoyToyFactroy.Model.Contact;
import com.example.JoyToyFactroy.Repository.ContactRepository;
import com.example.JoyToyFactroy.Service.ContactMessageService;

@Controller
@RequestMapping("/joytoyfactory")
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    @Autowired
    private ContactMessageService contactMessageService;

    @GetMapping("/contact")
    public String showContactPage() {
        return "contact"; // This maps to contact.html inside templates/
    }

    @SuppressWarnings("unused")
    @PostMapping("/submitContact")
    public String submitContact(@ModelAttribute Contact contact) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedNow = now.format(formatter);

        contact.setCreated_by("Website User");
        contact.setModified_by("Website User");
        contact.setDelete_status("Active");

        contactRepository.save(contact);

        // Optional service layer
        contactMessageService.saveMessage(contact);

        return "redirect:/joytoyfactory/contact?success"; // redirect with success
    }
}
