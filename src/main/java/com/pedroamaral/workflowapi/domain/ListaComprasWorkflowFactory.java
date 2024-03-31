package com.pedroamaral.workflowapi.domain;

import com.pedroamaral.workflowapi.core.workflow.IWorkflow;
import com.pedroamaral.workflowapi.core.workflow.Workflow;
import com.pedroamaral.workflowapi.core.workflow.models.Context;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListaComprasWorkflowFactory implements IWorkflow<Void, Context, List<String>> {

    private final IniciarListaComprasStepWorkflow iniciarListaComprasStepWorkflow;
    private final AdicionarBabanaStepWorkflow adicionarBabanaStepWorkflow;
    private final AdicionarPeraStepWorkflow adicionarPeraStepWorkflow;
    private final AdicionarUvaStepWorkflow adicionarUvaStepWorkflow;

    public ListaComprasWorkflowFactory(IniciarListaComprasStepWorkflow iniciarListaComprasStepWorkflow, AdicionarBabanaStepWorkflow adicionarBabanaStepWorkflow, AdicionarPeraStepWorkflow adicionarPeraStepWorkflow, AdicionarUvaStepWorkflow adicionarUvaStepWorkflow) {
        this.iniciarListaComprasStepWorkflow = iniciarListaComprasStepWorkflow;
        this.adicionarBabanaStepWorkflow = adicionarBabanaStepWorkflow;
        this.adicionarPeraStepWorkflow = adicionarPeraStepWorkflow;
        this.adicionarUvaStepWorkflow = adicionarUvaStepWorkflow;
    }

    @Override
    public Workflow<Void, Context, List<String>> getWorkflow(Void s, Context context) {
        return new Workflow<Void, Context, List<String>>(s, context)
                .addStep(iniciarListaComprasStepWorkflow)
                .addStep(adicionarBabanaStepWorkflow)
                .addStep(adicionarPeraStepWorkflow)
                .addStep(adicionarUvaStepWorkflow);
    }
}
