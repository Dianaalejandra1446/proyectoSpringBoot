package com.campuslands.proyectoSpringBoot.repositories.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Envio_ayuda_humanitaria")
public class EnvioAyudaMaterialEntity {
    private Long id_ayuda_material;
   // private List<EnvioMedicamentos> idEnvioMedicamentos;

}
