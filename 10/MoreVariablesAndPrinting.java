public class MoreVariablesAndPrinting{
    public static void main(String[] args){
    String hisName, hisEyes, hisTeeth, hisHair;
    int hisAge, hisHeight, hisWeight;
    double hisWeightKg, hisHeightCm;
    hisName = "Joshua W. Voss";
    hisAge= 17; // not a lie
    hisHeight = 72; // inches
    hisHeightCm = 182.9;
    hisWeight = 145; // lbs
    hisWeightKg = 65.8;
    hisEyes = "Brown";
    hisTeeth = "White";
    hisHair = "Brown";
    
    System.out.println("Let's talk about " + hisName + ".");
    System.out.println("He's " + hisHeight + " inches tall. " + "(or " + hisHeightCm + " cm.)");
    System.out.println("He's " + hisWeight + " pounds heavy " + "(or " + hisWeightKg + " kg.)");
    System.out.println("Actually, that's not too heavy.");
    System.out.println("He's got " + hisEyes + " eyes and " + hisHair + " hair.");
    System.out.println("His teeth are usually " + hisTeeth + " depending on the amount of chocolate he eats");
    System.out.println("If I add " + hisAge + ", " + hisHeight + ", and" + hisWeight + " I get " + (hisAge + hisHeight + hisWeight) + ".");
    }
}
