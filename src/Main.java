public class Main {
    public static void main(String[] args) {
        BasicStructure audi=new BasicStructure();
        audi.color="black";
        audi.model="A3";
        audi.power="5000cc";

        Engine x=new Engine();
        x.cylinders="8";
        x.size="big";
        x.weight="heavy";

        lights v=new lights();
        v.color="red";
        v.size="supersized";
        v.intensity="very intense";
    }
}