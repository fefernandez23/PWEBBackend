package com.uci.Proyecto_Final.services.implementaciones;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.uci.Proyecto_Final.models.Medicamento;
import com.uci.Proyecto_Final.repo.IMedicamento_Repository;
import com.uci.Proyecto_Final.services.IControl_Servicio;

import ch.qos.logback.classic.pattern.Util;
import lombok.RequiredArgsConstructor;

@Transactional
@Service
@RequiredArgsConstructor
public class Servicio implements IControl_Servicio {

    public final IMedicamento_Repository _repository;

    /*
     * (non-Javadoc)
     * 
     * @see com.uci.Proyecto_Final.services.IControl_Servicio#getAllMedicamentos()
     */

    @Override
    public List<Medicamento> getAllMedicamentos() {
        return _repository.findAll();
    }

    @Override
    public Medicamento getOneMedicamento(String id) {
        return _repository.findById(id).orElseThrow(::new);
    }

    @Override
    public Medicamento createMedicamento(Medicamentod medicamentod) {
        Medicamento medicamento = Util.convertToDto(medicamentod, Medicamento.class);
        return _repository.save(medicamento);
    }

    @Override
    public Medicamento updateMedicamento() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean deleteMedicamento() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public List<Medicamento> getAllMedicamentos() {
        // TODO Auto-generated method stub
        return List <Medicamentos>;
    }

    @Override
    public Medicamento createMedicamento(Medicamento medicamento) {
        // TODO Auto-generated method stub
        return null;
    }

}