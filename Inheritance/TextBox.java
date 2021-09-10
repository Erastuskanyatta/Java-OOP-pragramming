public class TextBox extends UIControl {
  private String text = "";
//  private final UIControl;

  public TextBox(){
    super(true);
    System.out.println("TextBox");
  }
  public void setText(String text) {
    this.text = text;
  }
  public void clear() {
    text = "";
  }
}
