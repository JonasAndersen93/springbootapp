package com.boot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Player {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   Long id;

   String name;

   double points;


}
