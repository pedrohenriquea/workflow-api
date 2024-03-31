package com.pedroamaral.workflowapi.core.workflow;

public interface StepWorkflow<INPUT, CONTEXT, OUTPUT> {


    OUTPUT execute(INPUT input, CONTEXT context);
}
