package com.oyarce.heroes.controller;

import com.oyarce.heroes.dto.HeroeDto;
import com.oyarce.heroes.service.HeroesServiceArchivo;
import com.oyarce.heroes.service.IHeroesService;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class HeroesController {
    @FXML
    public TextField txtId;

    @FXML
    public TextField txtNombre;

    @FXML
    public TableView<HeroeDto> TableHeroes;

    @FXML
    public TableColumn<HeroeDto, Integer> colId;

    @FXML
    public TableColumn<HeroeDto, String> colNombre;

    private IHeroesService heroesService;

    public HeroesController() {
        this.heroesService = new HeroesServiceArchivo();
    }

    @FXML
    public void handleCrear(MouseEvent mouseEvent) {
        long id = System.currentTimeMillis();
        String nombre = txtNombre.getText();
        HeroeDto heroeDto = new HeroeDto(id, nombre);
        this.heroesService.crearHeroe(heroeDto);
    }

    @FXML
    public void handleSelecionado(MouseEvent mouseEvent) {
        System.out.println(this.heroesService.obtenerHeroes().size());
        for (HeroeDto heroe : this.heroesService.obtenerHeroes()) {
            System.out.println();
        }
    }
}
