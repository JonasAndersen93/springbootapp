package com.boot.controller;

import com.boot.model.Shipwreck;
import com.boot.repository.ShipwreckRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class ShipwreckController {

    @Autowired
    private ShipwreckRepository shipwreckRepository;

    @RequestMapping(value ="shipwrecks",method=RequestMethod.GET)
    public List<Shipwreck> list(){

        //return shipwreckRepository.findAll();
        return ShipwreckStub.list();
    }

    @RequestMapping(value = "shipwrecks", method = RequestMethod.POST)
    public Shipwreck create(@RequestBody Shipwreck shipwreck){
        //return shipwreckRepository.saveAndFlush(shipwreck);
        return ShipwreckStub.create(shipwreck);
    }

    @RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.GET)
    public Shipwreck get(@PathVariable Long id){
        //return shipwreckRepository.getOne(id);
        return ShipwreckStub.get(id);
    }
    @RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.PUT)
    public Shipwreck update(@PathVariable Long id, @RequestBody Shipwreck shipwreck){
        /*Shipwreck existingShipWreck = shipwreckRepository.findOne(id);
        BeanUtils.copyProperties(shipwreck,existingShipWreck);
        return shipwreckRepository.saveAndFlush(existingShipWreck);*/
        return ShipwreckStub.update(id,shipwreck);
    }
    @RequestMapping(value = "shipwrecks/{id}",method=RequestMethod.DELETE)
    public Shipwreck delete(@PathVariable Long id){
        /*Shipwreck existingShipwreck = shipwreckRepository.findOne(id);
        shipwreckRepository.delete(existingShipwreck);
        return existingShipwreck;*/
        return ShipwreckStub.delete(id);
    }

}
