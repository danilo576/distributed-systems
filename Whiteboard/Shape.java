import java.io.Serializable;

@SuppressWarnings("serial")
public class Shape implements Serializable {

  private String type;
  private String lineColor;
  private String fillColor;
  private boolean filled;

  public Shape(String type, String lineColor, String fillColor, boolean filled) {
    super();
    this.type = type;
    this.lineColor = lineColor;
    this.fillColor = fillColor;
    this.filled = filled;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getLineColor() {
    return lineColor;
  }

  public void setLineColor(String lineColor) {
    this.lineColor = lineColor;
  }

  public String getFillColor() {
    return fillColor;
  }

  public void setFillColor(String fillColor) {
    this.fillColor = fillColor;
  }

  public boolean isFilled() {
    return filled;
  }

  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  @Override
  public String toString() {
    return "Shape [type=" + type + ", lineColor=" + lineColor + ", fillColor=" + fillColor + ", filled=" + filled + "]";
  }
 

}
