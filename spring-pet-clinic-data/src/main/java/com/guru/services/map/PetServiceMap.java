package com.guru.services.map;

import com.guru.services.CrudService;
import com.guru.springpetclinic.model.Pet;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return save(object.getId(), object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }
}
