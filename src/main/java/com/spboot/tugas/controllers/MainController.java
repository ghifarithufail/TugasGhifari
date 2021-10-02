/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spboot.tugas.controllers;

import com.spboot.tugas.interfaces.IventoriesInterface;
import com.spboot.tugas.models.Iventories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Asus
 */
@Controller
public class MainController {

    @Autowired
    private IventoriesInterface iventoriesInterface;
    
    @GetMapping("/iventories/{id}/edit")
public String edit(@PathVariable(value = "id") long id, Model model) {
  Iventories iventories = iventoriesInterface.getById(id);

  model.addAttribute("iventories", iventories);
  return "edit";
}

@PostMapping("/iventories/{id}/delete")
public String delete(@PathVariable(value = "id") long id) {
  iventoriesInterface.delete(id);
  return "redirect:/";
}

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("list", iventoriesInterface.getAll());
        return "index";
    }

    @GetMapping("/iventories/create")
    public String create(Model model) {
        
        Iventories iventories = new Iventories();
        model.addAttribute("iventories", iventories);
        
        return "create";
    }

    @PostMapping("/iventories/store")
    public String store(@ModelAttribute("iventories") Iventories iventories) {
        iventoriesInterface.store(iventories);
        return "redirect:/";
    }
}
