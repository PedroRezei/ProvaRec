package com.fiec.ProvaRec.models;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityNotFoundException;

public class RoupaRepositorio extends GenericRepositorioImpl<Roupa, String> {

    public RoupaRepositorio(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    Class<Roupa> getMyClass() {
        return Roupa.class;
    }

    @Override
    public Roupa lerPorId(String id) {
        Roupa roupa = super.lerPorId(id);
        if (roupa == null) {
            throw new EntityNotFoundException("Roupa with id " + id + " not found.");
        }
        return roupa;
    }

    @Override
    public void deleta(String id) {
        Roupa roupa = entityManager.find(Roupa.class, id);
        if (roupa == null) {
            throw new EntityNotFoundException("Roupa with id " + id + " not found.");
        }
        super.deleta(id);
    }

    @Override
    public void atualiza(Roupa roupa, String id) {
        Roupa existingRoupa = entityManager.find(Roupa.class, id);
        if (existingRoupa == null) {
            throw new EntityNotFoundException("Roupa with id " + id + " not found.");
        }
        super.atualiza(roupa, id);
    }
}
