package com.example.JoyToyFactroy.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.JoyToyFactroy.Model.Product;
import com.example.JoyToyFactroy.Repository.ProductRepository;

@Controller
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/add-product")
    public String addProduct(@ModelAttribute Product product, Model model) {
        productRepository.save(product);  // ✅ This works now
        model.addAttribute("message", "Product added successfully!");
        return "redirect:/admin"; // Change to the appropriate success page
    }
}
