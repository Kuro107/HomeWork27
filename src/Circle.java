public class Circle implements Action{
    private final String circle = "Круг";
    @Override
    public String DoThis() {
        return "Рисуемый " + circle ;
    }
}
