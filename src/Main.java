public class Main {
    public static void main(String[] args) {
        SolarSystem inception=new SolarSystem();
        inception.sun=1;
        inception.moon=4;
        inception.planets=9;

        System.out.println("The Basic structure is ready");

        //    developing the feature SUN
        SUN omaro=new SUN();
        omaro.temperature="12334433kj";
        omaro.name="ferro";
        omaro.radius="12344555454545455454";
        omaro.color="pink";


        // developing Planet 1
        Planet1 superPlanet=new Planet1();
        superPlanet.color="magenta";
        superPlanet.name="hash";
        superPlanet.size="545488km";


    }
}