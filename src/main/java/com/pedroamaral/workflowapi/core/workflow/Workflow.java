package com.pedroamaral.workflowapi.core.workflow;

import java.util.ArrayList;
import java.util.List;

public class Workflow<INPUT, CONTEXT, OUTPUT> {

    private final INPUT input;
    private final CONTEXT context;
    private final List<StepWorkflow<?, CONTEXT, ?>> steps = new ArrayList<>();


    public Workflow(INPUT input, CONTEXT context) {
        this.input = input;
        this.context = context;
    }

    public Workflow<INPUT, CONTEXT, OUTPUT> addStep(StepWorkflow<?, CONTEXT, OUTPUT> step) {
        Workflow<INPUT, CONTEXT, OUTPUT> newWorkflow = new Workflow<>(input, context);
        newWorkflow.steps.addAll(this.steps);
        newWorkflow.steps.add(step);
        return newWorkflow;
    }

    public OUTPUT execute() {
        Object currentInput = this.input;

        for (StepWorkflow step : steps) {
            currentInput = step.execute(currentInput, context);
        }

        return (OUTPUT) currentInput;
    }


}
