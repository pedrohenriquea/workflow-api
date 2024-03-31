package com.pedroamaral.workflowapi.core.workflow;


public interface IWorkflow<INPUT, CONTEXT, OUTPUT> {

    Workflow<INPUT, CONTEXT, OUTPUT> getWorkflow(INPUT input, CONTEXT context);

}
