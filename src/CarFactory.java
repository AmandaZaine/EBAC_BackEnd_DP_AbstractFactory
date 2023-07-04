public class CarFactory extends Factory {
    @Override
    Car retrieveCar(String requestedGrade) {
        switch (requestedGrade) {
            case "A":
                return new Volkswagem(100, "full", "gray");
            case "B":
                return new Toyota(400, "full", "white");
            default:
                System.out.println("The requested car was unfortunately not available");
                return null;
        }
    }
}
