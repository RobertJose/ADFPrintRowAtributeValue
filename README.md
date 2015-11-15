## ADFPrintRowAtributeValue

# Steps

1- Create a base class that extend from "oracle.jbo.server.ViewRowImpl"

2 - In Jdeveloper, right clic on the model project 
    -> ADF Business Components
    -> Class Base

then in the viewObject row seccion replace 'oracle.jbo.server.ViewRowImpl' for your custom base class created in the step one.

3- In the custom base class  must make Override the toString() method with the following code:

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < getAttributeValues().length; i++) {
            sb.append("[" + getAttributeNames()[i].toString() + " = " + getAttributeValues()[i].toString() + "]");
        }
        return sb.toString();
    }
    
  Result : 
    When printing the row.toString()
    have the following result : [DepartmentId = 876][DepartmentName = robert][ManagerId = 100][LocationId = 1700]
