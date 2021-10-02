/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spboot.tugas.interfaces;

import com.spboot.tugas.models.Iventories;
import java.util.List;

/**
 *
 * @author Asus
 */
public interface IventoriesInterface {
    List<Iventories> getAll();
    void store(Iventories iventories);
    Iventories getById(long id);
    void delete(long id);
}
