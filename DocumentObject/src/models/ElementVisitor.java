package models;

import interfaces.Visitor;

public class ElementVisitor implements Visitor {

  @Override
  public void visit(XmlElement xe) {
    // TODO Auto-generated method stub
    System.out.println("processing an XML element with uuid: " + xe.uuid);
  }

  @Override
  public void visit(JsonElement je) {
    // TODO Auto-generated method stub
    System.out.println("processing a JSON element with uuid: " + je.uuid);
  }

}
