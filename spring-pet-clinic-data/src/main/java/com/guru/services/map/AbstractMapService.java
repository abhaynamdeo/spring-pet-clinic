package com.guru.services.map;

import com.guru.services.CrudService;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class AbstractMapService<T, ID>  {
    protected HashMap<ID, T> map = new HashMap<>();


     Set<T> findAll() {
        return new HashSet<>(map.values());
    }


     T findById(ID id) {
        return map.get(id);
    }


     T save(ID id, T object) {
        map.put(id, object);
        return object;
    }


    void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object) );
    }

    public void deleteById(ID id) {
        map.remove(id);
    }
}
