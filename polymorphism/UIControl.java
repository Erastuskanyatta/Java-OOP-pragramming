public class UIControl {
    private boolean isEnabled = true;

    public class render(){

    }

    public UIControl (boolean  isEnabled){
        this. isEnabled =  isEnabled;
        System.out.println("UIControl");
    }
    public void Enable(){
        isEnabled = true;
    }
    public void Disable(){
        isEnabled = false;
    }
    public boolean isEnabled() {
        return isEnabled;
    }
}