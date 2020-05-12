package interfaces;

import models.JsonElement;
import models.XmlElement;

public interface Visitor {
  public void visit(XmlElement xe);
  public void visit(JsonElement je);
}
