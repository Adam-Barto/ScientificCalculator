package com.zipcodewilmington.scientificcalculator;

public class ScientificFeatures {

    enum TUnit {DEGREES, RADIANS} //What is the format of the Trig Unit.
    public TUnit current_Unit = TUnit.DEGREES;
    enum Display_Mode {BINARY , OCTAL, DECIMAL, HEX} //What is the format of the Trig Unit.
    public Display_Mode current_Mode = Display_Mode.DECIMAL;
    public static double memory = 0;
    //binary, octal, decimal, hexadecimal

    //public static class DisplayMode {
        public Display_Mode switchDisplayMode() {
            if (current_Mode == Display_Mode.BINARY){
                current_Mode = Display_Mode.OCTAL;
            }else if(current_Mode == Display_Mode.OCTAL){
                current_Mode = Display_Mode.DECIMAL;
            }else if(current_Mode == Display_Mode.DECIMAL) {
                current_Mode = Display_Mode.HEX;
            }else{
                current_Mode = Display_Mode.BINARY;
            }
            return current_Mode;
        }


        public Display_Mode getDisplayMode(){
            return current_Mode;
        }

        public Display_Mode switchDisplayMode(String mode) {
            switch (mode) {
                case "Binary":
                    current_Mode = Display_Mode.BINARY;
                    break;
                case "Octal":
                    current_Mode = Display_Mode.OCTAL;
                    break;
                case "Decimal":
                    current_Mode = Display_Mode.DECIMAL;
                    break;
                case "Hex":
                    current_Mode = Display_Mode.HEX;
                    break;
                default:
                    System.out.println("Error in Setting Display Mode to: " + mode);
                    break;
            }
            return current_Mode;
        }

        private static String convertCalcultion(double value, double number){
            StringBuilder stringB = new StringBuilder();
            while(value >= number) {
                stringB.append(value % number).append(stringB);
                value = value / number;
            }
            stringB.append(value).append(stringB);
            return String.valueOf(stringB);
        }

        public String convert(double value) { //This
            if (current_Mode == Display_Mode.BINARY) {
                return convertCalcultion(value, 2);
            } else if (current_Mode == Display_Mode.OCTAL) {
                return convertCalcultion(value, 8);
            } else if (current_Mode == Display_Mode.HEX) {
                return convertCalcultion(value, 16);
            } else { //DECIMAL
                return String.valueOf(value);
            }

        }
    //} //

    //Memory
    // +M - Add to Memory
    public static void addToMemory(double value){
        memory = value;
    }

    //MC - Clear Memory
    public static void clearMemory(){
        memory = 0;
    }

    //MRC - Memory Recall
    public static double getMemory(){
        return memory;
    }

//Trig
    // - Sine - Calculate the sine of the displayed value and display it
    public static double getSin(double value){
        return Math.sin(value);
    }

    //Cosine - Calculate the cosine of the displayed value and display it
    public static double getCos(double value){
        return Math.cos(value);
    }

    //Tangent - Calculate the tangent of the displayed value and display it
    public static double getTan(double value){
        return Math.tan(value);
    }

    //Inverse
    //Inverse Sine
    public static double getInvSin(double value){
        return Math.asin(value);
    }

    //Inverse Cosine
    public static double getInvCos(double value){
        return Math.acos(value);
    }

    //Inverse Tangent
    public static double getInvTan(double value){
        return Math.atan(value);
    }
//Switch trig unit mode (Degrees, Radians)

    //public static class TrigUnit{

        public TUnit switchUnitsMode(TUnit value) {
            if (current_Unit == TUnit.DEGREES){
                current_Unit = TUnit.RADIANS;
            }else{
                current_Unit = TUnit.DEGREES;
            }
            return current_Unit;
        }
        //should set the trig units to the type given
        public TUnit switchUnitsMode(String mode){
            if (mode.equals("Radians")){
                current_Unit = TUnit.RADIANS;
            }else if (mode.equals("Degrees")){
                current_Unit = TUnit.DEGREES;
            }else {
                System.out.println("Error in Setting Trig Unit to: " + mode);
            }
            return current_Unit;

        }
        //double radians = Math.toRadians(180.0);
        //double degrees = Math.toDegrees(Math.PI);
        public double formatUnitAnswer(double value){
            if (current_Unit == TUnit.DEGREES) {
                return Math.toDegrees(value);
            }else
                return Math.toRadians(value);
        }

    public TUnit getUnitMode(){
        return current_Unit;
    }

   // }




    //Log
    public static double getLog(double value){ //Get common log
        return Math.log10(value);
    }
    //Inverse Logarithm
    public static double invLog(double value){
        return Math.pow(10,value);
    }
    //Natural Log
    public static double getNatLog(double value){
        return Math.log(value);
    }
    //Inverse Natural Log
    public static double getInvNatLog(double value){
        return Math.pow(2,value);
    }

    //Factorial Function

    public static double getFactorial(double value){
        double result = 1;
        for (int i = 1; i <= value ; i++){
            result = result * i;
        }
        return result;
    }
    public static double getPythagoreanTheorem(double a, double b){
        return (Math.sqrt(Math.pow(a,2) + Math.pow(b,2)));
    }
    public static double getCircleFromRadius(double value){
        return Math.PI * Math.pow(value,2);
    }
}
