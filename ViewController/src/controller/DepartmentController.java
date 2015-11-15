package controller;

import javax.faces.event.ActionEvent;

import model.view.DepartmentsViewRowImpl;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;

public class DepartmentController {
    public DepartmentController() {
    }

    public void printRowInformation(ActionEvent actionEvent) {
        DCBindingContainer bindings = (DCBindingContainer) BindingContext.getCurrent().getCurrentBindingsEntry();

        DCIteratorBinding iteratorBinding = (DCIteratorBinding) bindings.get("DepartmentsView1Iterator");

        DepartmentsViewRowImpl row = (DepartmentsViewRowImpl) iteratorBinding.getCurrentRow();
        System.err.println(row.toString());
    }
}
