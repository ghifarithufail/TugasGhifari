/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spboot.tugas.services;

import com.spboot.tugas.interfaces.IventoriesInterface;
import com.spboot.tugas.models.Iventories;
import com.spboot.tugas.repositories.IventoriesRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Asus
 */
@Service
public class IventoriesService implements IventoriesInterface {
    
    @Override
public Iventories getById(long id) {
  Optional < Iventories > optional = iventoriesRepository.findById(id);

  if (!optional.isPresent()) {
    throw new RuntimeException(" Todo not found for id :: " + id);
  }

  Iventories iventories = optional.get();
  return iventories;
}

@Override
public void delete(long id) {
  this.iventoriesRepository.deleteById(id);
}
    @Autowired
    private IventoriesRepository iventoriesRepository;
    
    @Override
    public List<Iventories> getAll() {
        return iventoriesRepository.findAll();
    }

    @Override
    public void store(Iventories iventories) {
        this.iventoriesRepository.save(iventories);
    }
}