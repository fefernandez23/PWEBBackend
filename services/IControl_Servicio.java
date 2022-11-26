package com.uci.Proyecto_Final.services;

import java.util.List;

import com.uci.Proyecto_Final.models.Medicamento;

public interface IControl_Servicio {
    public List<Medicamento> getAllMedicamentos();

    public Medicamento getOneMedicamento(String id);

    public Medicamento createMedicamento(Medicamento medicamento);

    public Medicamento updateMedicamento();

    public boolean deleteMedicamento();

}
