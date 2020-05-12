package models;

import interfaces.Element;
import interfaces.Visitor;

public class XmlElement implements Element {

  public String uuid;

  @Override
  public void accept(Visitor v) {
    // TODO Auto-generated method stub
    v.visit(this);
  }
}
