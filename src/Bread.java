public class Bread implements Action{
    private final String bread = "Хлеб";
    @Override
    public String DoThis() {

        return  "Выпекать " + bread;
    }
}
