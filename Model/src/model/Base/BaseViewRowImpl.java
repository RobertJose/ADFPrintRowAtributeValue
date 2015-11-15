package model.Base;

public class BaseViewRowImpl extends oracle.jbo.server.ViewRowImpl {
    public BaseViewRowImpl() {
        super();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < getAttributeValues().length; i++) {
            sb.append("[" + getAttributeNames()[i].toString() + " = " + getAttributeValues()[i].toString() + "]");
        }
        return sb.toString();
    }
}
