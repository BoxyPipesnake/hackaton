package com.cultivoservice.cultivos.controllers;

import com.cultivoservice.cultivos.model.entity.calculoriego;
import com.cultivoservice.cultivos.model.entity.cultivo;
import com.cultivoservice.cultivos.model.entity.usuario;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@RestController
@RequestMapping("/api-cultivo")
public class controllercultivo {
    @PostMapping("/calculoriego")
    public usuario calculoriego(@RequestBody usuario use) throws IOException, CsvValidationException {
        usuario user = use;
        String csvFilePath = "static/cvagua.csv";
        ClassPathResource resource = new ClassPathResource(csvFilePath);
        FileReader fileReader = new FileReader(resource.getFile());
        CSVReader csvReader = new CSVReaderBuilder(fileReader)
                .withSkipLines(1) // Omitir la primera línea (encabezado)
                .build();
        String[] line;
        while ((line = csvReader.readNext()) != null) {
            String cultivoCSV = line[0];
            Double aguaPlanta;
            Integer duracionCosecha;
            Integer densidadHectarea;
            Integer horasRiego;

            // Intentar convertir los valores en números
            try {
                aguaPlanta = Double.parseDouble(line[1]) / 1000;
                duracionCosecha = Integer.parseInt(line[2]);
                densidadHectarea = Integer.parseInt(line[3]);
                horasRiego = Integer.parseInt(line[4]);
            } catch (NumberFormatException e) {
                // Ignorar la línea si no se pueden convertir los valores en números
                continue;
            }

            // Comparar el tipo de cultivo con los tipos del archivo CSV
            for (cultivo c : user.getCultivo()) {
                if (c.getCultivo().equalsIgnoreCase(cultivoCSV)) {
                    System.out.println("id " + user.getId());
                    System.out.println("nombe " + user.getNombre());
                    System.out.println("hectareas=  " + c.getHectareas());
                    System.out.println("listros almacenados = " + c.getLitros());

                    System.out.println("informacion de cultivo");
                    System.out.println("Cultivo: " + c.getCultivo());
                    System.out.println("Agua por planta (L): " + aguaPlanta);
                    System.out.println("Duración de cosecha: " + duracionCosecha);
                    System.out.println("Densidad por hectárea: " + densidadHectarea);
                    System.out.println("Horas de riego: " + horasRiego);
                    Integer dia = (int) ((aguaPlanta * 2) * (horasRiego * densidadHectarea) * c.getHectareas());
                    System.out.println("dia = " + dia);
                    Integer ciclo = dia * duracionCosecha;
                    System.out.println("agua consumida por ciclo de cultivo = " + ciclo);


                    System.out.println();
                    break; // Salir del bucle una vez se encuentre el cultivo correspondiente
                }
            }
        }

        return user;
    }


}
