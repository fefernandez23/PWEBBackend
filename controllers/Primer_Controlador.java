package com.uci.Proyecto_Final.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.uci.Proyecto_Final.models.medicamento;
import com.uci.Proyecto_Final.services.IControl_Servicio;

import java.util.LinkedList;
import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping(path = { "index/", "" })

public class Primer_Controlador {

    private final IControl_Servicio _medicamentoServicio;

    @RequestMapping(method = RequestMethod.GET, name = "test", path = "")
    public String firstReturn(Model model) {
        model.addAttribute("medicamento", _medicamentoServicio.getAllMedicamentos());
        // model.addAttribute("title", "Titulo de la obra");
        // model.addAttribute("desciption", "Lorem voluptate cumque incidunt.");
        model.addAttribute("", "");
        model.addAttribute("", "/index");
        return "layout";
    }

    @RequestMapping(method = RequestMethod.POST, name = "testPost", path = "create")
    public String createNewMedicamentoString(@ModelAttribute medicamento medicamento, Model model) {
        _medicamentoServicio.createMedicamento(medicamento);
        return "redirect:/test/";
    }

    @RequestMapping(method = RequestMethod.GET, name = "testCreate", path = "create")
    public String getCreateTheater(Model model) {
        model.addAttribute("medicamento", new medicamento());
        model.addAttribute("", "pages/index");
        return "layout";
    }

}