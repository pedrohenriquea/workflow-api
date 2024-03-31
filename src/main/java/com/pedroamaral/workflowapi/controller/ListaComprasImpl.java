package com.pedroamaral.workflowapi.controller;

import com.pedroamaral.workflowapi.core.workflow.models.Context;
import com.pedroamaral.workflowapi.domain.ListaComprasWorkflowFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ListaComprasImpl {

    private final ListaComprasWorkflowFactory listaComprasWorkflowFactory;

    public ListaComprasImpl(ListaComprasWorkflowFactory listaComprasWorkflowFactory) {
        this.listaComprasWorkflowFactory = listaComprasWorkflowFactory;
    }

    @GetMapping("/lista-compras")
    public ResponseEntity<List<String>> getListaCompras() {
        var workflow = listaComprasWorkflowFactory.getWorkflow(null,new Context());
        return new ResponseEntity<>(workflow.execute(), HttpStatus.OK);
    }
}
